package thread.create;

import comm.Comm;
import org.junit.Test;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author chenyuhao
 * @version 1.0.0
 * @ClassName ThreadPoolTest.java
 * @createTime 2020年04月19日 21:28:00
 * @Description 线程池创建多线程
 * 线程池有4种
 * newCachedThreadPool创建一个可缓存线程池，如果线程池长度超过处理需要，可灵活回收空闲线程，若无可回收，则新建线程。
 * newFixedThreadPool 创建一个定长线程池，可控制线程最大并发数，超出的线程会在队列中等待。
 * newScheduledThreadPool 创建一个定长线程池，支持定时及周期性任务执行。
 * newSingleThreadExecutor 创建一个单线程化的线程池，它只会用唯一的工作线程来执行任务，保证所有任务按照指定顺序(FIFO, LIFO, 优先级)执行。
 */
public class ThreadPoolTest {

    public static void testCacheTP() {
        ExecutorService cacheThreadPool = Executors.newCachedThreadPool();
        cacheThreadPool.execute(new Runnable() {
            public void run() {
                Comm.printAndRandomSleep("t1");
            }
        });
        cacheThreadPool.execute(new Runnable() {
            public void run() {
                Comm.printAndRandomSleep("t2");
            }
        });
        // 关闭线程池
        cacheThreadPool.shutdown();
    }

    public static void testFixedTP(){

    }

    public static void main(String[] args) {
        testCacheTP();
    }
}
