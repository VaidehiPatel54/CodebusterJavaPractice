package method;

public class Instance_Static_Area {
    //Instance Area or static Area

    int a =1; //Declare instance variable
    static String name = "Java is a secure Language";  //Declare static Variable

    public static void main(String args []){
         //Static area

        //Create an Object
        // where Instance_Static_Area is a class name isa is an object new is a keyword and Instance_Static_Area() is a Constructor.
        Instance_Static_Area isa = new Instance_Static_Area();
        System.out.println(isa.a); //called instance variable using object name
        System.out.println(name);
        Instance_Static_Area.m2();  //static method calld via class name
        m2(); //static method called direct
        isa.m1(); //instance method called via object name
    }

    //Calling :- Instance Variable to Instance area :- Direct
    //Calling :- Static variable to Static area :- Direct
    //Calling :- Instance variable to Static area :- via creating object and using object name
    //Calling :- static variable to Instance area :- Direct or via Class name

    void m1(){ //Declare Instance method
        //Instance Area
        int x =10;
        System.out.println(x);
        System.out.println(a);
        m2();
        Instance_Static_Area.m2();


    }

    static void m2(){ // Declare static method
      //static area
        int y =5;
        System.out.println(y);
        Instance_Static_Area isa = new Instance_Static_Area();
        System.out.println(isa.a);
    }

}
