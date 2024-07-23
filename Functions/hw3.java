package Functions;
import java.util.*;
public class hw3 {
    public static void printTable(int number){
        for(int i=1;i<=10;i++){
            System.out.println(i+"*"+number+"="+i*number);
        }
    }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int number = sc.nextInt();
    printTable(number);
 }  
}
