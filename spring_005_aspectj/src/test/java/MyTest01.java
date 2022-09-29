import com.s01.SomeServices;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest01 {
    @Test
    public void test01(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("s01/applicationContext.xml");
        //取出代理对象
        SomeServices someServices = (SomeServices) ac.getBean("someService");
        System.out.println(someServices.getClass());
        String s = someServices.doSome("张三",22);
        System.out.println(s);
        someServices.show();
    }
}
