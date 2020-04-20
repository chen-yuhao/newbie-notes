package template.prime;

/**
 * @author chenyuhao
 * @version 1.0.0
 * @ClassName PrimeNum.java
 * @createTime 2020年04月19日 22:41:00
 * @Description 获取素数表
 * 一个数如果只能被1或者它自身整除，称为素数
 */
public class PrimeNum {

    public static final int N = 1000000;
    public static final int M = 300000;
    // 标记数组，记录是否为素数
    public static int[] is = new int[N];
    // 存素数的数组
    public static int[] prm = new int[M];

    static {
        for (int i = 0; i < is.length; i++) is[i] = 1;
    }

    // 基本筛选法
    public static int getPrime() {
        int e = (int) Math.sqrt(N) + 1, k = 0, i;
        prm[k++] = 2;
        is[0] = is[1] = 0;
        // 偶数置为非素数
        for (i = 4; i < N; i += 2) is[i] = 0;
        // 排除奇数的非素数
        for (i = 3; i < e; i += 2) {
            if (is[i] == 1) {
                prm[k++] = i;
                for (int s = i + i, j = i * i; j < N; j += s) is[j] = 0;
            }
        }
        for (; i < N; i += 2)
            if (is[i] == 1) prm[k++] = i;
        return k;
    }

    public static void main(String[] args){
        int k = getPrime();
        System.out.println(k);
        for(int i =0;i<k;i++){
            System.out.printf(prm[i]+" ");
        }
        System.out.println();
    }
}
