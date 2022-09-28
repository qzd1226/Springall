package controller;
import dao.UsersMapperImpl;
import pojo.user;
import service.UsersService;
import service.impl.UsersServiceImpl;
//界面层

public class UsersController {
    //如何访问业务逻辑层
    //接口指向实现类
    public UsersService usersService = new UsersServiceImpl();

    //界面层的功能实现，对外提供访问的功能
    public int insert(user u){
        return usersService.insert(u);
    }
}
