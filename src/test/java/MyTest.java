import org.aspectj.lang.annotation.After;
import org.junit.Before;
import org.junit.Test;

public class MyTest {
    /**
     * 执行测试方法前执行
     */
    @Before
    public void before() {
        System.out.println("执行 before() 方法");
    }



    @Test
    public void testSayHi() {
        System.out.println("Hi Log4j");
    }

    @Test
    public void testSayHello() {
        System.out.println("Hello Log4j");
    }
}
