package com.amazon.test.business;

import com.amazon.test.pages.AmazonHomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import java.util.ArrayList;
import java.util.List;

public class AmazonHome extends AmazonHomePage {

    public AmazonHome(WebDriver driver) {
        super(driver);
    }

    public List<String> getActualAmazonMenus() {
        List<String> actualAmazonMenus = new ArrayList<>();
        List<WebElement> amazonMenusWebEList = getAmazonMenus();
        for (WebElement element : amazonMenusWebEList) {
            String value = element.getText();
            if (!value.isEmpty()) {
                actualAmazonMenus.add(value);
            }
        }
        return actualAmazonMenus;
    }

    public List<String> getActualAmazonOperationalCountries() {
        List<String> actualOperationalCountries = new ArrayList<>();
        List<WebElement> operationalCountriesWebEList = getOperationalCountries();
        for (WebElement element : operationalCountriesWebEList) {
            String value = element.getText();
            if (!value.isEmpty()) {
                actualOperationalCountries.add(value);
            }
        }
        return actualOperationalCountries;
    }

    public AmazonSignIn clickToSignInButton(){
        try {
            WebElement signInAutoWebE = getAmazonSignInAutoLink();
            signInAutoWebE.click();
        }catch (Exception ex){
            WebElement amazonSignInWeE = getAmazonSignInLink();
            Actions interact=new Actions(driver);
            interact.moveToElement(amazonSignInWeE);
            WebElement amazonSignInButtonWeE = getAmazonSignInButton();

            interact.moveToElement(amazonSignInButtonWeE);
            amazonSignInButtonWeE.click();
        }
        return new AmazonSignIn(driver);
    }

    public String getLoggedInUserName(){
        return getAmazonSignedInName().getText();
    }

    public void enterKeywordToSearchItem(String itemName){
        getAmazonSearchBox().sendKeys(itemName);
    }

}
