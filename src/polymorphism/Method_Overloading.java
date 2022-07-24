package polymorphism;

public class Method_Overloading {
    /*The class contains more than one method with the same name but different
    number of argument or same number of arguments with different data type. These
    called overloaded method*/

    public void add(int a, int b){
        System.out.println(a);
        System.out.println(b);
    }

    public void add(int c){  //overloaded method with different number of argunment
        System.out.println(c);
    }

    public void add(String a, String b){     //overloaded method with different type of parameter
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        Method_Overloading m = new Method_Overloading();
        m.add("Codebuster","Testing");
        m.add(20);
        m.add(25,50);
    }
}
