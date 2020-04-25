package sort;

/**
 * @author chenyuhao
 * @date 2019-12-09 13:26
 * @description
 **/
public class MySortUtils {

    // todo 未验证！每次选一个没排好序的，进行排序, 插入到
    public static int[] playCardSort(int[] arr) {
        if (arr.length == 0) {
            return arr;
        }
        int tmp;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i + 1]) {
                for (int j = i; j < arr.length - 1; j++) {
                    if (arr[j + 1] > arr[j]) {
                        tmp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = tmp;
                    }
                }
            }
        }
        return arr;
    }

    public static int[] insertionSort(int[] arr) {
        if (arr.length == 0) {
            return arr;
        }
        int tmp;
        for (int i = 1; i < arr.length; i++) {
            int j = i - 1;
            while (arr[i] > arr[j]) {
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                j--;
            }
        }
        return arr;
    }

    // 插入排序，每一轮能将一个未排序的插入已排序中
    public static int[] insertionSort1(int[] arr) {
        if (arr.length == 0) {
            return arr;
        }
        int tmp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j >= 0; j--) {
                if (arr[i] > arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }else{
                    break;
                }
            }
        }
        return arr;
    }

    public static int[] shellSort(int[] arr) {
        if (arr.length == 0) {
            return arr;
        }
        int gap = arr.length / 2;
        int tmp;
        while (gap > 0) {
            for (int i = 0; i < arr.length / gap; i++) {
                if (arr[i] > arr[i + gap]) {
                    tmp = arr[i];
                    arr[i] = arr[i + gap];
                    arr[i + gap] = tmp;
                }
            }
            gap/=2;
        }
        return arr;
    }

}
