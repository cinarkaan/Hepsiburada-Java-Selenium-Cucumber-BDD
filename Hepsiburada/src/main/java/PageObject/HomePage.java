package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private final String Url = "https://www.hepsiburada.com/";

    @FindBy(how = How.CLASS_NAME, using = "desktopOldAutosuggestTheme-input")
    private WebElement searchBox;

    @FindBy(how = How.CLASS_NAME, using = "SearchBoxOld-buttonContainer")
    private WebElement searchButton;

    public HomePage (WebDriver webDriver) {
        webDriver.get(Url);
        PageFactory.initElements(webDriver, this);
    }

    public void setSearchBox (String key) {
        searchBox.sendKeys(key);
    }

    public void clickSearchButton () {
        searchButton.click();
    }

}
