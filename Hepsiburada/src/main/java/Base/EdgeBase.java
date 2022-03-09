package Base;

import Util.Base;
import Util.DriverManager;
import org.junit.Before;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class EdgeBase extends Base implements DriverManager {

    public EdgeBase () {
        super("webdriver.edge.driver","C:\\Users\\kaan-\\Documents\\EdgeDriver\\msedgedriver.exe");
        initializeDriver();
    }

    @Override
    public void initializeDriver() {
        webDriver = new EdgeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        webDriverWait = new WebDriverWait(webDriver, 15);
        javascriptExecutor =(JavascriptExecutor) webDriver;
    }

}
