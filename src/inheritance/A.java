package inheritance;

public class A {
    public void m1(){
        System.out.println("Parent class contain m1 method");
    }
    public void m2(){
        System.out.println("Parent class contain m2 method");
    }

    public static void main(String[] args) {
        A a = new A();
        a.m1();
        a.m2();
    }
}
