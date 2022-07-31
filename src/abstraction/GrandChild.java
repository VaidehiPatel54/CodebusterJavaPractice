package abstraction;

public class GrandChild extends ChildClass{

    @Override
    void sub() {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        GrandChild e= new GrandChild();
    }
}
