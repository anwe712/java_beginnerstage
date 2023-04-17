import java.util.Scanner;
public class Armstrong {
    public static void main (String []args)
    {   System.out.println("Enter a number:");
        try (Scanner sc = new Scanner (System.in)) {
            int num = sc.nextInt();
            int d , sum = 0 , copy = num ;
            while (copy > 0){
                d = copy % 10 ;
                sum = sum + (d*d*d);
                copy /= 10;
            }
            if (sum == num ){
                System.out.println("The number is a Armstrong number");

            }
            else{
                System.out.println("The number is not a armstrong number");
            }
           
        }

        
    }
}