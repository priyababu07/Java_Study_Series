package Condition;
import java.util.Scanner;
public class Ques6 {
    public static void main(String [] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter 1,2 or 3");
      int number = sc.nextInt();
    //   if(number==1){
    //     System.out.println("Hello");
    //   }
    //   else if(number==2){
    //     System.out.println("Namasate");
    //   }
    //   else if(number==3){
    //     System.out.println("Bonjour");
    //   }
    //   else{
    //     System.out.println("Invalid Entry");
    //   }
    switch (number) {
        case 1:
        System.out.println("Hello");
            break;
        case 2:
        System.out.println("Namasate");
            break;
        case 3:
        System.out.println("Bonjour");
            break;
    
        default:
        System.out.println("Invalid Entry");
            break;
    }
    } 
}
