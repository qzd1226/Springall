package org.example.pojo2;

public class Student {
    private String name;
    private  int age;
    private  School school;

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

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(){
        System.out.println("学生的无参构造方法");
    }
}
