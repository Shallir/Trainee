package Driver;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import static Driver.Driver.eventDriver;

public class Waiter {
    public static By waitFor(By elem) {
        Wait<WebDriver> wait = new FluentWait<WebDriver>(eventDriver)
                .ignoring(NoSuchElementException.class);
        try{
            wait.until(ExpectedConditions.visibilityOfElementLocated(elem));
        }

        catch(TimeoutException e) {
            e.printStackTrace();
        }
        return elem;
    }
    public static WebElement waitFor(WebElement elem) {
        Wait<WebDriver> wait = new FluentWait<WebDriver>(eventDriver)
                .ignoring(NoSuchElementException.class);
        try{
                    wait.until(ExpectedConditions.visibilityOf(elem));
            }

        catch(TimeoutException e) {
            e.printStackTrace();
        }
        return elem;
    }

    public static WebElement waitFor(WebElement elem, String waitType, long waitInSeconds ) {

        Wait<WebDriver> wait = new FluentWait<WebDriver>(eventDriver)
                .ignoring(NoSuchElementException.class);

        try{
            switch(waitType)
            {
                case "elementToBeClickable":
                    wait.until(ExpectedConditions.elementToBeClickable(elem));
                    break;
                case "visibilityOf":
                    wait.until(ExpectedConditions.visibilityOf(elem));
                    break;
                case "elementToBeSelected":
                    wait.until(ExpectedConditions.elementToBeSelected(elem));
                    break;
                default:
                    wait.until(ExpectedConditions.visibilityOf(elem));
                    break;
            }
        }
        catch(TimeoutException e) {
            e.printStackTrace();
        }
        return elem;
    }
    public static By waitFor(By elem, String waitType, long waitInSeconds ) {

        Wait<WebDriver> wait = new FluentWait<WebDriver>(eventDriver)
                .ignoring(NoSuchElementException.class);

        try{
            switch(waitType)
            {
                case "elementToBeClickable":
                    wait.until(ExpectedConditions.elementToBeClickable(elem));
                    break;
                case "visibilityOf":
                    wait.until(ExpectedConditions.visibilityOfElementLocated(elem));
                    break;
                case "elementToBeSelected":
                    wait.until(ExpectedConditions.elementToBeSelected(elem));
                    break;
                default:
                    wait.until(ExpectedConditions.visibilityOfElementLocated(elem));
                    break;
            }
        }
        catch(TimeoutException e) {
            e.printStackTrace();
        }
        return elem;
    }
}
