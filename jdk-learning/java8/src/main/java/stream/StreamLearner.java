package stream;

import lambda.Employee;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author chenyuhao
 * @version 1.0.0
 * @ClassName StreamLearner.java
 * @Description TODO
 * @createTime 2020年04月16日 10:32:00
 */
public class StreamLearner {

    @Test
    public void test1() {
        // 1. stream() parallelStream()
        List<String> list = new ArrayList<>();
        Stream<String> stream1 = list.stream();

        // 2 通过Arrays 中静态方法 stream() 获取数组
        Employee[] emps = new Employee[10];
        Stream<Employee> stream2 = Arrays.stream(emps);

        // 3
//        Stream<String> stream3 =


    }
}
