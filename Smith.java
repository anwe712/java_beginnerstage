
//A Smith number is a composite number whose sum of digits equals to the sum of digits of its prime factors, excluding 1. It is also known as a joke number. It is a sequence of OEIS A006753.Suppose, we want to check the number 85 is smith or not.

// Sum of digits = 8 + 5 = 13

// Prime factors of 85 is: 5,17

// Sum of digits of its prime factors = 5 + 1+ 7 = 13

// Compare the sum of digits with the sum of digits of its prime factors i.e. 13=13. Both are equal. Hence, the given number (85) is a smith number.
import java.util.Scanner;

public class Smith {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        try (Scanner sc = new Scanner (System.in)) {
            int num = sc.nextInt();
            int d , sum = 0 ,summation = 0;
            //sum of digits 
            while ( num > 0){
                d = num % 10 ;
                sum += d ;
                num /= 10 ;
            }
            System.out.println("The sum of the digits: "+sum );
 //finding out prime factors except 1
            for (int i = 2 ; i<= num ; i++)
   {
            if ( num % i == 0)
            {
               summation  = summation + (i % 10);
               i = i / 10 ;
            }
   }
      if ( summation == num )
      {
            System.out.println("Yes");

      }
      else{
            System.out.println("No");
      }
        }
    }
}