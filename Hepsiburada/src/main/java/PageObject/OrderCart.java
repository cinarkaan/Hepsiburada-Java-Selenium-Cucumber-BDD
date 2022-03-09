package PageObject;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class OrderCart {

    JavascriptExecutor javascriptExecutor;

    @FindBy(how = How.ID, using = "shoppingCart")
    private WebElement orderCart;

    @FindBy(how = How.ID, using = "basket-item-count")
    private WebElement orderCount;

    public OrderCart(WebDriver webDriver, JavascriptExecutor javascriptExecutor) {
        this.javascriptExecutor = javascriptExecutor;
        PageFactory.initElements(webDriver, this);
    }

    public void clickOrderCart () {
        orderCart.click();
    }

    public void verifyOrderCount () {
        System.out.println(orderCount.getText() + " Product will be added to basket with with successfully");
        Assert.assertNotEquals(0,Integer.parseInt(orderCount.getText()));
    }

}
