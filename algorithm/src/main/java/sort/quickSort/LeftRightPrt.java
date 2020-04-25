package sort.quickSort;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName LeftRightPrt.java
 * @Description 左右指针快排
 * @createTime 2020年03月14日 09:14:00
 */
public class LeftRightPrt {
    public static void swap(int[] arr, int a, int b) {
        int t = arr[a];
        arr[a] = arr[b];
        arr[b] = t;
    }

    public static int[] quickSort(int[] arrs) {
        quickSort(arrs, 0, arrs.length-1);
        return arrs;
    }

    public static void quickSort(int[] arrs, int left, int right) {
        if (left >= right) {
            return;
        }
        int l = left;
        int r = right;
        int target = arrs[l];

        while (l < r) {
            while (arrs[r] >= target && l < r) {
                r--;
            }
            while (arrs[l] <= target && l < r) {
                l++;
            }
            if (l < r) {
                swap(arrs, l, r);
            }
        }

        if (l != left) {
            swap(arrs, l, left);
        }

        quickSort(arrs, left, l - 1);
        quickSort(arrs, l + 1, right);
    }
}
