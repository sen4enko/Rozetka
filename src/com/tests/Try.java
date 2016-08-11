package com.tests;

import org.openqa.selenium.WebElement;

/**
 * Created by User on 11.05.16.
 */
public class Try {
    public static void main(String[] args) {

        String stringPrice = "16 999 грн";
        String[] prices = new String[3];
        prices[0] = "17 000 грн";
        prices[1] = "23 222 грн";
        prices[2] = "34 543 грн";

        int [] priceInt = new int[3];
        /*int last = str.length()-1; //Длина
        System.out.println(last);
        char ch = str.charAt(last);// последний символ
        System.out.println(ch);
*/
        /*String [] isParts = str.split(" "); // раздиление на части
        String price1 = isParts[0]; // первая часть
        System.out.println(price1);
        String price2 = isParts[1];// вторая часть
        System.out.println(price2);
        String price = price1 + price2; // конконтенация
        System.out.println(price);
        long priceInt = Long.valueOf(price); // приведение к числу
        System.out.println(priceInt);*/

        /*int leng = stringPrice.length();
        //System.out.println(leng);
        int leng1 = leng - 3;
       // System.out.println(leng1);
        String str1 = stringPrice.substring(0, leng1);
        String[] isParts = str1.split(" ");
        String p0 = isParts[0];
        String p1 = isParts[1];
        String price = p0 + p1;
        int priceNumber = Integer.valueOf(price);
        System.out.println(priceNumber);
*/
        /*int leng = stringPrice.length();
        //System.out.println(leng);
        int leng1 = leng - 3;
        // System.out.println(leng1);
        String str1 = stringPrice.substring(0, leng1);
        String strWithoutSpace = str1.replaceAll(" ", "");
        System.out.println(strWithoutSpace);*/

        for (int i = 0; i < prices.length; i ++) {
            int leng = prices[i].length();
            //System.out.println(leng);
            int leng1 = leng - 3;
            // System.out.println(leng1);
            String str1 = prices[i].substring(0, leng1);
            String strWithoutSpace = str1.replaceAll(" ", "");
            int newPrice = Integer.valueOf(strWithoutSpace);
            priceInt[i] = newPrice;

            System.out.println(priceInt[i]);
        }
      //  System.out.println();
        }
        }






