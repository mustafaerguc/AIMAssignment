package step_definitions;

import Pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginStepDef {

    WebDriver driver;
    HomePage homePage;

    @Given("a running juiceshop application")
    public void a_running_juiceshop_application() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("http://localhost:3000");
        driver.manage().window().maximize();
        Thread.sleep(2000);
    }
    @When("the user clicks “Account”")
    public void the_user_clicks_account() throws InterruptedException {
        homePage=new HomePage(driver);
        homePage.clickSchoolSign();
        homePage.clickAccountButton();
        Thread.sleep(2000);
    }
    @Then("the login button appears")
    public void the_login_button_appears() {
        homePage=new HomePage(driver);
        Assert.assertEquals("Login",homePage.getLoginText());
    }
}
