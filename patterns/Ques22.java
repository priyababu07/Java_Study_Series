package patterns;

public class Ques22 {
    public static void main(String [] args){
        for(int i=0;i<=4;i++){
            for(int j=i;j>=0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0;i<=4;i++){
            for(int j=i;j>=0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0;i<=4;i++){
            for(int j=4;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
     
    }
}
