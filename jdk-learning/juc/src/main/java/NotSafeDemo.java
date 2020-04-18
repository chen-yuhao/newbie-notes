import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author chenyuhao
 * @version 1.0.0
 * @ClassName NotSafeDemo.java
 * @Description
 *  故障 java.util.ConcurrentModificationException
 * @createTime 2020年04月17日 08:10:00
 */
public class NotSafeDemo {
    public static void test1() {
        List<String> list = new ArrayList<>();
        List<String> list1 = Collections.synchronizedList(new ArrayList<>());
        List<String> list2 = new Vector<>();
        // 写时复制，采用读写分离技术
        List<String> list3 = new CopyOnWriteArrayList();
        for (int i = 0; i < 15; i++) {
            new Thread(() -> {
                list.add(UUID.randomUUID().toString().substring(0,8));
                System.out.println(list);
            }, String.valueOf(i)).start();
        }
    }

    public static void main(String[] args) {
        test1();
    }
}
