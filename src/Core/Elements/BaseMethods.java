package Elements;

import Driver.Driver;
import Driver.Waiters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BaseMethods {
    //Click Method

    public  void click(By elementLocation) {
        Waiters.waiting_clicability(Driver.eventDriver.findElement(elementLocation)).click();
    }

    public  void click(WebElement elementLocation) {
        Waiters.waiting_clicability(elementLocation).click();
    }

    public  boolean is_visible (By elementLocation) {
        boolean el;
        el = Waiters.waiting_visibility(Driver.eventDriver.findElement(elementLocation)).isDisplayed();
        return el;
    }
    //Write Text
    public void write_text(By elementLocation, String text) {
        click(elementLocation);
        Waiters.waiting_selectability(Driver.eventDriver.findElement(elementLocation)).sendKeys(text);
        Driver.eventDriver.findElement(elementLocation).submit();
    }
    public void write_text(WebElement elementLocation, String text) {
        Waiters.waiting_selectability(elementLocation).click();
        Waiters.waiting_selectability(elementLocation).sendKeys(text);
        Waiters.waiting_selectability(elementLocation).submit();
    }

    //Read Text
    public  String readText(By elementLocation) {
        String text = Waiters.waiting_selectability(Driver.eventDriver.findElement(elementLocation)).getText();
        return text;
    }
}