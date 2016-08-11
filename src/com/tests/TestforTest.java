package com.tests;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static com.tests.BaseTest.driver;

/**
 * Created by User on 03.05.16.
 */
public class TestforTest {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vitalii.senchenko\\Desktop\\Projects\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
         String baseUrl = "https://google.com";

        driver.get(baseUrl);





    }
}
