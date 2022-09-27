import org.example.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test(){
        Student stu = new Student();
        System.out.println(stu);
    }
    @Test
    public void testSprinng(){
        // create object by spring

        //如果想从spring 容器取中对象，则需要先创建容器对象并启动才可以取对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student stu = (Student) ac.getBean("stu");
        System.out.println(stu);
    }
}
