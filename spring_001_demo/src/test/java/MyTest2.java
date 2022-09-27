import org.example.pojo2.School;
import org.example.pojo2.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.rmi.StubNotFoundException;

public class MyTest2 {
    @Test
    public void test2(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("/school/applicationContext.xml");
        School school = (School) ac.getBean("school");
        System.out.println(school);
        Student stu = (Student) ac.getBean("stu");
        System.out.println(stu);

    }
}
