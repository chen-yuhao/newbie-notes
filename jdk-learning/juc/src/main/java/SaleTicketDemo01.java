import org.junit.Test;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author chenyuhao
 * @version 1.0.0
 * @ClassName SaleTicketDemo01.java
 * @Description
 * @createTime 2020年04月16日 21:34:00
 */
class Ticket {
    private int number = 1000;
    Lock lock = new ReentrantLock();

    public synchronized void sale() {
        lock.lock();
        try {
            if (number > 0) {
                System.out.println(Thread.currentThread().getName() + "  " + (number--) + " 张票");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }
}

class SaleThread extends Thread {
    private Ticket ticket;

    public SaleThread(Ticket ticket) {
        this.ticket = ticket;
    }

    public void run() {
        while (true) {
            this.ticket.sale();
            try {
                Thread.sleep((long) (Math.random() * 100));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class SaleTicketDemo01 {

    // 三个售票员 卖出 30 张票
    public static void saleTicketTest1() { // 主线程
        Ticket ticket = new Ticket();
        Thread t1 = new SaleThread(ticket);
        Thread t2 = new SaleThread(ticket);
        Thread t3 = new SaleThread(ticket);
        t1.start();
        t2.start();
        t3.start();
    }

    public static void saleTicketTest2() { // 主线程
        final Ticket ticket = new Ticket();
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                while (true) {
                    ticket.sale();
                }
            }
        }, "A");
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                while (true) {
                    ticket.sale();
                }
            }
        }, "B");
        Thread t3 = new Thread(new Runnable() {
            public void run() {
                while (true) {
                    ticket.sale();
                }
            }
        }, "C");
        t1.start();
        t2.start();
        t3.start();
    }

    public static void saleTicketTest3() { // 主线程
        final Ticket ticket = new Ticket();
        new Thread(() -> {
            while (true) {
                ticket.sale();
            }
        }, "A").start();
        new Thread(() -> {
            while (true) {
                ticket.sale();
            }
        }, "B").start();
        new Thread(() -> {
            while (true) {
                ticket.sale();
            }
        }, "C").start();
    }

    public static void main(String[] args) {
        saleTicketTest3();
    }
}
