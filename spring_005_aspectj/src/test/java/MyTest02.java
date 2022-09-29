import com.s02.SomeServices;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest02 {
    @Test
    public void test01(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("s02/applicationContext.xml");
        //取出代理对象
        SomeServices someServices = (SomeServices) ac.getBean("someService");
        System.out.println(someServices.getClass());
        String s = someServices.doSome("张三",22);
        System.out.println(s);
    }

}
