package preVersion.util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author chenyuhao
 * @version 1.0.0
 * @ClassName ListLearner.java
 * @Description TODO
 * @createTime 2020年04月15日 18:38:00
 */
public class ListLearner {
    public void testAddLinkedListAndArrayList() {
        List<Integer> alist = new ArrayList<Integer>();
        List<Integer> blist = new LinkedList<Integer>();
        long t1 = System.currentTimeMillis();
        for (int i = 0; i < 500000; i++) {
            alist.add(0, i); // t2-t1: 24233 ms, t3-t2: 21 ms
//            alist.add(i); // t2-t1: 25 ms, t3-t2: 23 ms
        }
        long t2 = System.currentTimeMillis();
        for (int i = 0; i < 500000; i++) {
            blist.add(0, i);
//            blist.add(i);
        }
        long t3 = System.currentTimeMillis();
        System.out.printf("t2-t1: %d ms, t3-t2: %d ms \n", t2 - t1, t3 - t2);
    }

    public void testFindLinkedListAndArrayList() {
        List<Integer> alist = new ArrayList<Integer>();
        List<Integer> blist = new LinkedList<Integer>();
        for (int i = 0; i < 5000000; i++) {
            alist.add(i); // t2-t1: 25 ms, t3-t2: 23 ms
        }
        for (int i = 0; i < 5000000; i++) {
            blist.add(i);
        }
        long t1 = System.currentTimeMillis();
        alist.get(3000000);// t2-t1: 0 ms, t3-t2: 12 ms
        long t2 = System.currentTimeMillis();
        blist.get(3000000);
        long t3 = System.currentTimeMillis();
        System.out.printf("t2-t1: %d ms, t3-t2: %d ms \n", t2 - t1, t3 - t2);
    }

    public static void main(String[] args){
//        new ListLearner().testAddLinkedListAndArrayList();
        new ListLearner().testFindLinkedListAndArrayList();
    }
}
