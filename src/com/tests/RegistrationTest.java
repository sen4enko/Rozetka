package com.tests;

import com.pages.*;
import org.junit.Test;

/**
 * Created by User on 02.05.16.
 */
public class RegistrationTest extends BaseTest {

    @Test
    public void registrationTest() {
        HomePage homePage = page.createPage(HomePage.class);
        LogInPage logInPage = homePage.clickOnRegistratuioButton();
        SignUpPage signUpPage = logInPage.clickSignUpButton();
        signUpPage.fillEditFields("Vitalii", "sen4enko+15@ex.au", "123456789");
       MyAccountPage myAccountPage = signUpPage.clickSignUpButton();
        myAccountPage.setbirthDayData();

    }
}
