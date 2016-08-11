package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by User on 02.05.16.
 */
public class LogInPage extends  BasePage {
    @FindBy(xpath = "//div[@class='auth-f-signup']/a")
    private WebElement signUpButton;

 public   LogInPage (WebDriver driver){
        super(driver);
    }

    public SignUpPage clickSignUpButton (){

        signUpButton.click();
        return createPage(SignUpPage.class);
    }
}
