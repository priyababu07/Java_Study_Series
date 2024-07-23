package Functions;
import java.util.*;
public class Ques23 {
    public static void printMyname(String name){
        System.out.println(name);
        return;
    }
    public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the name:");
String name = sc.next();
printMyname(name);
    }
}
