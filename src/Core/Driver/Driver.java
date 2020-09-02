package Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ThreadGuard;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class Driver
{

    public static WebDriver driver=null;
    public static EventFiringWebDriver eventDriver=null;

    private static void handler(){
        eventDriver = new EventFiringWebDriver(driver);
        EventHandler handler = new EventHandler(){};
        eventDriver.register(handler);
    };

    private static WebDriver starter(){

        if(ConstantVariable.browserName.equalsIgnoreCase("Chrome"))
        {
            System.setProperty("webdriver.chrome.driver", "D:\\Project\\TraineeFramework\\src\\resources\\chromedriver.exe");
            driver= ThreadGuard.protect(new ChromeDriver());
            handler();
        }
        else if(ConstantVariable.browserName.equalsIgnoreCase("Firefox"))
        {
            System.setProperty("webdriver.gecko.driver", "D:\\Project\\TraineeFramework\\src\\resources\\geckodriver.exe");
            driver= ThreadGuard.protect(new FirefoxDriver());
            handler();
        }
        //Perform Basic Operations
        eventDriver.manage().window().maximize();
        eventDriver.manage().deleteAllCookies();
        return driver;
    }

    public static synchronized void getInstance()
    {
        //Use Of Singleton and Initilize webDriver
        if(driver == null)
        {
            starter();
        }
    }

    public static void quit()
    {
        eventDriver.quit();
        eventDriver=null; // we destroy the driver object after quit operation
    }
    public static void close()
    {
        eventDriver.close();
        eventDriver=null;  // we destroy the driver object after quit operation
    }
}