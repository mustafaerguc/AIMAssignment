package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {

    public RegistrationPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//button/span[contains(text(),'Login')]")
    WebElement loginButton;

    @FindBy(id = "newCustomerLink")
    WebElement notYetACustomer;

    @FindBy(xpath = "//h1[contains(text(),'User Registration')]")
    WebElement userRegistration;

    public void clickLoginButton() throws InterruptedException {
        loginButton.click();
        Thread.sleep(1000);
    }

    public void clickNotYetACustomer(){
        notYetACustomer.click();
    }

    public String getUserRegistration(){
        return userRegistration.getText();
    }
}
