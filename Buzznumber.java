//Buzz number is another special number in Java that ends with digit 7 or divisible by 7.
import java.util.Scanner;
public class Buzznumber {
    public static void main(String[]args) {
        System.out.println("Enter a number:");
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
             int d = num % 10 ;
             if (d == 7 || num % 7 == 0)  {
                System.out.println("The number is a Buzz number");

             }
             else{
                System.out.println("This is not a Buzz number");
             }
        }
        
    }
    
}
