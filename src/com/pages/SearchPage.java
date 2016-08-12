package com.pages;

import org.bouncycastle.math.ec.ECCurve;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by User on 10.05.16.
 */
public class SearchPage extends BasePage {

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='g-price-uah']")
    private List<WebElement> allPrices;

    @FindBy(xpath = "//button[@class='btn-link-i']")
    private List<WebElement> allButtonBuy;

    public int quantityOfPrices() {
        return allPrices.size();
    }

    public void findPrice() {


        //System.out.println(allPrices);

        for (WebElement elem : allPrices) {
            String str = elem.getText();
            //str = str.replace("грн", "");
            str =  str.replace(" ", "");
            int lengt = str.length();
            lengt = lengt - 4;
            str = String.valueOf(str.subSequence(0,lengt));
             str = str.trim();

            try {
                float newInt = Float.valueOf(str);
                System.out.println(newInt);
            } catch (NumberFormatException ex) {
                System.err.println("Неверный формат строки!");
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


