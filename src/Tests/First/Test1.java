import Driver.Driver;
import PagesMap.LoginPage;
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
        LoginPage.search_page();
        LoginPage.searchFor("Wiki");

    }

    @AfterClass
    public void tearDown() {
        Driver.quit();
    }
}