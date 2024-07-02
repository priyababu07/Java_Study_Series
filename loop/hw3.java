// Make a menu driven program. The user can enter 2 numbers, either 1 or 0. 
// If the user enters 1 then keep taking input from the user for a student’s marks(out of 100). 
// If they enter 0 then stop.
// If he/ she scores :
// mark >=90 -> print “This is Good”
// 89 >= mark >= 60 -> print “This is also Good”
// 59 >= mark >= 0 -> print “This is Good as well”
// 	Because marks don’t matter but our effort does.
// (Hint : use do-while loop but think & understand why)




package loop;
import java.util.Scanner;
public class hw3 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("The user can enter 2 numbers, either 1 or 0");
        int n;
        int mark;
        do{
         n = sc.nextInt();
        
         if(n!=0){
            System.out.println("Enter the mark");
         mark = sc.nextInt();
         if(mark >=90){
            System.out.println("This is Good");
         }
         else if(mark >= 60 && mark <= 89){
          System.out.println("This is also Good");

         }
         else{
            System.out.println("This is also good");
         }
        }
        else{
            System.out.println("stop");
        }
         
        }while(n!=0);

    }
}
