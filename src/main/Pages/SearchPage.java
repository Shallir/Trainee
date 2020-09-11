package Pages;

import Driver.Driver;
import Elements.BaseMethods;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {

    private String google= "http://www.google.com/";
    private By search_field = By.name("q");


    private static WebDriver driver = Driver.driver_here();
    BaseMethods actions =new BaseMethods();


        @Step ("Access site")
        public void search_page(){
            driver.get(google);
        }

        @Step("Use search to find text")
        public void searchFor(String value) {
            actions.write_text(driver.findElement(search_field), value);
        }

}
