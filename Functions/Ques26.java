package Functions;
import java.util.*;
public class Ques26 {
    public static int printFactorial(int number){
        int factorial = 1;
        for(int i=number;i>=1;i--){
          factorial= factorial * i;
        }
        return factorial;
    }
    public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number to find the factorial");
int number = sc.nextInt();
System.out.println(printFactorial(number));
    }
}
