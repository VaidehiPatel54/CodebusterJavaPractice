package constructor;

public class Test_Constructor {
    int eid;
    String name;

    public static void main(String[] args) {
        Test_Constructor t= new Test_Constructor(111,"bhav");
        t.display();
        Test_Constructor t1=new Test_Constructor(222,"gaurang");
        t1.display();
        Test_Constructor t3=new Test_Constructor(333,"sapna");
        t3.display();

    }

    Test_Constructor(int eid,String name){
       /* eid=111;
        name="bhav";*/
        this.eid=eid;
        this.name=name;
    }
    void display(){
        System.out.println(eid);
        System.out.println(name);
    }

}
