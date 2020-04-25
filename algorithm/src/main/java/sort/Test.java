package sort;

/**
 * @author chenyuhao
 * @date 2019-12-10 9:58
 * @description
 **/
public class Test {

    public static void printArr(int[] arr){
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static int[] BubbleSort(int[] arr){
        if(arr.length == 0){
            return arr;
        }
        for(int i = 0;i<arr.length;i++){
            for(int j =0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
        }
        return arr;
    }

    public static int Partition(int[] arr,int start,int end){
        int key = arr[start];
        while(start < end){
            while(arr[end] >= key && end > start){
                end--;
            }
            arr[start] = arr[end];
            while(arr[start] <= key && end > start){
                start++;
            }
            arr[end] = arr[start];
        }
        arr[start] = key;
        return start;
    }





    public static void main(String... args) {
        int[][] testData = new int[][]{
                {},
                {1},
                {1,2,3,4,5},
                {1,2,3,4,5,6},
                {5,4,3,2,1},
                {6,5,4,3,2,1},
                {1,1},
                {1,4,6,7,11,4,6},
        };
        for(int[] data : testData){
            Test.BubbleSort(data);
            printArr(data);
        }
//        int[] testData = new int[]{5,4,3,2,1};
//        while(true){
//            System.out.println("1");
//        }
    }
}


