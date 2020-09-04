package Pages;

import Driver.Driver;
import Driver.Reports;
import Elements.BaseMethods;
import com.relevantcodes.extentreports.LogStatus;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {

    private String google= "http://www.google.com/";
    private String text = "Wiki";
    private static  WebDriver driver = Driver.driver_here();

    BaseMethods actions =new BaseMethods();


        @Step ("Access site")
        public void search_page(){ driver.get(google);
        Reports.test.log(LogStatus.INFO, "Navigated to the specified URL "+ google);
        }

        @Step("Use search to find text")
        public void searchFor() {
            actions.write_text(driver.findElement(By.name("q")), text);
            Reports.test.log(LogStatus.INFO, "Search for keyword: Wiki");
        }

        @Step("Proved search")
            public String page (){
            String page = driver.getCurrentUrl();
            if (page == "Wiki"){
                Reports.test.log(LogStatus.PASS, "Search for keyword: Wiki success");
            }else{
                Reports.test.log(LogStatus.FAIL, "Search for keyword: Wiki failed");
            }
            return page;

        }

}
