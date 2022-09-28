import com.proxy2.BookServiceImpl;
import com.proxy2.SubBookServiceImpl;
import com.proxy3.Agent;
import com.proxy3.Service;
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
}
