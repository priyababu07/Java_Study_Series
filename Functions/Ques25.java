package Functions;
import java.util.Scanner;;
public class Ques25 {
    public static int productOftwoNUmber(int number1,int number2){
        int product = number1*number2;
        return product;
    }
    public static void main(String[] args){
Scanner sc = new Scanner(System.in);

System.out.println("Enter the first number");
int number1 = sc.nextInt();
System.out.println("Enter the second number");
int number2 = sc.nextInt();
int product = productOftwoNUmber(number1, number2);
System.out.println("The product of two number is:"+product);
    }
}
