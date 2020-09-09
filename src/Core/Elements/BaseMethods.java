package Elements;

import Driver.Driver;
import Driver.Reports;
import Driver.Waiters;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class BaseMethods {
    private static WebDriver driver = Driver.driver_here();
    private static Waiters wait = new Waiters();
    Actions builder = new Actions(driver);
    ExtentTest test = Reports.start_report().createTest("ExtentReport", "s");

    public List <WebElement> elem_list (By elementLocation){
        List <WebElement> list = driver.findElements(wait.mass_visibility(elementLocation));
        System.out.println(list.size());
        return list;
    }

    public void list_object_verification (By elements_list, By elem){
        List <WebElement> list = driver.findElements(wait.mass_visibility(elements_list));
        if (list.contains(elem))
        {
            test.log(Status.FAIL, "Файлы не одинаковы");
            Assert.assertEquals(list.contains(elem), true, "объекта " + elem + " нет");
        }
        else {
            test.log(Status.PASS, "Файлы одинаковы");
            Assert.assertEquals(list.contains(elem), true, "объект " + elem + " есть");
        }
    }

    public void open_page (String url){
            driver.navigate().to(url);
    }

    public void get_logo_picture (String picture, String to){
        File f= new File(to);
        URL myUrl = null;
        try {
            myUrl = new URL(picture);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        try {
            FileUtils.copyURLToFile(myUrl, f);
        } catch (IOException e) {
            e.printStackTrace();
        }
        test.log(Status.INFO, "Get picture"+ picture);
    }

    public void compare_files(String adr1, String adr2){
        long val1 = new File(adr1).length();
        long val2 = new File(adr2).length();

        if (val1 != val2)
        {
            test.log(Status.FAIL, "Файлы не одинаковы");
            Assert.assertEquals(val1, val2, "Файлы не одинаковы");
        }
        else {
            test.log(Status.PASS, "Файлы одинаковы");
            Assert.assertEquals(val1, val2, "Файлы одинаковы");
        }
    }

    public String getPageName (){
        String page = driver.getCurrentUrl();
        return page;
    }

    public int get_width (By elementLocation) {
        int width = driver.findElement(wait.visibility(elementLocation)).getSize().width;
        test.log(Status.INFO, "Read element "+ elementLocation.toString() + "width: " + width);
        return width;
    }

    public int get_width (WebElement elementLocation) {
        int width = wait.visibility(elementLocation).getSize().width;
        test.log(Status.INFO, "Read element "+ elementLocation.toString() + "width: " + width);
        return width;
    }

    public int get_height (By elementLocation) {
        int height = driver.findElement(wait.visibility(elementLocation)).getSize().height;
        test.log(Status.INFO, "Read element "+ elementLocation.toString() + "width: " + height);
        return height;
    }

    public int get_height (WebElement elementLocation) {
        int height = wait.visibility(elementLocation).getSize().height;
        test.log(Status.INFO, "Read element "+ elementLocation.toString() + "width: " + height);
        return height;
    }

    public void hover(By elementLocation) {
        builder.moveToElement(driver.findElement(elementLocation)).perform();
        test.log(Status.INFO  , "Hover over: "+ elementLocation.toString());
    }

    public void hover(WebElement elementLocation) {
        builder.moveToElement(elementLocation).perform();
        test.log(Status.INFO, "Hover over: "+ elementLocation.toString());
    }

    public void click(By elementLocation) {
        driver.findElement(wait.clicability(elementLocation)).click();
        test.log(Status.INFO  , "Click specified element:  "+ elementLocation.toString());
    }

    public void click(WebElement elementLocation) {
        wait.clicability(elementLocation).click();
        test.log(Status.INFO, "Click specified element:  "+ elementLocation.toString());
    }

    //Write Text
    public void write_text(By elementLocation, String text) {
        click(elementLocation);
        driver.findElement(wait.clicability(elementLocation)).sendKeys(text);
        driver.findElement(elementLocation).submit();
        test.log(Status.INFO, "In the field: "+ elementLocation.toString() +" searching for: " + text);
    }

    public void write_text(WebElement elementLocation, String text) {
        click(wait.clicability(elementLocation));
        wait.clicability(elementLocation).sendKeys(text);
        elementLocation.submit();
        test.log(Status.INFO, "In the field: "+ elementLocation.toString() +" searching for: " + text);
    }


    //Read Text
    public String readText(By elementLocation) {
        String text =  driver.findElement(wait.clicability(elementLocation)).getText();
        test.log(Status.INFO, "From the field: "+ elementLocation.toString() +" read text: " + text);
        return text;
    }

    public String readText(WebElement elementLocation) {
        String text = wait.clicability(elementLocation).getText();
        test.log(Status.INFO, "From the field: "+ elementLocation.toString() +" read text: " + text);
        return text;
    }

    public void assertion (boolean val1, boolean val2){
        if (val1 != val2)
        {
            test.log(Status.FAIL, "Не содержит искомого значения");
            Assert.assertEquals(val1, val2, "Не содержит искомого значения");
        }
        else {
            test.log(Status.PASS, "Cодержит искомоe значениe");
            Assert.assertEquals(val1, val2, "Cодержит искомоe значениe");
        }
    }


}