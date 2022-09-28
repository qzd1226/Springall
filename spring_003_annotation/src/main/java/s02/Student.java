package s02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
    @Value("李四")
    private  String name;
    @Value("19")
    private  int age;
    @Autowired
    @Qualifier("school") //按名称注入
    //会自动从spring bean 工厂中找到school 对象
    private School school;

    public Student() {
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public School getSchool() {
        return school;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }
}
