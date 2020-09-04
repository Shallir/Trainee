package Driver;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Arrays;
import java.util.Collection;

import static Driver.ConstantVariable.visibilityTimeout;

// TODO ожидания, все виды ошибок, принимающие Webelement и By, Возвращать Webdriver Wait Webdriver exeptions
// TODO игнорящие Exceptions NoSuchElementException, NullReference, NoSuchElementException ElementNotVisibleException ElementNotSelectableException

public class Waiters {

    private static  WebDriver driver = Driver.driver_here();
    private static WebDriverWait wait = new WebDriverWait(driver, visibilityTimeout);
    private static Collection ignored_exeptions = Arrays.asList(
            NoSuchElementException.class,
            ElementNotVisibleException.class,
            ElementNotSelectableException.class);

    public static WebElement waiting_visibility (WebElement elem) {
            wait.until(ExpectedConditions.visibilityOf(elem));
            wait.ignoreAll(ignored_exeptions);
        return elem;
    }

    public static By waiting_visibility  (By elem) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(elem));
        wait.ignoreAll(ignored_exeptions);
            return elem;
    }

    public static WebElement waiting_selectability (WebElement elem) {
        wait.until(ExpectedConditions.elementToBeClickable(elem));
        wait.ignoreAll(ignored_exeptions);
        return elem;
    }

    public static By waiting_selectability (By elem){
        wait.until(ExpectedConditions.elementToBeClickable(elem));
        wait.ignoreAll(ignored_exeptions);
        return elem;
    }

    public static WebElement waiting_clicability (WebElement elem){
        wait.until(ExpectedConditions.elementToBeClickable(elem));
        wait.ignoreAll(ignored_exeptions);
        return elem;
    }

    public static By waiting_clicability (By elem) {
        wait.until(ExpectedConditions.elementToBeSelected(elem));
        wait.ignoreAll(ignored_exeptions);
        return elem;
    }

    //other waiters
}
