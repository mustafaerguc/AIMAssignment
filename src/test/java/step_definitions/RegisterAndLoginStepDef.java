package step_definitions;

import Pages.LoginPage;
import Pages.RegisterAndLoginPage;
import Utils.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class RegisterAndLoginStepDef {


    //initialize pages
    RegisterAndLoginPage registerAndLoginPage;
    LoginPage loginPage;

    //sending the information of registration page
    @When("the user enters a username, password, security question, and answer")
    public void theUserEntersAUsernamePasswordSecurityQuestionAndAnswer() {
        registerAndLoginPage=new RegisterAndLoginPage();
        registerAndLoginPage.setUpAccount("testaccount1@test.com","123123","123123","Your favorite book?","Book");
    }

    //after sending the information user clicks the register button to register
    @And("the user clicks “Register”")
    public void theUserClicksRegister() {
        registerAndLoginPage=new RegisterAndLoginPage();
        registerAndLoginPage.setRegisterButton();
    }

    @Then("the user can log in with the provided username and password")
    public void theUserCanLogInWithTheProvidedUsernameAndPassword() {
        loginPage=new LoginPage();
        //login with the credentials
        loginPage.login("testaccount1@test.com","123123");
        //validate if we're able to log in
        Assert.assertEquals("Your Basket",loginPage.getYourBasketText());
        //close window
        Driver.tearDown();
    }
}
