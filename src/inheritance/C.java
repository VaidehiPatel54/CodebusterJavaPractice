package inheritance;

public class C extends B{
    public void m5(){
        System.out.println("m5 method");
    }

    public void m6(){
        System.out.println("m6 method");
    }

    public static void main(String[] args) {
        C c = new C();
        c.m1();
        c.m2();
        c.m3();
        c.m4();
        c.m5();
        c.m6();
    }
}
