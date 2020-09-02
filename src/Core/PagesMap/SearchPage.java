package PagesMap;

import Driver.Waiters;
import Elements.BaseMethods;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Driver.Driver.eventDriver;

public class SearchPage {

    BaseMethods actions =new BaseMethods();

        @Step
    public void search_page(){
        eventDriver.get("http://www.google.com/");}

        @Step
    public void searchFor(String text) {
        WebElement search = Waiters.waiting_visibility(eventDriver.findElement(By.name("q")));
        actions.write_text(search, "Wiki");
    }

}
