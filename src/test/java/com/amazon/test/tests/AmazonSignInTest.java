package com.amazon.test.tests;

import com.amazon.test.base.BaseTest;
import com.amazon.test.business.AmazonHome;
import com.amazon.test.business.AmazonSignIn;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonSignInTest extends BaseTest {

    private AmazonSignIn amazonSignIn = null;
    private AmazonHome amazonHomePage = null;

    @Test
    public void validateSignInInvalidLogins() {
        amazonHomePage = new AmazonHome(driver);
        amazonHomePage.clickToSignInButton();
        amazonSignIn = new AmazonSignIn(driver);
        amazonSignIn.enterEmailOrMobileNumber("anupamb.tech@hotmail.com");
        amazonSignIn.clickSignInContinueButton();
        amazonSignIn.enterPassword("Duggs@20202");
        amazonSignIn.clickSignInSubmitButton();
        String actualValidationMessage = amazonSignIn.getSignInValidationMessageText();
        String expectedValidationMessage = "There was a problem";
        Assert.assertEquals(expectedValidationMessage, actualValidationMessage);
    }

    @Test
    public void validateSignValidLogins() {
        amazonHomePage = new AmazonHome(driver);
        amazonHomePage.clickToSignInButton();
        amazonSignIn = new AmazonSignIn(driver);
        amazonSignIn.enterEmailOrMobileNumber("9818159545");
        amazonSignIn.clickSignInContinueButton();
        amazonSignIn.enterPassword("Shanvi@2020");
        amazonHomePage = amazonSignIn.clickSignInSubmitButton();
        String userName = amazonHomePage.getLoggedInUserName();
        Assert.assertEquals("Hello, Anupam", userName);
    }

}
