package packages.service.impl;

import org.springframework.stereotype.Service;
import packages.dao.UsersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import pojo.user;
import packages.service.UsersService;

//业务逻辑层的实现类
@Service //交给spring 创建业务逻辑层对象
public class UsersServiceImpl implements UsersService {

    //在所有的业务逻辑层中都必定有数据访问层的对象
    @Autowired
    private UsersMapper usersMapper; // = new UsersMapperImpl();

    @Override
    public int insert(user u) {
        // 添加更复杂的业务，现在没有复杂的业务
        return usersMapper.insert(u);
    }
}
