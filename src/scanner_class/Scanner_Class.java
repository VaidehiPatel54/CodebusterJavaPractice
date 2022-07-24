package scanner_class;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Scanner_Class {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        String name;
//        int no, maths, sci, total;



        System.out.println("Enter Name  :");
        String name = sc.next();
        System.out.println("Enter Roll number : ");
        int no = sc.nextInt();
        System.out.println("Enter Marks of Maths  :");
        int maths = sc.nextInt();
        System.out.println("Enter Marks of Science  :");
        int sci = sc.nextInt();
        int total = maths+sci;
        System.out.println("Total is  : " +total);
    }

}
