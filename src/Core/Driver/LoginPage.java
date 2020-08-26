package Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage {
    public static void Moveto(String in){
        Driver.driver.get(in);
    }
    public static String GogglePage = "https://www.google.com";
    public static WebElement GoggleMail=  Driver.driver.findElement(By.cssSelector("#gbw > div > div > div.gb_qe.gb_i.gb_Pg.gb_Fg > div:nth-child(1) > a"));
    public static WebElement EnterMail = Driver.driver.findElement(By.xpath("//li[2]/a"));
    public static WebElement AddressField = Driver.driver.findElement(By.id("//*[@id=\"identifierId\"]"));

}
