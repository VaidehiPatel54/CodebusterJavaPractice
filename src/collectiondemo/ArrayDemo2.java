package collectiondemo;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayDemo2 {
    public static void main(String[] args) {

        String[] names = {"bhav", "dhaw", "priya", "deep"};
        System.out.println("printing array 9:" + names[0]);
        String unique = "priYA";

        ArrayList<String> nam = new ArrayList<>();
        nam.add("odd");
        nam.add("even");
        nam.add("prime");
        nam.add("non-prime");
        System.out.println("Printing collection :" + nam);
      //  System.out.print("printing after iteration through for each loop :");

        for (String a : nam) {
            //if(a.equalsIgnoreCase(unique)){
                System.out.println(a);
            }
        }


    }

