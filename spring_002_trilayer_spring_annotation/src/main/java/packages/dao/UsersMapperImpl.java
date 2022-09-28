package packages.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import pojo.user;

// 数据访问层的实现类
// 将数据插入到数据库中
@Repository //就是交给Spring框架去创建数字访问层的对象
public class UsersMapperImpl implements UsersMapper{

    @Override
    public int insert(user u) {
        System.out.println(u.getUname() + "用户增加成功!");

        return 1;
    }
}
