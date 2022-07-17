package constructor;

public class ConstructorPractice {
    //instance Variable Or Global variable
    int a;
    String name;

    public ConstructorPractice(int a, String name){
        this.a = a;
        this.name = name;


    }

    public void myMethod(){
        System.out.println(a);
        System.out.println(name);
    }


    public static void main(String[] args) {
        ConstructorPractice obj = new ConstructorPractice(10,"Vaidehi");
        obj.myMethod();
        ConstructorPractice obj1 = new ConstructorPractice(54,"Codebuster");
        obj1.myMethod();

    }

}
