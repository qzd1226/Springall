import controller.UsersController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.user;


public class test {
    @Test
    public void testInsertUsers(){
        //创建容器并启动
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        //取出对象
        UsersController usersController = (UsersController) ac.getBean("uController");
        //测试功能
        int num = usersController.insert(new user(100,"qzd",22));

    }
}

