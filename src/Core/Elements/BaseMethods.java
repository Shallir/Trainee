package Elements;

import Driver.Driver;
import Driver.Waiters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BaseMethods {
    //Click Method
    private static WebDriver driver = Driver.driver_here();

    public  void click(By elementLocation) {
        Waiters.waiting_clicability(driver.findElement(elementLocation)).click();
    }

    public  void click(WebElement elementLocation) {
        Waiters.waiting_clicability(elementLocation).click();
    }

    public  boolean is_visible (By elementLocation) {
        boolean el;
        el = Waiters.waiting_visibility(driver.findElement(elementLocation)).isDisplayed();
        return el;
    }
    //Write Text
    public void write_text(By elementLocation, String text) {
        click(elementLocation);
        Waiters.waiting_clicability(driver.findElement(elementLocation)).sendKeys(text);
        driver.findElement(elementLocation).submit();
    }
    public void write_text(WebElement elementLocation, String text) {
        Waiters.waiting_clicability(elementLocation).click();
        Waiters.waiting_clicability(elementLocation).sendKeys(text);
        Waiters.waiting_clicability(elementLocation).submit();
    }

    //Read Text
    public  String readText(By elementLocation) {
        String text = Waiters.waiting_selectability(driver.findElement(elementLocation)).getText();
        return text;
    }
}