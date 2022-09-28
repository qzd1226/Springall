import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import s01.Student;

public class MyTest {
    @Test
    public void test01(){
        //创建容器对象并启用
        ApplicationContext ac = new ClassPathXmlApplicationContext("s01/applicationContext.xml");
        //无参数的构造方法被调用 说明object被创建
        Student stu = (Student) ac.getBean("student"); //创建的对象默认名称是雷鸣的驼峰命名法，也可以指定对象的名称
        System.out.println(stu);
    }

    @Test
    public void test02(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("s02/applicationContext.xml");
        s02.Student stu = (s02.Student)ac.getBean("student");
        System.out.println(stu);
    }

    @Test
    public void test03(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("s03/applicationContext.xml");
        s03.Student stu = (s03.Student)ac.getBean("student");
        System.out.println(stu);
    }
}
