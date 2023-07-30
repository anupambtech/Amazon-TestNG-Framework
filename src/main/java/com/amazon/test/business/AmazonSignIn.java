package com.amazon.test.business;

import com.amazon.test.pages.SignInPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonSignIn extends SignInPage {

    public AmazonSignIn(WebDriver driver) {
        super(driver);
    }

    public String getSignInHeadingText(){
        return getSignInHeading().getText();
    }

    public void enterEmailOrMobileNumber(String emailOrPhNumber){
        getSignInEmail().sendKeys(emailOrPhNumber);
    }

    public void clickSignInContinueButton(){
        getSignInContinueButton().click();
    }

    public void enterPassword(String password){
        getSignInPassword().sendKeys(password);
    }

    public AmazonHome clickSignInSubmitButton( ){
        getSignInSubmitButton().click();
        return new AmazonHome(driver);
    }

    public String getSignInValidationMessageText(){
        return getSignInValidationMessage().getText();
    }

}
