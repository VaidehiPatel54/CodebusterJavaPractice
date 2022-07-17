package method;

public class Test_Methods {
    public static void main(String[] args) {

        Test_Methods t =new Test_Methods(); //Crate an object
        t.addition();                       //call instance method using object name
        t.subtraction(20,10);
        t.subtraction(15,5);
        t.subtraction(20,20);
        t.printName("Codebuster","Testing");
        multiplication();                   //call static method direct
        Test_Methods.division(20,5);   ////call static method direct
        division(15,3);

    }


    // 1. No return type with no parameters
    public void addition(){
        System.out.println("Codebuster Testing");
    }

    // 2. No return type with parameters
     public void subtraction(int a, int b){
        System.out.println(a-b);

     }

     public void printName(String name, String name1){
         System.out.println(name);
         System.out.println(name1);
     }

     // 3. With return type with no parameters
    public static int multiplication(){
        int a =10; int b = 20;
        int result =  a*b;
        System.out.println(a);
         return a;
    }

    // 4. With return type with parameters
    public static int division(int a,int b){
        int result = a/b;
        System.out.println(result);
        return result;
    }
}
