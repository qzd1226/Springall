package org.example.pojo;

public class Student {
    private String name;
    private  int age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
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
