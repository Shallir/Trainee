package Elements;

import Driver.Driver;
import Driver.Reports;
import Driver.Waiters;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class BaseMethods {
    private static WebDriver driver = Driver.driver_here();
    ExtentTest test = Reports.start_report().createTest("ExtentReport", "s"); ;

    public void click(By elementLocation) {
        Waiters.waiting_clicability(driver.findElement(elementLocation)).click();
        test.log(Status.INFO  , "Click specified element:  "+ elementLocation.toString());
    }

    public void click(WebElement elementLocation) {
        Waiters.waiting_clicability(elementLocation).click();
        test.log(Status.INFO, "Click specified element:  "+ elementLocation.toString());
    }

    //Write Text
    public void write_text(By elementLocation, String text) {
        click(elementLocation);
        Waiters.waiting_clicability(driver.findElement(elementLocation)).sendKeys(text);
        driver.findElement(elementLocation).submit();
        test.log(Status.INFO, "In the field: "+ elementLocation.toString() +" searching for: " + text);
    }

    public void write_text(WebElement elementLocation, String text) {
        click(elementLocation);
        Waiters.waiting_clicability(elementLocation).sendKeys(text);
        elementLocation.submit();
        test.log(Status.INFO, "In the field: "+ elementLocation.toString() +" searching for: " + text);
    }

    //Read Text
    public String readText(By elementLocation) {
        String text = Waiters.waiting_clicability(driver.findElement(elementLocation)).getText();
        test.log(Status.INFO, "From the field: "+ elementLocation.toString() +" read text: " + text);
        return text;
    }

    public String readText(WebElement elementLocation) {
        String text = Waiters.waiting_clicability(elementLocation).getText();
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