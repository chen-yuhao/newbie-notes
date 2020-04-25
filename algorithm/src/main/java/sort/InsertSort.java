package sort;

/**
 * @author chenyuhao
 * @date 2019-07-15 17:17
 * @description
 **/
public class InsertSort {

    public static int[] sort(int[] arr){
        if (arr.length <= 0){
            return arr;
        }
        int[] arr1 = new int[arr.length];
        arr1[0] = arr[0];
        int t;
        for(int i=1;i<arr.length;i++){
            arr1[i] = arr[i];
            if(arr[i] > arr1[i-1]) continue;
            for(int j = i;j>0;j--){
                if(arr1[j]<arr1[j-1]){
                    t = arr1[j-1];
                    arr1[j-1] = arr1[j];
                    arr1[j] = t;
                }
            }
        }
        return arr1;
    }
    public static void printAll(int[] arr){
        for (int i :arr){
            System.out.printf(" %d",i);
        }
        System.out.println();
    }

    public static void main(String... args){
        int[] arr = {11,1,3,9,12,4,10,5,7,8};
//        sort(arr);
        printAll(arr);
        printAll(sort(arr));
    }
}
