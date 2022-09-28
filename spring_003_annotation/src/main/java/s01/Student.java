package s01;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component // 交给spring 去创建对象,就是在容器启动时创建
public class Student {
    @Value("张三")
    private String name;
    @Value("18")
    private  int age;

    public Student() {
        System.out.println("学生对象的无参构造方法.....");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
