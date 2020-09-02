import Driver.Driver;
import Listeners.TestListener;
import PagesMap.SearchPage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListener.class)
public class Test1 {

    private SearchPage page = new SearchPage();
    static ExtentTest test;
    static ExtentReports report;

    @BeforeClass
    public void classLevelSetup() {
        Driver.getInstance();

    }


    @Test(description = "Goggle page search")
    public void GoogleSearch() {
        page.search_page();
        page.searchFor("Wiki");
    }

    @AfterClass
    public void teardown() {
        Driver.eventDriver.quit();
        report.endTest(test);
        report.flush();
    }

}