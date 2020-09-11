package Driver;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Arrays;
import java.util.Collection;

import static Driver.ConstantVariable.visibilityTimeout;


public class Waiters {
    private static WebDriver driver = Driver.driver_here();
    private static WebDriverWait wait = new WebDriverWait(Driver.driver_here(), visibilityTimeout);
    private static Collection ignored_exeptions = Arrays.asList(
            NoSuchElementException.class,
            ElementNotVisibleException.class,
            ElementNotSelectableException.class);

    public By mass_visibility  (By elem) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elem));
        wait.ignoreAll(ignored_exeptions);
        return elem;
    }
    public WebElement mass_visibility (WebElement elem) {
        wait.until(ExpectedConditions.visibilityOfAllElements(elem));
        wait.ignoreAll(ignored_exeptions);
        return elem;
    }

    public By visibility  (By elem) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(elem));
        wait.ignoreAll(ignored_exeptions);
        return elem;
    }

    public WebElement visibility (WebElement elem) {
        wait.until(ExpectedConditions.visibilityOf(elem));
        wait.ignoreAll(ignored_exeptions);
        return elem;
    }
    public WebElement waiting_selectability (WebElement elem) {
        wait.until(ExpectedConditions.elementToBeSelected(elem));
        wait.ignoreAll(ignored_exeptions);
        return elem;
    }

    public By waiting_selectability (By elem){
        wait.until(ExpectedConditions.elementToBeClickable(elem));
        wait.ignoreAll(ignored_exeptions);
        return elem;
    }

    public WebElement clicability (WebElement elem){
        wait.until(ExpectedConditions.elementToBeClickable(elem));
        wait.ignoreAll(ignored_exeptions);
        return elem;
    }

    public WebElement clicability (By elem) {
        wait.until(ExpectedConditions.elementToBeClickable(elem));
        wait.ignoreAll(ignored_exeptions);
        WebElement new_elem = driver.findElement(elem);
        return new_elem;
    }

    //other waiters
}
