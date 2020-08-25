import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test1 {
    @BeforeClass
    public void setup() {
        Driver.getInstance();
    }

    @Test
    public void RunGoogle() {
        Driver.driver.navigate().to(LoginPage.GogglePage);
    }

    @AfterClass
    public void tearDown() {
        Driver.quit();
    }
}