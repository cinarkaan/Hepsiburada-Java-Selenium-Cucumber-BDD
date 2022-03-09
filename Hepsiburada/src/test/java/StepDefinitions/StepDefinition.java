package StepDefinitions;

import Base.BaseFactory;
import PageObject.*;
import Util.Base;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {

    BaseFactory baseFactory = new BaseFactory();
    Base base;

    public StepDefinition () {
        this.base = baseFactory.getBase("Edge");
    }

    @Given("^: User will be opened homepage$")
    public void getHomePage () {
        HomePage homePage = new HomePage(base.webDriver);
        System.out.println("User opened homepage");
    }

    @And("^: User login will be verified$")
    public void checkLogin () throws Exception{
        Thread.sleep(3500);
        Login login = new Login(base.webDriver, base.javascriptExecutor);
        login.checkAccount();
        System.out.println("User account verified");
    }

    @When("^: User will be login \"([^\"]*)\",\"([^\"]*)\" to website$")
    public void login(String email,String pass) throws Exception{
        Thread.sleep(1000);
        Login login = new Login(base.webDriver, base.javascriptExecutor);
        login.clickLogin();
        Thread.sleep(3000);
        login.setEmail(email);
        login.clickLoginButton();
        Thread.sleep(1000);
        login.setPassword(pass);
        login.clickSubmit();
        System.out.println(email + " user logged in homepage");
    }

    @And("^: User will be \"([^\"]*)\" searched any product for buy$")
    public void searchProduct (String searchKey) throws Exception{
        HomePage homePage = new HomePage(base.webDriver);
        homePage.setSearchBox(searchKey);
        homePage.clickSearchButton();
        System.out.println(searchKey + " searched and got list");
    }

    @Then("^: User will be selected two product from different users$")
    public void selectTwoProduct () throws Exception{
        Products products = new Products(base.webDriver, base.javascriptExecutor);
        Thread.sleep(500);
        products.selectSeller(0);
        Thread.sleep(1500);
        products.selectProduct();
        base.getCurrentPage(1);
        Product product = new Product(base.webDriver);
        product.clickAddToCard();
        base.getCurrentPage(0);
        Thread.sleep(1350);
        products.clickClearSellers();
        Thread.sleep(2000);
        products.selectSeller(1);
        Thread.sleep(1500);
        products.selectProduct();
        base.getCurrentPage(2);
        Thread.sleep(550);
        product.clickAddToCard();
        System.out.println("Two product added to order cart from different seller");
    }

    @Then("^: Selected products will be verified from orders$")
    public void verifyProducts() throws Exception{
        Thread.sleep(1000);
        base.getCurrentPage(0);
        OrderCart orderCart = new OrderCart(base.webDriver, base.javascriptExecutor);
        orderCart.clickOrderCart();
        Thread.sleep(1500);
        orderCart.verifyOrderCount();
        System.out.println("Selected products verified from order cart");
    }

    @After
    public void EndOfTest () {
        System.out.println("TEST WAS ENDED");
        base.tearDown();
    }



}
