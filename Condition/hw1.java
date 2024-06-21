package Condition;
import java.util.Scanner;
public class hw1 {
    public static void main(String [] args){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the first number");
     int first = sc.nextInt();
     System.out.println("Enter the second number");
     int second = sc.nextInt();
sc.nextLine();//clean the buffer
     System.out.println("Enter an operation");
     String op = sc.nextLine();
     //Then use this otherwise just use next()
     switch (op) {
        case "+":
        System.out.println(first+second);
            
            break;
            case "-":
        System.out.println(first-second);
            
            break;
            case "*":
        System.out.println(first*second);
            
            break;
            case "/":
        System.out.println(first/second);
            
            break;
     
        default:
        System.out.println("Invalid");
            break;
     }
    }
}
