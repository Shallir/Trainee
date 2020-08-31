package PagesMap;

import Driver.Waiter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Driver.Driver.eventDriver;

public class LoginPage {

    public  static void search_page(){
        eventDriver.get("http://www.google.com/");}

    public static void searchFor(String text) {
        WebElement search = Waiter.waitFor(eventDriver.findElement(By.name("q")));
        search.sendKeys(text);
        search.submit();
    }
}
