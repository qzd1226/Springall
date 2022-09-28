package dao;

import pojo.user;
// 数据访问层的实现类
// 将数据插入到数据库中
public class UsersMapperImpl implements UsersMapper{

    @Override
    public int insert(user u) {
        System.out.println(u.getUname() + "用户增加成功!");

        return 1;
    }
}
