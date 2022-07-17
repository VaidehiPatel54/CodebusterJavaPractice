package variables;

public class Variables {

    //Local Variable :- Variables which is declared inside the method or inside the Contructor or inside the block.
    //Instance Variable :- Variables which is declared outside the method and inside the class.
    //Static variable :-  Variables which is declared outside the method and inside the class with static keyword.


    int a =10; // instance varible or Global varioble
    static int b =20; //static variable Global varioble
    static String name1 = "JAVA";

    public static void main(String args[]){
        String name ="Codebuster"; //local variable
        System.out.println(name); //called local variabe
        System.out.println(b); // called static variable

        Variables var = new Variables(); //Create an object
        System.out.println(var.a);// called variable using object

    }

    void add(){ //User defined method and Instance method
        //x ,y are local variables.
        int x =5 ;
        int y =10;


        System.out.println(a);
        System.out.println(x); //called local variable direct.
        System.out.println(y);
        System.out.println(b); //called static variable direct.
        System.out.println(Variables.name1); //called static variable using class name.
    }
    static void test(){ // static method

        //m ,n are local variables.
        int m = 100;
        int n = 200;
        Variables var = new Variables();
        System.out.println(m);
        System.out.println(n);
        System.out.println(var.a);

    }
     //Constructor name and class name should be same.

    Variables(){ // Create constructor
        String name2 = "Java is an object oriented Programming Language";
    }

    //Instance block
    {
        int m1 = 25;
        System.out.println(m1);
    }
//
    //Static block

    static {
        boolean result = true;
        System.out.println(result);
    }


}
