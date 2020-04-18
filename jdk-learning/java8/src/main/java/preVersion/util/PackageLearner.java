package preVersion.util;

/**
 * @author chenyuhao
 * @version 1.0.0
 * @ClassName PackageLearner.java
 * @Description 包装类和基本数据类型
 * @createTime 2020年04月15日 19:15:00
 */
public class PackageLearner {
    public void testByte(){

        byte a =2;
        byte b =3;
//        a = a+b; // a+b 会转为int 编译不通过
        a += b; // += 会自动强制转换，自动装箱
//        byte a1 =128; // 超出byte范围 -128到127
        byte a1 =127;
        byte b1 =127;
        a1 += b1;
        System.out.println(a1);
    }

    public void testInt(){
        Integer i01=59;
        int i02=59;
        Integer i03=Integer.valueOf(59);
        Integer i04=new Integer(59);
        System.out.println(i01 == i02);
        System.out.println(i01 == i03);
        System.out.println(i03 == i04);
        System.out.println(i02 == i04);
    }

    public static void main(String[] args){
        PackageLearner learner = new PackageLearner();
        learner.testByte();
    }
}
