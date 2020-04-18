package singleton;

/**
 * @author chenyuhao
 * @version 1.0.0
 * @ClassName Singleton.java
 * @createTime 2020年04月16日 12:42:00
 * @Description 单例模式
 */
public class Singleton {
    private static volatile Singleton instance;

    private Singleton() {
    }

    public Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
