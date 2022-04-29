package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

public HomePage(WebDriver driver){
    PageFactory.initElements(driver,this);
}



    @FindBy(xpath = "//span[contains(text(),'Dismiss')]")
    WebElement dismissSign;

    @FindBy(id = "navbarAccount")
    WebElement accountButton;

    @FindBy(xpath = "//button/span[contains(text(),'Login')]")
    WebElement loginButton;

    public void clickSchoolSign(){
        dismissSign.click();
    }

public void clickAccountButton(){
accountButton.click();
}

public String getLoginText(){

    return loginButton.getText();
}


}
