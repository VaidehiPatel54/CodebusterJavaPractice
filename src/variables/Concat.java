package variables;

public class Concat {

    public static void main(String[] args) {

    int i;
       /* String name1 = "prime";
        String name2 = "even";
        String name3 = "odd";
*/
        String nam = "sapna";
      //  String text="dnchfsbviregfrekjgnbdfkjvbfivbdfkmgdfkjvbdsfkjbnfgkjbfngkjbjgfnkb;jdfnnvkdfjv";
        String nam1 = "patel";


       /* System.out.println(name1.concat(" " + name2.concat(" " + name3)));
        System.out.println(nam + nam1);
        StringBuffer stringBuffer = new StringBuffer(name1);// 1st type
        System.out.println(stringBuffer.reverse());*/

        String rev ="";
        for( i=nam.length()-1; i>=0; i--){
           // System.out.print(nam.charAt(i));
            rev=rev+nam.charAt(i);//s----------------rev==s
                                 //a----------------rev=sa
                                 //p----------------rev=sap
        }
        System.out.println(rev);



    }
}
