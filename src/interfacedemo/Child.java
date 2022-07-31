package interfacedemo;

public class Child implements Demo_Interface{


    @Override
    public void m1() {
        System.out.println("hi");
    }

    @Override
    public void m2() {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        Child c1= new Child();
        c1.m1();
        c1.m2();
    }

}
