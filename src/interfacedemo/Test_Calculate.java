package interfacedemo;

public class Test_Calculate implements Calculator{
    @Override
    public void add(int a, int b) {
        System.out.println(a+b);
    }

    @Override
    public void sub(int c, int d) {
        System.out.println(c-d);
    }

    @Override
    public void multi(int x, int y) {
        System.out.println(x*y);
    }

    public static void main(String[] args) {
        Test_Calculate test = new Test_Calculate();
        test.add(20,20);
        test.sub(50,25);
        test.multi(20,5);
    }
}
