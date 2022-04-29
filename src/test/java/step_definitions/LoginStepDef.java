package step_definitions;

import Pages.HomePage;
import Utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LoginStepDef {

    //initialize driver, and HomePage
    WebDriver driver;
    HomePage homePage;

    // Setup webdriver for running juice application
    @Given("a running juiceshop application")
    public void a_running_juiceshop_application() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver= Driver.getDriver();
        driver.get("http://localhost:3000");
        Thread.sleep(2000);
    }

    //we can initialize our page class to use the methods
    @When("the user clicks “Account”")
    public void the_user_clicks_account() throws InterruptedException {
        homePage=new HomePage();
        //click dismiss sign for pop-up
        homePage.clickDismissSign();
        //click account button to see login option
        homePage.clickAccountButton();
        Thread.sleep(2000);
    }
    @Then("the login button appears")
    public void the_login_button_appears() {
        homePage=new HomePage();
        //we can get the text of login button to validate
        Assert.assertEquals("Login",homePage.getLoginText());
        //close window
        Driver.tearDown();
    }


}
