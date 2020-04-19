package comm;

/**
 * @author chenyuhao
 * @version 1.0.0
 * @ClassName comm.Comm.java
 * @createTime 2020年04月19日 21:35:00
 * @Description
 */
public class Comm {
    public static void printAndRandomSleep(String name) {
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println(name + " " + i);
                Thread.sleep((long) (Math.random() * 100));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
