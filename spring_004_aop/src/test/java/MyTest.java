import com.proxy2.BookServiceImpl;
import com.proxy2.SubBookServiceImpl;
import org.junit.Test;

public class MyTest {
    @Test
    public void test02(){
        BookServiceImpl bookService = new SubBookServiceImpl();
        bookService.buy();
    }
}
