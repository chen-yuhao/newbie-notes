package thread.create;

import comm.Comm;

/**
 * @author chenyuhao
 * @version 1.0.0
 * @ClassName RunnableTest.java
 * @createTime 2020年04月19日 21:28:00
 * @Description 实现runnable 接口创建多线程
 */
public class RunnableTest implements Runnable {
    private String name;

    public RunnableTest(String name) {
        this.name = name;
    }

    // 实现 run 方法
    public void run() {
        Comm.printAndRandomSleep(this.name);
    }

    public static void main(String[] args) {
        new Thread(new RunnableTest("t1")).start();
        new Thread(new RunnableTest("t2")).start();
    }
}
