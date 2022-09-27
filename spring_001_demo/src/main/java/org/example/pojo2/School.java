package org.example.pojo2;

public class School {
    private  String name;
    private  String addr;

    public School(){
        System.out.println("The default constructor of school");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", addr='" + addr + '\'' +
                '}';
    }
}
