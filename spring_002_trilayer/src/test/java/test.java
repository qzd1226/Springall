import controller.UsersController;
import org.junit.Test;
import pojo.user;


public class test {
    @Test
    public void testInsertUsers(){
        //创建界面层的对象
        UsersController usersController = new UsersController();
        int num = usersController.insert(new user(100,"qzd",22));
        System.out.println(num);
    }
}

