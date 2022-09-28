package s02;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class School { // 此时School 创建的对象的名称是school
    @Value("WU")
    private String name;
    @Value("US")
    private String addr;

    public School() {
        System.out.println("school无参数构造方法");
    }

    public String getName() {
        return name;
    }

    public String getAddr() {
        return addr;
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
