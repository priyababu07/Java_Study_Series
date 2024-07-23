package Functions;
import java.util.*;
public class hw2 {
    public static void checkEven(int number){
        if(number%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
        return ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check whether it is odd");
        int number = sc.nextInt();
        checkEven(number);
    }
}
