import java.util.Scanner;
public class printNumber {
    public static void main(String[]args) {
        System.out.println("Enter a  number:");
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();

            int i , count = 0 ;

            for (i = 1;i <= num ; i++){
                if (num % i == 0)
                {
                    count++;
                }
            }
            if ( count == 2 ){
                System.out.println("The number is a prime number");

            }
            else{
                System.out.println("The number is not a prime number");
            }
   }
        }
    }


