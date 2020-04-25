package sort.quickSort;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName Partition.java
 * @Description 递归实现
 * @createTime 2020年04月10日 08:34:00
 */
public class Partition {
    private static int Partition(int[] arr, int start, int end) {
        //arr[start]为挖的第一个坑
        int key = arr[start];
        while (start < end) {
            while (arr[end] >= key && end > start)
                end--;
            arr[start] = arr[end];
            while (arr[start] <= key && end > start)
                start++;
            arr[end] = arr[start];
        }
        arr[start] = key;
        return start;
    }
    public static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int index = Partition(arr, start, end);
            quickSort(arr, start, index - 1);
            quickSort(arr, index + 1, end);
        }
    }
}
