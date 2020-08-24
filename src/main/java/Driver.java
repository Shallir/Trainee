import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class Driver
{
    public static WebDriver driver=null;
    public static void initilize()
    {
        //Use Of Singleton Concept and Initilize webDriver
        if(driver == null)
        {
            if(ConstantVariable.browserName.equalsIgnoreCase("Chrome"))
            {
                System.setProperty("webdriver.chrome.driver", "D:\\Project\\TraineeFramework\\src\\main\\resources\\chromedriver.exe");
                driver=new ChromeDriver();

            }
            else if(ConstantVariable.browserName.equalsIgnoreCase("Firefox"))
            {
                System.setProperty("webdriver.gecko.driver", "D:\\Project\\TraineeFramework\\src\\main\\resources\\geckodriver.exe");
                driver=new FirefoxDriver();

            }
        }

        //Perform Basic Operations
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
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
    public  static void openurl(String URL)
    {
        driver.get(URL);
    }
}