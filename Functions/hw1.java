package Functions;
import java.util.*;
public class hw1 {

    public static void printPrime(int number){
        int flag=0;
for(int i=2;i<=number/2;i++){
    if(number%i!=0&&number!=i){
     flag = 1;
     
    }
    else{
        System.out.println("Not a prime");
        break;
    }
}
if(flag==1){
    System.out.println("A prime");
}



return;
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number to find Whether it is prime or not"); 
       int number = sc.nextInt();
       printPrime(number);
    }
}
