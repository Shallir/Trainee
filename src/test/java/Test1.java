import Pages.LoginPage;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test1 {
    @BeforeClass
    public void setup() {
        Driver.initilize();

    }

    @Test
    public void openUrl() throws InterruptedException {
        EventFiringWebDriver eventDriver = new EventFiringWebDriver(Driver.driver);
        EventHandler handler = new EventHandler();
        eventDriver.register(handler);
        eventDriver.get(LoginPage.GogglePage);
        Thread.sleep(3000);
    }

    @AfterClass
    public void tearDown() {
        Driver.quit();
    }
}