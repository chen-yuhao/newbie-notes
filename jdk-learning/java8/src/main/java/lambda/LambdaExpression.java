package lambda;

import org.junit.Test;

import java.util.*;
import java.util.function.Consumer;

/**
 * @author chenyuhao
 * @version 1.0.0
 * @ClassName LambdaExpression.java
 * @Description Lambda 表达式，也可称为闭包，它是推动 Java 8 发布的最重要新特性。
 * Lambda 允许把函数作为一个方法的参数（函数作为参数传递进方法中）。
 * https://www.runoob.com/java/java8-lambda-expressions.html
 * @createTime 2020年04月15日 09:08:00
 */

/**
 * 左侧：参数列表
 * 右侧：lambda体，表达式执行功能
 * <p>
 * 语法一 无参数 无返回值
 * () -> System.out.println("hello");
 * <p>
 * 语法二 有参数 无返回值
 * (x) -> System.out.println(x);
 * <p>
 * 语法三 有一个参数小括号可以不写
 * x-> System.out.println(x)
 * <p>
 * 语法四 两个以上参数，多条语句
 * Comparator<Integer> com = (x,y)->{
 * System.out.println("函数接口");
 * return Integer.compare(x, y);
 * }
 * <p>
 * 语法五 lambda体只有一条语句，return 和大括号可以不写
 * Comparator<Integer> com = (x,y)-> Integer.compare(x, y);
 * <p>
 * 语法六 lambda 表达式参数列表数据类型可以忽略，JVM编译器可以通过上下文推断数据类型，即“类型推断”
 * (Integer x, Integer y) -> Integer.compare(x,y);
 * <p>
 * lambda 表达式需要函数式支持
 */
public class LambdaExpression {
    public long fibonacci(int n) {
        if (n == 0 || n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    @Test
    // 无参数 无返回值
    // () -> System.out.println("hello");
    public void testLamda() {
        int num = 0;// 对于匿名内部方法，是隐式final的，只读
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println(num);
            }
        };
        Runnable r2 = () -> System.out.println("hello");

        r1.run();
        r2.run();
    }

    @Test
    // 有参数 无返回值
    // (x)-> System.out.println(x)
    // 只有一个参数小括号可以不写
    // x-> System.out.println(x)
    public void testConsume() {
        Consumer<String> con = (x) -> System.out.println(x);
        con.accept("流弊");
        con.accept("流弊2");
    }

    @Test
    // 两个以上参数，多条语句
    /**
     * (x,y)->{
     *
     * }
     */
    public void testMul() {
        Comparator<Integer> com = (x, y) -> {
            System.out.println("函数接口");
            return Integer.compare(x, y);
        };
    }

    public void testMul_2() {
        Comparator<Integer> com = (x, y) -> Integer.compare(x, y);
//        Comparator<Integer> com = Integer::compare;
    }

    // 运算
    @Test
    public void test6() {
        Integer num = operation(100, (x) -> x * x);
        System.out.println(num);
        System.out.println(operation(200, (y) -> y + y));
    }

    public Integer operation(Integer num, MyPredicate mf) {
        return mf.getVal(num);
    }

}
