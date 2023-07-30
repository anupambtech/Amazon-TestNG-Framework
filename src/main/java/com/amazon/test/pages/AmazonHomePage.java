package com.amazon.test.pages;

import com.amazon.test.base.AmazonBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AmazonHomePage extends AmazonBase {

    private final By amazonLogoWebL = By.xpath("//a[@aria-label='Amazon.in']");
    private final By amazonMenusWebL = By.xpath("//div[@id='nav-xshop-container']//descendant::a");
    private final By amazonOperationalCountriesWebL = By.xpath("//div[@class='navFooterLine navFooterLinkLine navFooterPadItemLine']//descendant::li");
    private final By amazonSignInWebE = By.xpath("//a[@id='nav-link-accountList']");
    private final By amazonSignedInNameWebE = By.xpath("(//a[@id='nav-link-accountList']//span)[1]");
    private final By amazonSignInButtonWebE = By.xpath("//div[@id='nav-flyout-ya-signin']/a");
    private final By SIGN_IN_LINK_AUTO=By.xpath("//div[@id='nav-signin-tooltip']/a");
    private final By SEARCH_BOX=By.xpath("//input[@id='twotabsearchtextbox']");

    public AmazonHomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getAmazonLogo() {
        return driver.findElement(amazonLogoWebL);
    }

    public List<WebElement> getAmazonMenus() {
        return driver.findElements(amazonMenusWebL);
    }

    public List<WebElement> getOperationalCountries() {
        return driver.findElements(amazonOperationalCountriesWebL);
    }

    public WebElement getAmazonSignInLink() {
        return driver.findElement(amazonSignInWebE);
    }

    public WebElement getAmazonSignInButton() {
        return driver.findElement(amazonSignInButtonWebE);
    }

    public WebElement getAmazonSignInAutoLink() {
        return driver.findElement(SIGN_IN_LINK_AUTO);
    }

    public WebElement getAmazonSignedInName() {
        return driver.findElement(amazonSignedInNameWebE);
    }

    public WebElement getAmazonSearchBox(){
        return driver.findElement(SEARCH_BOX);
    }

}
