// // Print a solid rhombus.

//             *****
//            *****
//           *****
//          *****
//         *****
//        *****





// package patterns;

// public class hw1 {
//     public static void main(String[] args) {
        
//     int number=5;
//    int n=6;
//    for(int i=5;i>=1;i--){
//     for(int j=0;j<=9-number;j++){
       
// System.out.print(" ");
// number++;
//     }
//     for(int k=1;k<=5;k++){
//         System.out.print("*");
//             }
//             System.out.println();
//    } 
   
   
//     }
// }
package patterns;

public class hw1 {
    public static void main(String[] args) {
        
        int n = 6; // Number of rows for the rhombus
        for (int i = 0; i < n; i++) {
            // Print leading spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 0; k < 5; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
