package collectiondemo;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    // It creates a collection that uses has table for storage
    // hast set doesn't maintain  any order of elements.
    // Hash set contains unique elements
    // it allows  to store null value
    // it is non synchronised
    //it is the best approach for search operations.
    //default capacity is 16.
    public static void main(String[] args) {
        HashSet<Integer> evennumber = new HashSet<>();
        evennumber.add(2);
        evennumber.add(4);
        evennumber.add(6);
        System.out.println("HashSet :"+ evennumber);

        HashSet<Integer> numbers= new HashSet<>();
        numbers.addAll(evennumber);
        numbers.add(5);
        System.out.println("New HashSet :"+ numbers);

        Iterator<Integer> iterator = numbers.iterator();
        System.out.println("Hastset using Iterator:");
        while (iterator.hasNext()){
            System.out.print(iterator.next());
            System.out.print(",");
        }
        System.out.println("");
        //Using remove() method
        boolean value1=numbers.remove(5);
        System.out.println("Remove 5 removed ? :" + value1);

        boolean value2=numbers.removeAll(numbers);
        System.out.println("All numbers removed :"+ value2);
        System.out.println(numbers);
    }
}
