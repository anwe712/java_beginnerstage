
import java.util.Scanner;
public class DoubleLastDigit {
    public static void main(String[] args) {
        System.out.println("Enter a number :");
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            int lastDigit = num % 10; 
            // get the last digit
            if (lastDigit< 5){
                int newNum = num + lastDigit ; // double the last digit and replace it in the number
                       
      System.out.println("The new number is "+ newNum);
        }
        else{
            System.out.println("The last digit is more than 4");
        }

    }
}}

