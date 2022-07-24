package inheritance;

public class B extends A {          //B is child class and A is a Parent class

    public void m3(){
        System.out.println("Child class contain m3 method");
    }

    public void m4(){
        System.out.println("Child class contain m4 method");
    }

    public static void main(String[] args) {
        B b = new B();
        A a = new A();
        b.m1();
        b.m2();
        b.m3();
        b.m4();
        a.m1();
        a.m2();

    }

}
