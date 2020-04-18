package lambda;

import lambda.LambdaExpression;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * @author chenyuhao
 * @version 1.0.0
 * @ClassName lambda.LambdaExpressionTest.java
 * @Description TODO
 * @createTime 2020年04月15日 09:11:00
 */
public class LambdaExpressionTest {
    @Test
    public void testFibonacci(){
        LambdaExpression le = new LambdaExpression();
        assertEquals(1, le.fibonacci(0));
        assertEquals(1, le.fibonacci(1));
        assertEquals(2, le.fibonacci(2));
        assertEquals(3, le.fibonacci(3));
        assertEquals(5, le.fibonacci(4));
    }
}
