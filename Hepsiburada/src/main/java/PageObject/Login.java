package PageObject;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Login {

    JavascriptExecutor javascriptExecutor;

    @FindBy(how = How.ID, using = "login")
    private WebElement login;

    @FindBy(how = How.ID, using = "txtUserName")
    private WebElement email;

    @FindBy(how = How.ID, using = "txtPassword")
    public WebElement password;

    @FindBy(how = How.ID, using = "btnLogin")
    private WebElement loginButton;

    @FindBy(how = How.ID, using = "btnEmailSelect")
    private WebElement submit;

    @FindBy(how = How.CLASS_NAME, using = "sf-OldMyAccount-1k66b")
    private WebElement accountName;

    public Login(WebDriver webDriver, JavascriptExecutor javascriptExecutor) {
        this.javascriptExecutor = javascriptExecutor;
        PageFactory.initElements(webDriver, this);
    }

    public void clickLogin() {
        javascriptExecutor.executeScript("arguments[0].click();",login);
    }

    public void setEmail(String email) {
        this.email.sendKeys(email);
    }

    public void setPassword (String pass) {
        this.password.sendKeys(pass);
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public void clickSubmit () {
        submit.click();
    }

    public void checkAccount () {
        Assert.assertNotNull(accountName.getText().toString());
        System.out.println("Account Name : " + accountName.getText());
    }

}
