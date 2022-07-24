package polymorphism;

public class Child extends Parent {

    public void add(int a, int b) {
        super.add(a, b);
        System.out.println(a - b);
    }

    public Object printName(String name) {
        super.printName(name);
        return null;
    }

    public void marry() {
        super.marry();
        System.out.println("Beautiful Girl");
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.add(10, 2);
        child.printName("Codebuster");
        child.marry();
    }

    }


