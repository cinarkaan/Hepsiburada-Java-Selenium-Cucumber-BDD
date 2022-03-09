package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Product {

    @FindBy(how = How.ID, using = "addToCart")
    private WebElement addToCard;

    public Product(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    public void clickAddToCard () {
        addToCard.click();
    }

}
