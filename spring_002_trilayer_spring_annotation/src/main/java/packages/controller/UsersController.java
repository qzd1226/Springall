package packages.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import pojo.user;
import packages.service.UsersService;

//界面层
@Controller // 交给spring 创建控制器对象
public class UsersController {
    //如何访问业务逻辑层
    //接口指向实现类
    @Autowired
    public UsersService usersService;// = new UsersServiceImpl();
    //界面层的功能实现，对外提供访问的功能
    public int insert(user u){
        return usersService.insert(u);
    }
}
