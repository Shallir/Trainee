import Driver.Driver;
import Driver.Reports;
import Pages.SearchPage;
import org.apache.log4j.PropertyConfigurator;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

//@Listeners(TestListener.class)
public class Suite1 {



    private SearchPage Gpage = new SearchPage();
//
    @BeforeClass
    public void classLevelSetup() {
       Reports.start_report();
       Reports.start_test("First test");
       String log4jConfPath = "src/resources/log4j.properties";
       PropertyConfigurator.configure(log4jConfPath);
    }

    @Test(description = "Goggle page search")
    public void GoogleSearch() {
        Gpage.search_page();
        Gpage.searchFor();
        Assert.assertEquals(Gpage.page().contains("Wiki"), true);
    }
//
    @AfterClass public void teardown() {
        Driver.quit();
        Reports.end_test("First test");
        Reports.end_report();
    }
}