package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by User on 02.05.16.
 */
public class MyAccountPage extends BasePage {

    @FindBy (xpath = "//span[@class='btn-link btn-link-blue btn-link-confirm-mail']//button[@id='confirm_email_btn']")
    private WebElement verifiEmail;

    @FindBy(xpath = "//div[@class='message-confirm-mail-i bold']")
    WebElement confirmEmailText;
    @FindBy(css = "#confirm_email_btn")
    WebElement getConfirmEmailButton;
    @FindBy (xpath = "(//div[@class='profile-f-i-field'])[1]")
    WebElement usersName;
    @FindBy(xpath = "(//div[@class='profile-f-i-field'])[2]")
    WebElement usersEmail;

    @FindBy(xpath = "(//div[@class='profile-edit-block'])[1]")
    WebElement birthDayBlock;
    @FindBy(xpath = "(//div[@class='clearfix f-i']//input)[1]")
    WebElement dayOfBirth;
    @FindBy(xpath = "((//div[@class='clearfix f-i']//input)[3]")
    WebElement yearOfBirth;
    @FindBy (xpath = "//div[@class='inline pos-fix']/a")
    WebElement mounthOfBirthDropDown;
    @FindBy(xpath = "//div[@data-type='DateWithoutYear']/div/div//a")
    WebElement listOfMouth;

    @FindBy (xpath = "(//div[@class='profile-edit-block'])[2]")
    WebElement priveInformationBlock;
    @FindBy (xpath = "(//div[@class='profile-edit-block'])[3]")
    WebElement homeAnimalsBlock;



  public   MyAccountPage(WebDriver driver) {
        super(driver);
    }
    public void setbirthDayData (){
        dayOfBirth.sendKeys("10");
        yearOfBirth.sendKeys("1888");
        mounthOfBirthDropDown.click();
        String mounthlist = listOfMouth.getText();


    }
}
