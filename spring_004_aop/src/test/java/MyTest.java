import com.proxy2.BookServiceImpl;
import com.proxy2.SubBookServiceImpl;
import com.proxy3.Agent;
import com.proxy3.Service;
import com.proxy4.LogAop;
import org.junit.Test;

public class MyTest {
    @Test
    public void test02(){
        BookServiceImpl bookService = new SubBookServiceImpl();
        bookService.buy();
    }
    @Test
    public void test03(){
        Service agent = new Agent(new com.proxy3.BookServiceImpl());
        agent.buy();
        Service agent2 = new Agent(new com.proxy3.ProductServiceImpl());
        agent2.buy();
    }

    @Test
    public void test04(){
        com.proxy4.Service agent = new com.proxy4.Agent(new com.proxy4.TrabsAop(), new com.proxy4.BookServiceImpl());
        //切入多个切面的功能
        com.proxy4.Service agent1 = new com.proxy4.Agent(new LogAop(),agent);
        agent1.buy();
        System.out.println("------------------------------");
        com.proxy4.Service agent2 = new com.proxy4.Agent(new com.proxy4.LogAop(), new com.proxy4.ProductServiceImpl());
        agent2.buy();
    }
}
