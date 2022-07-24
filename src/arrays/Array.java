package arrays;

public class Array {
    public static void main(String[] args) {
        //single dimensional array
        int[]x;
        int []y;
        int z[] = {10,20,30,40};
        System.out.println(z.length); // give length of array
        System.out.println(z[1]);  //calling data from its index number
        System.out.println(z[3]);   //calling data from its index number

        String name[] ={"Ram","Shyam","Shiv"};
        System.out.println(name.length);
        System.out.println(name[0]);

        for(int i=0; i<name.length-1;i++){
            System.out.println(name[i]);
        }
        //new approach

        int []a = new int[100];
        a[0] = 10;
        a[1] = 11;
        a[2] = 12;
        a[3] = 13;
        a[4] = 14;

        //Two/Multi dimensional Array
        int m[][];//declare multi dimensional array
        int n[][]= {{100,200},{300,400},{500,600}};

        System.out.println(n.length);
        System.out.println(n[0][0]);
        System.out.println(n[0][1]);
        System.out.println(n[2][1]);
    }

}
