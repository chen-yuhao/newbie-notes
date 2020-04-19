package thread.create;

import comm.Comm;

/**
 * @author chenyuhao
 * @version 1.0.0
 * @ClassName ThreadTest.java
 * @createTime 2020年04月19日 21:28:00
 * @Description 继承Thread类创建多线程
 */
public class ThreadTest extends Thread {

    private String name;

    public ThreadTest(String name) {
        this.name = name;
    }

    // 重写 run 方法
    public void run() {
        Comm.printAndRandomSleep(this.name);
    }

    public static void main(String[] args) {
        // 必须使用start()方法启动才是多线程
        new ThreadTest("t1").start();
        new ThreadTest("t2").start();
        // 下面的是错误方式
//        new ThreadTest("t1").run();
//        new ThreadTest("t2").run();
    }
}
