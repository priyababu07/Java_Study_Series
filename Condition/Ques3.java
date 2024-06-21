package Condition;
import java.util.Scanner;
public class Ques3 {
    public static void main(String [] args){
        System.out.println("Lets check if your eligible for a license");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age:");
        int age = sc.nextInt();
        if(age>=18){
             System.out.println("Hooray! You can drive");
        }
        else{
            System.out.println("OOPS!Sorry");
        }
    }
}
