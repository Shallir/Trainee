package Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class EventHandler implements WebDriverEventListener{

    public void afterChangeValueOf(WebElement arg0, WebDriver arg1) {
        // TODO Auto-generated method stub

        System.out.println("inside method afterChangeValueOf on " + arg0.toString());
    }

    public void afterClickOn(WebElement arg0, WebDriver arg1) {
        // TODO Auto-generated method stub
        System.out.println("inside method afterClickOn on " + arg0.toString());
    }

    public void beforeChangeValueOf(WebElement webElement, WebDriver webDriver, CharSequence[] charSequences) {

    }

    public void afterChangeValueOf(WebElement webElement, WebDriver webDriver, CharSequence[] charSequences) {

    }

    public void afterFindBy(By arg0, WebElement arg1, WebDriver arg2) {
        // TODO Auto-generated method stub
        System.out.println("Clicked element " + arg0.toString());
    }

    public void afterNavigateBack(WebDriver arg0) {
        // TODO Auto-generated method stub

        System.out.println("Inside the after navigateback to " + arg0.getCurrentUrl());
    }

    public void afterNavigateForward(WebDriver arg0) {
        // TODO Auto-generated method stub
        System.out.println("Inside the afterNavigateForward to " + arg0.getCurrentUrl());
    }

    public void beforeNavigateRefresh(WebDriver webDriver) {

    }

    public void afterNavigateRefresh(WebDriver webDriver) {

    }

    public void afterNavigateTo(String arg0, WebDriver arg1) {
        System.out.println("Opened page: " + arg0);
    }

    public void afterScript(String arg0, WebDriver arg1) {
        // TODO Auto-generated method stub
        System.out.println("Inside the afterScript to, Script is " + arg0);
    }

    public void beforeSwitchToWindow(String s, WebDriver webDriver) {

    }

    public void afterSwitchToWindow(String s, WebDriver webDriver) {

    }

    public void beforeChangeValueOf(WebElement arg0, WebDriver arg1) {
        // TODO Auto-generated method stub

        System.out.println("Inside the beforeChangeValueOf method");
    }

    public void beforeClickOn(WebElement arg0, WebDriver arg1) {
        // TODO Auto-generated method stub
        System.out.println("About to click on the " + arg0.toString());

    }

    public void beforeFindBy(By arg0, WebElement arg1, WebDriver arg2) {

        if (arg1 == null) {
            System.out.println("Locating element: " + arg0.toString());

        } else {
            System.out.println("Just before finding element: " + arg0.toString() + " inside " + arg1.toString() + " Web element on browser: " + arg2.toString());
        }
    }

        public void beforeNavigateBack(WebDriver arg0) {
        // TODO Auto-generated method stub
        System.out.println("Just before beforeNavigateBack " + arg0.getCurrentUrl());

    }

    public void beforeNavigateForward(WebDriver arg0) {
        // TODO Auto-generated method stub
        System.out.println("Just before beforeNavigateForward " + arg0.getCurrentUrl());

    }

    public void beforeAlertAccept(WebDriver arg0) {
        // TODO Auto-generated method stub
        System.out.println("Just before Alert " + arg0.getCurrentUrl());
    }

    public void afterAlertAccept(WebDriver webDriver) {

    }

    public void afterAlertDismiss(WebDriver webDriver) {

    }

    public void beforeAlertDismiss(WebDriver webDriver) {

    }

    public void beforeNavigateTo(String arg0, WebDriver arg1) {
        System.out.println("Trying to open page: " + arg0 + " using " + arg1);
    }

    public void beforeScript(String arg0, WebDriver arg1) {
        // TODO Auto-generated method stub
        System.out.println("Just before beforeScript " + arg0);
    }

    public void onException(Throwable arg0, WebDriver arg1) {
        // TODO Auto-generated method stub
        System.out.println("Exception occured at " + arg0.getMessage());

    }

    public <X> void beforeGetScreenshotAs(OutputType<X> outputType) {

    }

    public <X> void afterGetScreenshotAs(OutputType<X> outputType, X x) {

    }

    public void beforeGetText(WebElement webElement, WebDriver webDriver) {

    }

    public void afterGetText(WebElement webElement, WebDriver arg1, String s) {
        // TODO Auto-generated method stub
        System.out.println("Find happened on " + arg1.toString()
                + " Using method " + webElement.toString() + "with value " + s);
    }


}