package com.amazon.test.pages;

import com.amazon.test.base.AmazonBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPage extends AmazonBase {

    private final By SIGN_IN_HEADING=By.xpath("//h1[normalize-space(text()='Sign in')]");
    private final By SIGN_IN_EMAIL=By.xpath("//input[@id='ap_email']");
    private final By SIGN_IN_CONTINUE_BUTTON=By.xpath("//input[@id='continue']");
    private final By SIGN_IN_PASSWORD=By.xpath("//input[@id='ap_password']");
    private final By SIGN_IN_SUBMIT_BUTTON=By.xpath("//input[@id='signInSubmit']");
    private final By SIGN_IN_VALIDATION_MESSAGE=By.xpath("//div[@id='auth-error-message-box']//h4");

    public SignInPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getSignInHeading(){
        return driver.findElement(SIGN_IN_HEADING);
    }

    public WebElement getSignInEmail() {
        return driver.findElement(SIGN_IN_EMAIL);
    }

    public WebElement getSignInContinueButton() {
        return driver.findElement(SIGN_IN_CONTINUE_BUTTON);
    }

    public WebElement getSignInPassword() {
        return driver.findElement(SIGN_IN_PASSWORD);
    }

    public WebElement getSignInSubmitButton() {
        return driver.findElement(SIGN_IN_SUBMIT_BUTTON);
    }

    public WebElement getSignInValidationMessage() {
        return driver.findElement(SIGN_IN_VALIDATION_MESSAGE);
    }


}
