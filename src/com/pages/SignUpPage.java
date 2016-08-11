package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by User on 02.05.16.
 */
public class SignUpPage extends BasePage {

    @FindBy(xpath = "(//input[@class='input-text auth-input-text'])[1]")
    private WebElement yourName;

    @FindBy (xpath = "(//input[@class='input-text auth-input-text'])[2]")
    private  WebElement yourEmail;

    @FindBy (xpath = "(//input[@class='input-text auth-input-text'])[3]")
    private  WebElement yourPass;

    @FindBy (xpath = "//span[@class='btn-link btn-link-green btn-link-sign']/button")
    private WebElement signUpButton;

  public   SignUpPage(WebDriver driver){
        super(driver);
    }

    public void fillEditFields (String name, String email, String pass){
        yourName.clear();
        yourName.sendKeys(name);
        yourEmail.clear();
        yourEmail.sendKeys(email);
        yourPass.clear();
        yourPass.sendKeys(pass);
    }
    public MyAccountPage clickSignUpButton (){
        signUpButton.click();
        return createPage(MyAccountPage.class);
    }
}
