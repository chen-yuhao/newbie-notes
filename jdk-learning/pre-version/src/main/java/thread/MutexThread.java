package thread;

/**
 * @author chenyuhao
 * @version 1.0.0
 * @ClassName CrossThread.java
 * @Description TODO
 * @createTime 2020年04月16日 12:45:00
 */
public class MutexThread {
    // runnable 方法获取对象锁，需要声明为静态或者final才行，先初始化才能获取得到
    public static Object obj = new Object();

    public static void main(String[] args) {

        Thread t1 = new Thread(new Runnable() {
            public void run() {
                while (true) {
                    synchronized (obj) {
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        for (int i = 0; i < 3; i++) {
                            System.out.println("t1 " + i);
//                            try {
//                                Thread.sleep((long) (Math.random() * 500));
//                            } catch (InterruptedException e) {
//                                e.printStackTrace();
//                            }
                        }
                    }
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                while (true) {
                    synchronized (obj) {
                        for (int i = 0; i < 3; i++) {
                            System.out.println("t2 " + i);
//                            try {
//                                Thread.sleep((long) (Math.random() * 500));
//                            } catch (InterruptedException e) {
//                                e.printStackTrace();
//                            }
                        }
                        obj.notify();
                    }
                }
            }
        });

        t1.start();
        t2.start();
    }
}
