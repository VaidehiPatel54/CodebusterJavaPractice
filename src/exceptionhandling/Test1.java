package exceptionhandling;

public class Test1 {

    void dhawal() throws Exception {
        System.out.println(10 / 0);
    }

    void vishal() throws Exception {
        dhawal();
    }

    void sapna() {

        try {
            vishal();// System.out.println(10 / 0);
        } catch (Exception e) {
            System.out.println(10 / 2);
        }
    }

    public static void main(String[] args) {
        Test1 t = new Test1();
        t.sapna();
    }

}
