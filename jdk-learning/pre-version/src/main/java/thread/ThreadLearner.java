package thread;

import org.junit.Test;

/**
 * @author chenyuhao
 * @version 1.0.0
 * @ClassName ThreadLearner.java
 * @Description TODO
 * @createTime 2020年04月16日 11:48:00
 */
public class ThreadLearner extends Thread {
    public static String name;
    public ThreadLearner(String name){
        this.name = name;
    }
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i++);
            try {
                Thread.sleep((long)(Math.random()*1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args){
        new ThreadLearner("t1").start();
        new ThreadLearner("t2").start();
    }
}
