package thread.create;

import comm.Comm;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author chenyuhao
 * @version 1.0.0
 * @ClassName CallableTest.java
 * @createTime 2020年04月19日 21:28:00
 * @Description 实现Callable接口创建多线程
 */
public class CallableTest implements Callable {
    private String name;

    public CallableTest(String name) {
        this.name = name;
    }

    public String call() throws Exception {
        Comm.printAndRandomSleep(this.name);
        return "获取任务"+this.name+"返回结果";
    }

    public static void main(String[] args) {
        FutureTask<String> futureTask1 = new FutureTask<String>(new CallableTest("t1"));
        FutureTask<String> futureTask2 = new FutureTask<String>(new CallableTest("t2"));
        new Thread(futureTask1).start();
        new Thread(futureTask2).start();
        try {
            System.out.println(futureTask1.get());
            System.out.println(futureTask2.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
