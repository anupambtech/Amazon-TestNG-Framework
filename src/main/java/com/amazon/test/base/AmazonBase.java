package com.amazon.test.base;

import org.openqa.selenium.WebDriver;

public class AmazonBase {

    public WebDriver driver = null;

    public AmazonBase(WebDriver driver) {
        this.driver = driver;
    }

}
