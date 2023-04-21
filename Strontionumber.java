import java.util.*;

public class Strontionumber {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a four-digit number:");
            // reading an integer from the user
            int num = sc.nextInt();
            // checks if the given number is a four-digit number or not
            if ((num > 999) && (num < 10000)) {
                int n = num;
                // multiplies the given number by 2
                num = num * 2;
                // removes first digit
                num = num / 10;
                // removes last digit
                num = num % 100;
                // compares the quotient and remainder
                if ((num / 10) == (num % 10))
                    System.out.println(n + " is a strontio number.");
                else
                    System.out.println(n + " is not a strontio number");
            } else
                System.out.println("Please enter a four-digit number.");
        }
    }
}