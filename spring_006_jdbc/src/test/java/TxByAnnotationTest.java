import com.controller.BookController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 声明式事务的配置步骤
 *  1、在spring 的配置文件中配置事务管理器
 *  2、开启事务的注解驱动
 *  只需要在需要被事务管理的方法上添加 @Transactional注解，该方法就会被事务管理
 * @Transactional标识的位置:
 * 1、标识在方法上
 * 2、标识在类上，则类中的所有方法都会被事务管理
 *
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:tx-annotation.xml")
public class TxByAnnotationTest {

    @Autowired
    private BookController bookController;

    @Test
    public void testBuyBook(){
        bookController.buyBook(1,1 );
    }

}
