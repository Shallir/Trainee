import Driver.Driver;
import Driver.Reports;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.*;

import static Driver.Reports.end_test;
import static Driver.Reports.start_test;

public class Coffee {

    private Pages.Coffee basePage = new Pages.Coffee();

    private String search_for_1 = "Кофе с медом";

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

    @Epic(value = "Кофе")
    @Feature(value = "Поиск")
    @Story(value = "С добавками")
    @Test(description = "с медом")
    public void WithHoney() {
        basePage.open_base_page();
        basePage.searchFor(search_for_1);
        basePage.select_result();
        basePage.select_fat();
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