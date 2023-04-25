//A neon number is a number where the sum of digits of square of the number is equal to the number. For example if the input number is 9, its square is 9*9 = 81 and sum of the digits is 9. i.e. 9 is a neon number.
import java.util.Scanner;
public class NeonNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        try (Scanner sc = new Scanner (System.in)) {
            int num = sc.nextInt();

            int squared_num = num * num ;
            int d , sum = 0 ;
            //digit extraction of the number 
            while (squared_num > 0)
            {
                d = squared_num % 10 ;
                sum = sum + d ;
                squared_num /= 10 ;
            }
            if (sum == num )
            {
                System.out.println("It is a Neon number ");

            }
            else{
                System.out.println("It is not a neon number ");
            }
        }
    }
}
