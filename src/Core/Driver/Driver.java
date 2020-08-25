import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ThreadGuard;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.util.concurrent.TimeUnit;

public class Driver
{
    public static WebDriver driver=null;

    private static WebDriver starter(){
        if(ConstantVariable.browserName.equalsIgnoreCase("Chrome"))
        {
            System.setProperty("webdriver.chrome.driver", "D:\\Project\\TraineeFramework\\src\\resources\\chromedriver.exe");
            driver= ThreadGuard.protect(new ChromeDriver());
        }
        else if(ConstantVariable.browserName.equalsIgnoreCase("Firefox"))
        {
            System.setProperty("webdriver.gecko.driver", "D:\\Project\\TraineeFramework\\src\\resources\\geckodriver.exe");
            driver= ThreadGuard.protect(new FirefoxDriver());

        }
        return driver;
    }

    public static synchronized void getInstance()
    {
        //Use Of Singleton and Initilize webDriver
        if(driver == null)
        {
            starter();
        }
        //Perform Basic Operations
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        EventFiringWebDriver eventDriver = new EventFiringWebDriver(driver);
        EventHandler handler = new EventHandler(){};
        eventDriver.register(handler);
        driver.manage().timeouts().implicitlyWait(ConstantVariable.implicitlyWait, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(ConstantVariable.pageLoadTimeout, TimeUnit.SECONDS);

    }

    public static void quit()
    {
        driver.quit();
        driver=null; // we destroy the driver object after quit operation
    }
    public static void close()
    {
        driver.close();
        driver=null;  // we destroy the driver object after quit operation
    }
}