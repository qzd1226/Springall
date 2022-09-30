import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pojo.User;

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
        jdbcTemplate.update(sql,1,"mh0","4567");
    }
    @Test
    public void getUserById(){
        String sql = "select * from users where userid = ?";
        User user = jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<>(User.class),1);
        System.out.println(user);
    }
}
