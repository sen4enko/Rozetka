package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by User on 02.05.16.
 */
public class HomePage extends BasePage{

    @FindBy(xpath = "//div[@id='user_menu']//a[@class='header-user-link sprite-side novisited xhr']")
    private WebElement userCabinetButton;

    @FindBy (xpath = "//div[@class='header-search-input-text-wrap sprite-side']/input")
    private  WebElement searchEditField;
    @FindBy (xpath = "//span[@class='btn-link btn-link-green']")
    private WebElement searchButton;



   public HomePage (WebDriver driver){
        super(driver);
    }

    public LogInPage clickOnRegistratuioButton (){
        userCabinetButton.click();
        return createPage(LogInPage.class);
    }

    public SearchPage searchProducts (String searchQuery){
        searchEditField.click();
        searchEditField.sendKeys(searchQuery);
        searchButton.click();
        return createPage(SearchPage.class);
    }


}
