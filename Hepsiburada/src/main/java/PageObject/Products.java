package PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class Products {

    Random random = new Random();
    JavascriptExecutor javascriptExecutor;
    Actions actions;

    @FindBy(how = How.CLASS_NAME, using = "productListContent-item")
    private List<WebElement> products;

    @FindBy(how = How.NAME, using = "satici")
    private List<WebElement> sellerNames;

    @FindBy(how = How.TAG_NAME , using = "g")
    private List<WebElement> clearSellers;

    public Products(WebDriver webDriver, JavascriptExecutor javascriptExecutor) {
        this.javascriptExecutor = javascriptExecutor;
        this.actions = new Actions(webDriver);
        PageFactory.initElements(webDriver, this);
    }

    public void selectProduct () {
        int index = random.nextInt(products.size() - 1) + 1;
        products.get(index).click();
    }

    public void selectSeller (int index) {
        javascriptExecutor.executeScript("arguments[0].click();",sellerNames.get(index));
    }

    public void clickClearSellers () {
        actions.moveToElement(clearSellers.get(1)).click().build().perform();
    }

}
