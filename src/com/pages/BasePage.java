package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by User on 02.05.16.
 */
public class BasePage {

    protected WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
        //PageFactory.initElements(driver, this);
    }
    public <T> T createPage (Class<T> pageClass){
        return PageFactory.initElements(driver,pageClass);
    }

}
