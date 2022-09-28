package service.impl;

import dao.UsersMapper;
import dao.UsersMapperImpl;
import pojo.user;
import service.UsersService;

//业务逻辑层的实现类
public class UsersServiceImpl implements UsersService {

    //在所有的业务逻辑层中都必定有数据访问层的对象
    private UsersMapper usersMapper; // = new UsersMapperImpl();

    // 交给spring去依赖注入 必须提供set()方法


    public void setUsersMapper(UsersMapper usersMapper) {
        this.usersMapper = usersMapper;
    }

    @Override
    public int insert(user u) {
        // 添加更复杂的业务，现在没有复杂的业务
        return usersMapper.insert(u);
    }
}
