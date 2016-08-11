package com.tests;

import java.util.ArrayList;

/**
 * Created by User on 28.07.16.
 */
public class ForTrain {

    String a = "10 grn";
    String b =  "20 grn";
    String c = "31 grn";

    public void toList (){

        ArrayList a1 = new ArrayList();
        a1.add(a);
        a1.add(b);
        a1.add(c);
        System.out.println(a1);
        System.out.println(a1.size());
        int new1 = 0;
        int new2 ;
        for (Object elem : a1 ){

            String str = elem.toString();
            str = str.replace("grn","").trim();
            int newInt = Integer.valueOf(str);
            System.out.println(newInt);
          if (newInt >30) {
                new1 = newInt;

            }else new1 = 0;

        }
        System.out.println(new1);
    }

    public static void main(String[] args) {
        ForTrain a = new ForTrain();

        a.toList();
    }

}
