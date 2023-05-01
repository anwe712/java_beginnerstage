
import java.util.Scanner;
public class SumOfLastTwoDigit {
    public static void main(String[] args) {
        System.out.println("Enter a number :");
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
      int last_digit = num % 10 ;
      int new_num = num / 10 ;
      int second_llast_digit = new_num % 10 ;
      System.out.println("The sum is "+ (second_llast_digit + last_digit));
        }

    }
}