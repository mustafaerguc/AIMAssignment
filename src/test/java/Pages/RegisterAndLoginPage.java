package Pages;

import Utils.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class RegisterAndLoginPage {


    public RegisterAndLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //element for email box
    @FindBy(id = "emailControl")
    WebElement emailBox;

    //element for password box
    @FindBy(id = "passwordControl")
    WebElement passwordBox;

    //element for entering password again
    @FindBy(id = "repeatPasswordControl")
    WebElement passwordAgainBox;

    //element for clicking security question to see options
    @FindBy(xpath = "//div//mat-select[@id='mat-select-2']")
    WebElement securityQuestionClick;

    //for options of security questions so we can choose one of the questions
    @FindBy(xpath = "//mat-option[@role='option']")
    List<WebElement> securityQuestionOptions;

    //element of security answer box
    @FindBy(id = "securityAnswerControl")
    WebElement securityAnswerBox;

    //element of register button
    @FindBy(id = "registerButton")
    WebElement registerButton;



    //created a method to set up account
    public void setUpAccount(String email, String password, String passwordAgain,String securityQuestion, String securityAnswer){
        //sending email
        emailBox.sendKeys(email);
        //sending password
        passwordBox.sendKeys(password);
        //repeating password again
        passwordAgainBox.sendKeys(passwordAgain);
        //clicking security questions to see options
        securityQuestionClick.click();
        //created for loop to choose which question
        for(WebElement securityQuestionOption: securityQuestionOptions){
            if (securityQuestionOption.getText().equals(securityQuestion)){
                //when entered question matches with one of the option, it click this option
                securityQuestionOption.click();
            }
        }
        //send security answer
        securityAnswerBox.sendKeys(securityAnswer);
    }

    //method for clicking register button
    public void setRegisterButton(){
        //JavascriptExecutor is for scrolling the window to the target to click
        JavascriptExecutor jse=(JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);",registerButton);
        registerButton.click();
    }




}
