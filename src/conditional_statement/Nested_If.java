package conditional_statement;

public class Nested_If {
    public static void main(String[] args) {
        /*if(Condition){
           statement   //line of code
           }
           else if(Condition){
           statement   //line of code
           }
           else if(Condition){
           statement   //line of code
           }
           else{
           statement  // line of code
           }

         */

        int marks = 85;

         if(marks>=90) {
             System.out.println("Grade A");
         } else if(marks<=80 && marks>=70)
         {
             System.out.println("Grade B");
         }
         else if(marks<=60 && marks>=50){
             System.out.println("Grade C");
         }
         else {
             System.out.println("Fail");
         }
    }
}
