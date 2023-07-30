package com.amazon.test.tests;

import com.amazon.test.base.BaseTest;
import com.amazon.test.business.AmazonHome;
import com.amazon.test.business.AmazonSignIn;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;

public class AmazonHomePageTest extends BaseTest {

    AmazonHome amazonHomePage = null;

    @Test
    public void verifyAmazonLogo() {
        amazonHomePage = new AmazonHome(driver);
        WebElement amazonLogoWebE = amazonHomePage.getAmazonLogo();
        Assert.assertTrue(amazonLogoWebE.isDisplayed());
    }

    @Test
    public void verifyAmazonMenus() {
        amazonHomePage = new AmazonHome(driver);
        List<String> expectedAmazonMenus = List.of("Amazon miniTV", "Sell", "Best Sellers", "Today's Deals", "Mobiles", "New Releases", "Customer Service", "Prime");
        Assert.assertEquals(expectedAmazonMenus, amazonHomePage.getActualAmazonMenus());
    }

    @Test
    public void verifyAmazonOperationCountries() {
        amazonHomePage = new AmazonHome(driver);
        List<String> expectedOperationalCountries = List.of("Australia", "Brazil", "Canada", "China", "France", "Germany", "Italy", "Japan", "Mexico", "Netherlands", "Poland", "Singapore", "Spain", "Turkey", "United Arab Emirates", "United Kingdom", "United States");
        Assert.assertEquals(expectedOperationalCountries, amazonHomePage.getActualAmazonOperationalCountries());
    }

    @Test
    public void verifyAmazonLoginPage() {
        amazonHomePage = new AmazonHome(driver);
        String expectedHeader = "Sign in";
        AmazonSignIn signIn = amazonHomePage.clickToSignInButton();
        Assert.assertEquals(expectedHeader, signIn.getSignInHeadingText());
    }

    @Test
    public void verifyAmazonSearchFunction(){
        amazonHomePage = new AmazonHome(driver);
        amazonHomePage.enterKeywordToSearchItem("Table lamp");
    }

}
