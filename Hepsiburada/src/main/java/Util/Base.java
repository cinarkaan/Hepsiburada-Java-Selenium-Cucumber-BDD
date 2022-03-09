package Util;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {

    public WebDriver webDriver;
    public WebDriverWait webDriverWait;
    public JavascriptExecutor javascriptExecutor;

    public Base (String Key, String Path) {
        System.setProperty(Key,Path);
    }

    public void tearDown () {
        webDriver.quit();
    }

    public void getCurrentPage (int handleNum) {
        String handles[] = webDriver.getWindowHandles().toArray(new String[webDriver.getWindowHandles().size()]);
        webDriver.switchTo().window(handles[handleNum]);
    }

}
