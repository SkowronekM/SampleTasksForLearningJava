package com.example.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListBasics {
    public static void main(String[] args) {

        ArrayList basicList = new ArrayList();
        basicList.add(new String("test"));
        basicList.add("info");
//        basicList.get(0);

        String strEl = (String) basicList.get(0);
//        System.out.println(strEl);
        ArrayList<String> arrStr = new ArrayList<>();
        arrStr.add("Kasia");
        arrStr.add("Adam");
        arrStr.add("Patrycja");

        arrStr.remove(1);
        arrStr.add("Olek");

        for (String s: arrStr) {
            System.out.println(s);
        }


        arrStr.add(0, "Zuza");
        System.out.println(arrStr);

        arrStr.set(1, "Katarzyna");
        System.out.println(arrStr);

        System.out.println("after sorting \n");
        Collections.sort(arrStr);
        System.out.println(arrStr);


    }
}
