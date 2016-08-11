package com.tests;

import com.pages.BasePage;
import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.concurrent.TimeUnit;

/**
 * Created by User on 02.05.16.
 */
public class BaseTest {
    protected static WebDriver driver;
    protected String baseUrl;
    protected BasePage page;

    public BaseTest(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vitalii.senchenko\\Desktop\\Projects\\chromedriver.exe");
       //driver = new ChromeDriver();
        driver = new FirefoxDriver();
        baseUrl = "http://rozetka.com.ua/";
        page = new BasePage(driver);
        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @AfterClass
    public static void after() {
        //driver.quit();
    }
}
