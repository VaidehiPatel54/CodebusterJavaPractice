package polymorphism;

public class Constructor_Overloading {

   /* Same constructor name with the different number of argument orsame number
    of argument with different data types it’s called constructor overloading.*/

    public Constructor_Overloading(int a){
        System.out.println(a);
    }

    public Constructor_Overloading(int a, int b){
        System.out.println(a);
        System.out.println(b);
    }

    public Constructor_Overloading(String name, int a){
        System.out.println(name);
        System.out.println(a);
    }

    public static void main(String[] args) {
        Constructor_Overloading con = new Constructor_Overloading(10);
        Constructor_Overloading can1 = new Constructor_Overloading(10,20);
        Constructor_Overloading can2 = new Constructor_Overloading("Codebuster",100);

    }

}
