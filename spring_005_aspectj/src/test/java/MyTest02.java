import com.s02.SomeServices;
import com.s02.Student;
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
        // String返回结果不能被切面修改

        Student stu = someServices.change();
        System.out.println("业务返回的stu" + stu.toString());
        // 如果业务方法的返回值是引用类型，切面方法可以对其修改

    }

}
