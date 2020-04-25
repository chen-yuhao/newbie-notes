package sort;

import java.util.Arrays;

/**
 * @author chenyuhao
 * @date 2019-12-09 10:11
 * @description
 **/
public class SortUtils {

    /**
     * 冒泡排序 O(n^2)，每一轮能得到一个数组最右有序的数值
     *
     * @return
     */
    public static int[] BubbleSort(int[] array) {
        int tmp;
        if (array.length == 0) {
            return array;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        return array;
    }

    /**
     * 选择排序 O(n^2),稳定
     *
     * @return
     */
    public static int[] SelectionSort(int[] array) {
        if (array.length == 0)
            return array;
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[minIndex]) //找到最小的数
                    minIndex = j; //将最小数的索引保存
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
        return array;
    }


    /**
     * 插入排序，每一轮能将一个未排序的插入已排序中
     */
    public static int[] InsertionSort(int[] array) {
        if (array.length == 0) {
            return array;
        }
        int current;
        for (int i = 0; i < array.length - 1; i++) {
            current = array[i + 1];
            int preIndex = i;
            while (preIndex >= 0 && array[preIndex] > current) {
                array[preIndex + 1] = array[preIndex];
                preIndex--;
            }
            // preIndex+1
            array[preIndex + 1] = current;
        }
        return array;
    }

    /**
     * 希尔排序 O(nlog2n)
     *
     * @param array
     * @return
     */
    public static int[] ShellSort(int[] array) {
        int len = array.length;
        int tmp, gap = len / 2;
        while (gap > 0) {
            // todo 为啥 从gap到 len-1
            for (int i = gap; i < len; i++) {
                tmp = array[i];
                int preIndex = i - gap;
                while (preIndex >= 0 && array[preIndex] > tmp) {
                    array[preIndex + gap] = array[preIndex];
                    preIndex -= gap;
                }
                array[preIndex + gap] = tmp;
            }
            gap /= 2;
        }
        return array;
    }

    /**
     * 归并排序 O(n)
     *
     * @param array
     * @return
     */
    public static int[] MergeSort(int[] array) {
        if (array.length < 2) return array;
        int mid = array.length / 2;
        int[] left = Arrays.copyOfRange(array, 0, mid);
        int[] right = Arrays.copyOfRange(array, mid, array.length);
        return Merge(MergeSort(left), MergeSort(right));
    }

    /**
     * 归并排序——将两段排序好的数组结合成一个排序数组
     *
     * @param left
     * @param right
     * @return
     */
    public static int[] Merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        for (int i = 0, li = 0, ri = 0; i < result.length; i++) {
            if (li >= left.length) {
                result[i] = right[ri++];
            } else if (ri >= right.length) {
                result[i] = left[li++];
            } else {
                result[i] = left[li] > right[ri] ? left[li++] : right[ri++];
            }
        }
        return result;
    }

    public static void swap(int[] arr, int a, int b) {
        int t = arr[a];
        arr[a] = arr[b];
        arr[b] = t;
    }


    public static int[] quickSort(int[] array) {
        if (array.length <= 1) {
            return array;
        }
        int pivot = array[0]; // or random
        int left = 0;
        int right = array.length - 1;
//        int tmp;
        int ii = 0;
        while (left < right) {
            System.out.printf("%d: \n", ii++);
            printArr(array);
            if (array[right] < pivot) {

            }
        }
        array[left] = pivot;
        int[] leftSort = quickSort(Arrays.copyOfRange(array, 0, left));
        int[] rightSort = quickSort(Arrays.copyOfRange(array, left, array.length));
        int[] ans = new int[array.length];
        int i = 0;
        for (int num : leftSort) {
            ans[i++] = num;
        }
        for (int num : rightSort) {
            ans[i++] = num;
        }
        return ans;
    }


    public static int[] generateTestarray() {
        int size = new Double(Math.random() * 50).intValue();
        int[] array = new int[size];
        return array;
    }

    public static void printArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String... args) {
//        int[] arr = new int[]{1, 2};
//        System.out.println(arr[0] + " " + arr[1]);
//        swap(arr,0, 1);
        int a =1,b=2;
//        System.out.println(arr[0] + " " + arr[1]);
    }
}
