package com.amazon.test.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BaseTest {
    protected WebDriver driver=null;

    @BeforeClass
    public void setUp(){
        String BROWSER_PATH = "/src/test/resources/browser/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ BROWSER_PATH);
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        String APP_URL = "https://www.amazon.in/";
        driver.navigate().to(APP_URL);
    }

    @AfterClass
    public void tearDown(){
        if (driver!=null){
            driver.quit();
        }
    }

}
