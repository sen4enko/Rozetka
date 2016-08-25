package com.pages;

import org.bouncycastle.math.ec.ECCurve;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by User on 10.05.16.
 */
public class SearchPage extends BasePage {

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='g-price-uah']")
    private List<WebElement> allPrices;

    @FindBy(xpath = "//div [@class='g-tools-container']//button[@type='submit']")
    private List<WebElement> allButtonBuy;

    @FindBy(xpath = "//a [@class='popup-close']")
    private WebElement popUpClose;

    public int quantityOfPrices() {
        return allPrices.size();
    }

    public void findPrice() throws InterruptedException {

        int i = 0;
        //System.out.println(allPrices);
        while (i < allPrices.size()) {
            for (WebElement elem : allPrices) {

                String str = elem.getText();

                //str = str.replace("грн", "");
                str = str.replace(" ", "");
                int lengt = str.length();
                lengt = lengt - 4;
                str = String.valueOf(str.subSequence(0, lengt));
                str = str.trim();

                float newPrice = 0;
                try {
                    newPrice = Float.valueOf(str);
                    // System.out.println(newPrice);
                } catch (NumberFormatException ex) {
                    System.err.println("Неверный формат строки!");
                }


                if (newPrice > 20000) {
                    //String buttonName = allButtonBuy.get(a).getText();
                    // driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

                    //  Boolean b = allButtonBuy.get(a).isDisplayed();
                    String buttonName = allButtonBuy.get(i).getText();
                    System.out.println(buttonName);
                    allButtonBuy.get(i).click();

                    WebDriverWait wait = new WebDriverWait(driver,30);
                    wait.until(ExpectedConditions.visibilityOf(popUpClose));
                    System.out.println(popUpClose.getTagName());
                    popUpClose.click();
                }
                i++;
            }

        }
    }
}






             //(allPrices > 10000)





        //Object[] newAllallPrices = allPrices.toArray();
        //for (int i = 0; i < newAllallPrices.length; i++) {
          //  int leng = newAllallPrices.length;
          //  int leng1 = leng - 3;
            // String str1 = newAllallPrices[i].substring(0, leng1);
            //String strWithoutSpace = str1.replaceAll(" ", "");
            //int newPrice = Integer.valueOf(strWithoutSpace);
            // priceInt[i] = newPrice;

           // System.out.println(newAllallPrices[i]);
            // return name;

    //public void addGoodstoBacket(){

      //  int n = allPrices.size();
     //   int price = 0;
     //   for (int i = 0; i <= n; i++){
      //      for (WebElement element : allPrices){
          //      String name = element.getText();
      //          price = Integer.valueOf(name);
          //      System.out.println(price);
          //  }

           // }

        //}


