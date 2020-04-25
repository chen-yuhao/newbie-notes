package sort.quickSort;

import java.util.Arrays;
import java.util.Stack;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName Stack.java
 * @Description 非递归方式
 * @createTime 2020年04月10日 08:34:00
 */
public class NonRec {
    // start和end为前闭后闭
    private static void nonRec_quickSort(int[] a, int start, int end) {
        // 用栈模拟
        Stack<Integer> stack = new Stack<>();
        if (start < end) {
            stack.push(end);
            stack.push(start);
            while (!stack.isEmpty()) {
                int l = stack.pop();
                int r = stack.pop();
                int index = partition(a, l, r);
                if (l < index - 1) {
                    stack.push(index - 1);
                    stack.push(l);
                }
                if (r > index + 1) {
                    stack.push(r);
                    stack.push(index + 1);
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
    private static int partition(int[] a, int start, int end) {
        int pivot = a[start];
        while (start < end) {
            while (start < end && a[end] >= pivot)
                end--;
            a[start] = a[end];
            while (start < end && a[start] <= pivot)
                start++;
            a[end] = a[start];
        }
        a[start] = pivot;
        return start;
    }
}
