package step_definitions;

import Pages.HomePage;
import Pages.RegistrationPage;
import Utils.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class RegistrationPageStepDef {


    RegistrationPage registrationPage;
    HomePage homePage;

    @When("the user goes to the login page")
    public void the_user_goes_to_the_login_page() throws InterruptedException {
        //we have running application with given step
        //initialize homepage to use some of its methods for first steps
        homePage=new HomePage();
        //clicking the dismiss button for first welcome pop-up
        homePage.clickDismissSign();
        //clicking account to see login button
        homePage.clickAccountButton();
        //initialize registration page
        registrationPage=new RegistrationPage();
        //clicking login button to see login page
        registrationPage.clickLoginButton();
        Thread.sleep(3000);
    }

    @When("the user clicks “Not yet a customer?”")
    public void the_user_clicks_not_yet_a_customer() {
        registrationPage=new RegistrationPage();
        //on login page, clicking not yet a customer to see registration page
        registrationPage.clickNotYetACustomer();
    }

    @Then("the registration page appears")
    public void the_registration_page_appears() {
        registrationPage=new RegistrationPage();
        //validate if we're on the registration page
        Assert.assertEquals("User Registration",registrationPage.getUserRegistration());
        Driver.tearDown();
    }
}
