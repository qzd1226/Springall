import packages.controller.UsersController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.user;


public class test {
    @Test
    public void testInsertUsers(){
        //创建容器并启动
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        //取出UsersController对象
        UsersController usersController = (UsersController) ac.getBean("usersController");
        usersController.insert(new user(100,"aa",25));

    }
}

