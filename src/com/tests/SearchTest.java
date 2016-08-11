package com.tests;

import com.pages.HomePage;
import com.pages.SearchPage;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

/**
 * Created by User on 11.05.16.
 */
public class SearchTest extends BaseTest {

    @Test
    public void searchTest (){
        HomePage homePage = page.createPage(HomePage.class);
        SearchPage searchPage =  homePage.searchProducts("Samsung");
        searchPage.findPrice();
        //searchPage.addGoodstoBacket();
    }

}
