import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//指定当前测试类在spring的测试环境中执行,此时就可以通过注入的方式直接获取IOC容器中的bean
@RunWith(SpringJUnit4ClassRunner.class)
//设置当前spring测试环境的配置文件
@ContextConfiguration("classpath:spring-jdbc.xml")
public class JdbcTemplateTest {
    @Autowired
    //自动装配 (JdbcTemplate只有一个对象)
    private JdbcTemplate jdbcTemplate;
    @Test
    public void testInsert(){
        String sql = "insert into users values(?,?,?)";
        jdbcTemplate.update("use ssm");
        jdbcTemplate.update(sql,11,"qzd","1234");
    }
}
