package s03;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("school")
public class SubSchool extends School{
    @Value("清华附小")
    private  String name;
    @Value("海淀小区")
    private String address;

    public SubSchool() {
        System.out.println("这是School子类的无参构造方法");
    }

    @Override
    public String toString() {
        return "SubSchool{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
