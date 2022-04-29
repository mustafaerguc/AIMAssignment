package Pages;

import Utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
   // this is the page of login after register
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    //email element to send which we registered
    @FindBy(id = "email")
    WebElement sendEmail;

    //password element to send keys which we registered
    @FindBy(id = "password")
    WebElement sendPassword;

    //login button element to click
    @FindBy(id = "loginButton")
    WebElement loginButton;

    //after we login we'll have the 'Your Basket' option, so we can get the text of it to validate
    @FindBy(xpath = "//span[contains(text(),' Your Basket')]")
    WebElement yourBasket;

    public void login(String email, String password){
        //sending email
        sendEmail.sendKeys(email);
        //sending password
        sendPassword.sendKeys(password);
        //clicking login button
        loginButton.click();
    }

    public String getYourBasketText(){
        //getting the text of the page to validate we logged in
        return yourBasket.getText();
    }

}
