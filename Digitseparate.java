import java.util.Scanner;
public class Digitseparate {
    public static void main(String[]args) {
        System.out.println("Enter a number :");
        try (Scanner sc = new Scanner (System.in)) {
            int num = sc.nextInt();
            int d ;
            System.out.println("The digits are:");
            while (num > 0 ){
                d = num % 10;
                System.out.print(d+",");
                num = num / 10 ;
            }
        }
        
    }
}
