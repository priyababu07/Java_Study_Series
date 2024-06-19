package Input;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Reading a single token
        System.out.println("Enter the name (single token):");
        String name = sc.next(); // Only next is used for a single token
        System.out.println(name); // It only takes a single token
        
        /* Output
         * Enter the name
         * rahul babu
         * rahul
         */

        // Clearing the buffer
        sc.nextLine(); // Consume the leftover newline
        
        // Reading the entire line
        System.out.println("Enter the full name:");
        String name1 = sc.nextLine(); // This reads the whole line including spaces
        System.out.println(name1);
    }
}
