package constructor;

public class ConstructorExamples {

    //Constructor

    public ConstructorExamples() { //Zero argunment/Parametor constructor
        System.out.println("Zero Argunment Constructor created by user");
    }

    //One argunment constructor
    public ConstructorExamples(int a) {
        System.out.println("One Argunment Constructor created by user ");
    }

    //Two argunment constructor
    public ConstructorExamples(int a, int b) {
        System.out.println("Two Argunment Constructor created by user ");
    }
    //One argunment constructor
    public ConstructorExamples(String name) {
        System.out.println("1 argunment String Constructor");
    }
        //Method
        public void addition () {

        }
        public static void main (String[]args){
            ConstructorExamples obj = new ConstructorExamples();//zero argunment constructor is called
            ConstructorExamples obj1 = new ConstructorExamples(10);// one argunment constructor is called
            ConstructorExamples obj2 = new ConstructorExamples(10, 20);// two argunment constructor is called
            ConstructorExamples obj3 = new ConstructorExamples("Vaidehi");// one argunment constructor is called

        }
    }
