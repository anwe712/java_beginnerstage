
import java.util.Scanner;
public class DoubleSecondLastDigit {
    public static void main(String[] args) {
        System.out.println("Enter a number :");
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
      int new_num = num % 100 ;
      int second_last_digit = new_num / 10 ;
      if (second_last_digit< 5)
      {
        
        int outputnum = num + (second_last_digit*10);
      
      
      System.out.println("The new number is "+ outputnum);
        }
        else{
            System.out.println("The second last digit is more than 4");
        }

    }
}}