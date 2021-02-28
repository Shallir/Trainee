package Driver;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ThreadGuard;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class Driver
{

    private static WebDriver driver=null;
    private static EventFiringWebDriver eventDriver=null;

    private static void handler(){
        eventDriver = new EventFiringWebDriver(driver);
        EventHandler handler = new EventHandler(){};
        eventDriver.register(handler);
        PropertyConfigurator.configure("src/resources/log4j.properties");
    }

    private static WebDriver starter(){

        if(ConstantVariable.browserName.equalsIgnoreCase("Chrome"))
        {
            System.setProperty("webdriver.chrome.driver", "D:\\Project\\TraineeFramework\\src\\resources\\chromedriver.exe");
            driver= ThreadGuard.protect(new ChromeDriver());
            driver.manage().window().setSize(ConstantVariable.d);
            handler();
        }
        else if(ConstantVariable.browserName.equalsIgnoreCase("Firefox"))
        {
            System.setProperty("webdriver.gecko.driver", "D:\\Project\\TraineeFramework\\src\\resources\\geckodriver.exe");
            driver= ThreadGuard.protect(new FirefoxDriver());
            handler();
        }
        //Perform Basic Operations
        eventDriver.manage().deleteAllCookies();
        return eventDriver;
    }

    public static synchronized WebDriver driver_here()
    {
        if(driver == null)
        {
            driver = starter();
        }
        return eventDriver;
    }

    public static void quit()
    {
        Reports.end_report();
        eventDriver.quit();
        eventDriver=null; // we destroy the driver object after quit operation
    }
    public static void close()
    {
        Reports.end_report();
        eventDriver.close();
        eventDriver=null;  // we destroy the driver object after quit operation
    }
}