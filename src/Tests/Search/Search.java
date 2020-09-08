import Driver.Driver;
import Driver.*;
import Pages.SearchPage;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.*;

import static Driver.Reports.end_test;
import static Driver.Reports.start_test;

public class Search {

    private SearchPage Gpage = new SearchPage();

    private String example_text = "Wiki";
    private String example_text_Fail = "NotWiki";
    private String example_double = "11.11";
//
    @BeforeClass
    private void classLevelSetup() {
        Driver.driver_here();
        Reports.start_report();
    }
    @BeforeTest
    private void s_test(){
        start_test();
    }

    @Epic(value = "поиск")
    @Feature(value = "базовый поиск")
    @Story(value = "поиск текстовых значений")
    @Test(description = "Одно слово")
    public void GoogleSearcTextPass() {
        Gpage.search_page();
        Gpage.searchFor(example_text);
        Gpage.check_search(example_text);
    }

    @Epic(value = "поиск")
    @Feature(value = "базовый поиск")
    @Story(value = "поиск текстовых значений")
    @Test(description = "Одно слово негативный")
    public void GoogleSearchTextFail() {
        Gpage.search_page();
        Gpage.searchFor(example_text);
        Gpage.check_search(example_text_Fail);
    }
    @Epic(value = "поиск")
    @Feature(value = "базовый поиск")
    @Story(value = "поиск числовых значений")
    @Test(description = "Число позитивный")
    public void GoogleSearchNumberPass() {
        Gpage.search_page();
        Gpage.searchFor(example_double);
        Gpage.check_search(example_double);
    }
    @AfterTest
    private void e_test(){
        end_test();
    }
    @AfterClass
    private void teardown() {
        Driver.quit();
    }
}