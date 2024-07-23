
// Enter 3 numbers from the user & make a function to print their average.


package QuestionsToCheckFundamental;
import java.util.*;
public class Ques1 {
    public static int printAverage(int num1,int num2,int num3){
        return (num1+num2+num3)/3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1= sc.nextInt();
        System.out.println("Enter the second number");
        int num2= sc.nextInt();
        System.out.println("Enter the Third number");
        int num3= sc.nextInt();
        System.out.println(printAverage(num1, num2, num3));
    }
}
