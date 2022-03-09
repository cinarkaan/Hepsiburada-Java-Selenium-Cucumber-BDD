package Base;

import Util.Base;
import Util.DriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ChromeBase extends Base implements DriverManager {


    public ChromeBase () {
        super("webdriver.chrome.driver", "C:\\Users\\kaan-\\Documents\\ChromeDriver\\chromedriver.exe");
        initializeDriver();
    }

    @Override
    public void initializeDriver() {
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        webDriverWait = new WebDriverWait(webDriver, 10);
        javascriptExecutor = (JavascriptExecutor) webDriver;
    }

}
