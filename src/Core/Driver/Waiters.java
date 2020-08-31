package Driver;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Driver.ConstantVariable.*;

// TODO ожидания, все виды ошибок, принимающие Webelement и By, Возвращать Webdriver Wait
// TODO игнорящие Exceptions NoSuchElementException, NullReference, NoSuchElementException ElementNotVisibleException ElementNotSelectableException

public class Waiters {

    public static WebElement waiting_visibility (WebElement elem) {
        try {
            WebDriverWait wait = new WebDriverWait(Driver.eventDriver, visibilityTimeout);
            wait.until(ExpectedConditions.visibilityOf(elem));
        } catch (NoSuchElementException|ElementNotVisibleException|ElementNotSelectableException ignored) {}
        return elem;
    }

    public static By waiting_visibility  (By elem) {
        try {
        WebDriverWait wait = new WebDriverWait (Driver.eventDriver, visibilityTimeout);
        wait.until(ExpectedConditions.visibilityOfElementLocated(elem));
        } catch (NoSuchElementException|ElementNotVisibleException|ElementNotSelectableException ignored) {}
        return elem;
    }

    public static WebElement waiting_selectability (WebElement elem) {
        try{
        WebDriverWait wait = new WebDriverWait (Driver.eventDriver, selectabilityTimeout);
        wait.until(ExpectedConditions.elementToBeSelected(elem));
        } catch (NoSuchElementException|ElementNotVisibleException|ElementNotSelectableException ignored) {}
        return elem;
    }

    public static By waiting_selectability (By elem){
        try{
        WebDriverWait wait = new WebDriverWait (Driver.eventDriver, selectabilityTimeout);
        wait.until(ExpectedConditions.elementToBeSelected(elem));
        } catch (NoSuchElementException|ElementNotVisibleException|ElementNotSelectableException ignored) {}
        return elem;
    }

    public static WebElement waiting_clicability (WebElement elem){
        try{
        WebDriverWait wait = new WebDriverWait (Driver.eventDriver, clicabilityTimeout);
        wait.until(ExpectedConditions.elementToBeSelected(elem));
        } catch (NoSuchElementException|ElementNotVisibleException|ElementNotSelectableException ignored) {}
        return elem;
    }

    public static By waiting_clicability (By elem) {
        try{
        WebDriverWait wait = new WebDriverWait (Driver.eventDriver, clicabilityTimeout);
        wait.until(ExpectedConditions.elementToBeSelected(elem));
        } catch (NoSuchElementException|ElementNotVisibleException|ElementNotSelectableException ignored) {}
        return elem;
    }

    //other waiters
}
