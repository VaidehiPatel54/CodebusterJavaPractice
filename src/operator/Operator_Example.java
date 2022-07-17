package operator;

public class Operator_Example {

    public static void main(String[] args) {
        int a = 5;
        int b= 5;
        int c =10;



        //Airthmatic Operators
        System.out.println("Addition is = " +(a+b));
        System.out.println("Subtraction is = " +(a-b));
        System.out.println("Multiplication is = " +(a*b));
        System.out.println("Division is = " +(a/b));
        System.out.println("Modulse is =" +(a%b));
        System.out.println(++a);
        System.out.println("Decrement Value =" +(--a));

//        //Logical Opeartors
        boolean result = a<b && a>b; //false
        boolean result1 = a<b && b>a;// true
        boolean result2 = a<b || a>b; // true
        boolean result3 = a!=c;
        boolean result4 = a!=5;
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

        //Relational Operators

        boolean answer = a==b;
        boolean ans1 = a!=c;
        boolean ans2 = a>b;
        boolean ans3 = a<c;

        System.out.println(answer);
        System.out.println(ans1);
        System.out.println(ans2);
        System.out.println(ans3);

    }

}
