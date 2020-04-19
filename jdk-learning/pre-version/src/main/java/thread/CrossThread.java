package thread;

/**
 * @author chenyuhao
 * @version 1.0.0
 * @ClassName CrossThread.java
 * @Description 两线程交叉执行
 * @createTime 2020年04月16日 21:16:00
 */
public class CrossThread {
    public static void main(String[] args) {
        final Object lock = new Object();
        // print odd
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 50; i += 2) {
                    synchronized (lock) {
                        System.out.println("t1 " + i);
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });

        // print even
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                for (int i = 1; i < 50; i += 2) {
                    synchronized (lock) {
                        System.out.println("t2 " + i);
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });

        t1.start();
        t2.start();
    }
}

