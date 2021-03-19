import com.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoTest extends BaseTest{

    @BeforeMethod
    public void setUp(){
        browserSetup();
        getTestUrl();
    }

    @Test
    public void demoTest() {
        System.out.println("Demo test is successful.");
    }
}
