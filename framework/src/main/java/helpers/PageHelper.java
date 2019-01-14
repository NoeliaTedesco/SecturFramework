package helpers;

import static base.Base.driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static base.BasePage.wait;
import java.util.Set;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.support.ui.ExpectedCondition;


public class PageHelper {

    public static void ScrollingToElement(WebElement element) {
        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].scrollIntoView(true)", element);
    }

    public static void WaitForPageLoading() throws InterruptedException {
        Boolean r = false;
        int ite = 0;
        while (ite <= 15) {
            r = wait.until(new ExpectedCondition<Boolean>() {
                public Boolean apply(WebDriver driver) {
                    JavascriptExecutor js = (JavascriptExecutor) driver;
                    return (Boolean) js
                            .executeScript("return document.readyState")
                            .toString().equals("complete");
                }
            });
            ite++;
        }
    }

    public static void deleteAllCookies(WebDriver driver) {
        driver.manage().deleteAllCookies();
    }

    public static void deleteCookie(WebDriver driver, Cookie cookie) {
        driver.manage().deleteCookie(cookie);
    }

    public static void addCookies(WebDriver driver, Cookie cookie) {
        driver.manage().addCookie(cookie);
    }

    public static Cookie getCookieByName(WebDriver driver, String cookie) {
        return driver.manage().getCookieNamed(cookie);
    }

    public static Set<Cookie> getCookies(WebDriver driver) {
        return driver.manage().getCookies();
    }

    public static void fullScreenWindows(WebDriver driver) {
        driver.manage().window().fullscreen();
    }

    public static void maximizeWindows(WebDriver driver) {
        driver.manage().window().maximize();
    }

    public static void refreshBrowser(WebDriver driver) {
        driver.navigate().refresh();
    }

    public static void forwardBrowser(WebDriver driver) {
        driver.navigate().forward();
    }

    public static void backBrowser(WebDriver driver) {
        driver.navigate().back();
    }

    public static String getBrowserTitle(WebDriver driver) {
        return driver.getTitle();
    }

    public static String getPageSource(WebDriver driver) {
        return driver.getPageSource();
    }

    public static void switchToFrameByName(WebDriver driver, String frameName) {
        driver.switchTo().frame(frameName);
    }

    public static void switchToFrameByElement(WebDriver driver, WebElement element) {
        driver.switchTo().frame(element);
    }

    public static void switchToFrameByIndex(WebDriver driver, int index) {
        driver.switchTo().frame(index);
    }

    public static void switchToDefaultContent(WebDriver driver) {
        driver.switchTo().defaultContent();
    }

    public static void switchToWindow(WebDriver driver, String windowName) {
        driver.switchTo().window(windowName);
    }
 
    public static String getAlertMessage(WebElement element) {
    	return element.getText();
    	
    }
} 