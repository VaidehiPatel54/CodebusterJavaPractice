package collectiondemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListDemo {
    //ArrayList supports dynamic array that can grow as needed
    // It can contain duplicate elements and it also maintains the insertion order.
    // Manipulation is slow because a lot of shifting needs to be occurred if any element is removed from the array list.
    // Arraylists are not synchronized.
    //Array list allows random access because it works on the index basis
    public static void main(String[] args) {

        String [] names = {"bhav", "dhaw","priya", "deep"};

        ArrayList<String> list= new ArrayList(Arrays.asList(names));
        list.add("gaur");
        list.add("prinali");
        list.add("divya");
        list.add("divya");
        list.add("dhrupesh");
        System.out.println(list);//---------------------------
        list.set(2,"vishal");
        list.remove(6);

        ArrayList<String> nam2= new ArrayList<>();
        nam2.add("vadei");
        nam2.add("khusb");
        nam2.addAll(list);

        System.out.println("******************");
        System.out.println("Before Sort  :"+nam2);//---------------------------------
        Collections.sort(nam2);
        System.out.println("After sorting :"+nam2);
        System.out.println("****************");

        for(int i=0; i<nam2.size(); i++){
            System.out.println(nam2.get(i));
        }
        System.out.println("====================================");
        for(String e:nam2){
            System.out.println(e);
        }


    }
}
