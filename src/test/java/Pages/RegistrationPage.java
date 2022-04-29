package Pages;

import Utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {

    public RegistrationPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    //element of login button
    @FindBy(xpath = "//button/span[contains(text(),'Login')]")
    WebElement loginButton;

    //element of Not Yet a Customer button
    @FindBy(id = "newCustomerLink")
    WebElement notYetACustomer;

    //element of user registration page to get text
    @FindBy(xpath = "//h1[contains(text(),'User Registration')]")
    WebElement userRegistration;


    //clicking login button to see login page
    public void clickLoginButton() throws InterruptedException {
        loginButton.click();
        Thread.sleep(1000);
    }

    //clicking not yet a customer button to see user registration page
    public void clickNotYetACustomer(){
        notYetACustomer.click();
    }

    //getting the text of user registration page to validate
    public String getUserRegistration(){
        return userRegistration.getText();
    }





}
