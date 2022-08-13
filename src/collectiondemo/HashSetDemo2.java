package collectiondemo;

import java.sql.SQLOutput;
import java.util.HashSet;

public class HashSetDemo2 {

    public static void main(String[] args) {

        HashSet<String>a = new HashSet<>();
        a.add("hi");
        a.add("hello");
        a.add("hi, hello");
        a.add("bye");
        a.add("bye");

        int  num=a.size();
        System.out.println("Total number of name is "+ num);

        for(String ae:a){
            System.out.println(ae);
        }
    }
}
