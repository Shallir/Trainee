package Elements;

import Driver.Driver;
import org.openqa.selenium.WebElement;

public class BaseMethods {
    public static void open_page (String el){
        Driver.eventDriver.get(el);
    }
    public static void click (WebElement el){
        el.click();
    }
}
