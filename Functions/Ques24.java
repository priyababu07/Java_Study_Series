package Functions;
import java.util.*;
public class Ques24 {

    public static int sumOftwoNUmbers(int num1,int num2){
      int  sum = num1+num2;
        return sum;
    }
    public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the first number");
int num1 = sc.nextInt();
System.out.println("Enter the second number");
int num2 = sc.nextInt();
System.out.println("The sum of two number is "+sumOftwoNUmbers(num1, num2));
    }
}
