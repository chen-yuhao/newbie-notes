package lambda;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * @author chenyuhao
 * @version 1.0.0
 * @ClassName LambdaApi.java
 * @createTime 2020年04月16日 09:31:00
 * @Description lambda 内置接口
 * Consumer<T> 消费型接口
 * void accept(T t);
 * Supplier<T> 供给型接口
 * T get();
 * Function<T, R> 函数型接口
 * R apply(T t);
 * Predicate<T> 断言型接口
 * boolean test(T t);
 */
public class LambdaApi {
    @Test
    public void test1() {
        happy(10000, x -> System.out.println("每次消费" + x + "元"));
    }

    public void happy(double money, Consumer<Double> con) {
        con.accept(money);
    }

    // 产生一些证书，并放入集合
    @Test
    public void test2() {
        List<Integer> list = getNumList(10,()->(int) (Math.random()*100));
        for(Integer i: list){
            System.out.println(i);
        }
    }

    public List<Integer> getNumList(int num, Supplier<Integer> sup) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            list.add(i);
        }
        return list;
    }
}
