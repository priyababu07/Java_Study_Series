package Condition;
import java.util.Scanner;
public class Ques4 {
    public static void main(String [] args){
     Scanner sc = new Scanner(System.in);
     System.out.println("Check the number is odd or Even");
     System.out.println("Enter the number");
     int number = sc.nextInt();
     if(number%2==0){
        System.out.println("I am Even");
     }
     else{
        System.out.println("I am odd");
     }
    }
}
