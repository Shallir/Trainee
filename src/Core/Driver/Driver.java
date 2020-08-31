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

    private static WebDriver starter(){
        if(ConstantVariable.browserName.equalsIgnoreCase("Chrome"))
        {
            System.setProperty("webdriver.chrome.driver", "D:\\Project\\TraineeFramework\\src\\resources\\chromedriver.exe");
            driver= ThreadGuard.protect(new ChromeDriver());
            eventDriver = new EventFiringWebDriver(driver);
            EventHandler handler = new EventHandler(){};
            eventDriver.register(handler);
        }
        else if(ConstantVariable.browserName.equalsIgnoreCase("Firefox"))
        {
            System.setProperty("webdriver.gecko.driver", "D:\\Project\\TraineeFramework\\src\\resources\\geckodriver.exe");
            driver= ThreadGuard.protect(new FirefoxDriver());
            eventDriver = new EventFiringWebDriver(driver);
            EventHandler handler = new EventHandler(){};
            eventDriver.register(handler);
        }
        //Perform Basic Operations
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        //driver.manage().timeouts().pageLoadTimeout(pageLoadTimeout, TimeUnit.SECONDS); //ожидание загрузки страницы
        //driver.manage().timeouts().setScriptTimeout(pagescriptstimeout, TimeUnit.SECONDS); //ожидание отработки скриптов
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
        driver.quit();
        driver=null; // we destroy the driver object after quit operation
    }
    public static void close()
    {
        driver.close();
        driver=null;  // we destroy the driver object after quit operation
    }
}