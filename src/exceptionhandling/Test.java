package exceptionhandling;

public class Test {

    public static void main(String[] args) {
        m1();

    }

    public static void m1() {
        try {
            System.out.println("bhav");
            System.out.println(10 / 0);
            System.out.println("hello");

        } catch (ArithmeticException ae   ) {

            System.out.println(10/2);
            System.out.println(10/0);

        }
        finally {
            System.out.println("codebuster");
        }
    }
    }
