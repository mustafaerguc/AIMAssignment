package step_definitions;

import Pages.HomePage;
import Pages.RegistrationPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationPageStepDef {

    WebDriver driver;
    HomePage homePage;
    RegistrationPage registrationPage;

  @Given("running juiceshop application")
public void running_juiceshop_application() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost:3000");
      Thread.sleep(2000);
      homePage=new HomePage(driver);
      homePage.clickSchoolSign();
      homePage.clickAccountButton();
    }

    @When("the user goes to the login page")
    public void the_user_goes_to_the_login_page() throws InterruptedException {
        homePage=new HomePage(driver);
        Thread.sleep(2000);
      homePage.clickSchoolSign();
      homePage.clickAccountButton();
        registrationPage=new RegistrationPage(driver);
       registrationPage.clickLoginButton();
    }

    @When("the user clicks “Not yet a customer?”")
    public void the_user_clicks_not_yet_a_customer() {
        registrationPage=new RegistrationPage(driver);
        registrationPage.clickNotYetACustomer();
    }

    @Then("the registration page appears")
    public void the_registration_page_appears() {
       registrationPage=new RegistrationPage(driver);
        Assert.assertEquals("User Registration",registrationPage.getUserRegistration());
    }
}
