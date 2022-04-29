package Pages;

import Utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    //initialize PageFactory
    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    //Dismiss button for first welcome pop-up
    @FindBy(xpath = "//span[contains(text(),'Dismiss')]")
    WebElement dismissSign;

    //Account button on the right top side
    @FindBy(id = "navbarAccount")
    WebElement accountButton;

    //Location of login button so we can check it is visible after we clicked account button
    @FindBy(xpath = "//button/span[contains(text(),'Login')]")
    WebElement loginButton;

    //With the help of element, click dismiss to close welcome pop-up
    public void clickDismissSign(){
        dismissSign.click();
    }

    //After closing pop-up, click Account button
    public void clickAccountButton(){
        accountButton.click();
    }

    //So we can get the text to see login option
    public String getLoginText(){
        return loginButton.getText();
    }


}
