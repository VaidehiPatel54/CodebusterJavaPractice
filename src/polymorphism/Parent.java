package polymorphism;

import primitive_datatypes.Integer;

public class Parent {

    public void add(int a, int b){
        System.out.println("Overridden method from parent class");
        System.out.println(a+b);
    }

    public Object printName(String name){
        System.out.println(name);
        return name;
    }

    public void marry(){
        System.out.println("Black girl");
    }

    public Number addition(int z, int y){
       int k=z+y;
       return k;
    }
}
