package collectiondemo;

import java.util.HashMap;

public class HashMapDemo {
    //It is member of the Java Collection Framework.
//        HashMap does not maintain order of its element.
//        It contains values based on the key.
//        It allows only unique keys.
//        Its initial default capacity is 16.
//        It permits null any number of values and the null key
//        It is unsynchronized.
    //----Example---------
//       Name(Key): bhavesh(value)
//       Surname(Key): Patel(value)
    public static void main(String[] args) {
        HashMap<String, Integer> languages = new HashMap<>();
        languages.put("java", 8);
        languages.put("Python", 1);
        languages.put("Javascript", 3);
        System.out.println("Hashmap : " + languages);
        System.out.println("----------------");
       //access();
        access1();
        //changeKey();
        remove();

    }
    public static void access() {
        HashMap<Integer, String> langaues = new HashMap<>();
        langaues.put(1, "java");
        langaues.put(2, "Python");
        langaues.put(3, "javascript");
        langaues.put(4, "ruby");
        //get() method to get value
        String value = langaues.get(2);
        System.out.println("37value at index : " + value);
    }
    public static void access1(){
        HashMap<Integer,String> languages= new HashMap<>();
        languages.put(1,"java");
        languages.put(2,"Python");
        languages.put(3,"javascript");
        System.out.println("44HashMap(42): "+ languages);
        System.out.println("45Keys(43) "+ languages.keySet());// return set view of keys using Keyset()
        System.out.println("46values(44) : "+languages.values());// retun set view of values using Values()
        System.out.println("47key value map(45) : "+ languages.entrySet());// return set view of key/value pairs using entryset()



    }
    public static void  changeKey(){
        HashMap<Integer,String> languages= new HashMap<>();
        languages.put(1,"java");
        languages.put(2,"Python");
        languages.put(3,"javascript");
        System.out.println("Original HashMap : " +languages);
        languages.replace(2,"ruby");
        System.out.println("Hashmap after replace : "+languages);
    }
    public static  void remove(){
        HashMap<Integer,String> languages= new HashMap<>();
        languages.put(1,"java");
        languages.put(2,"Python");
        languages.put(3,"javascript");
        System.out.println("Original HashMap : " +languages);
        String value=languages.remove(2);
        System.out.println("Remove Value : "+ value);
        System.out.println("Updated HashMap : "+ languages);
    }

}
