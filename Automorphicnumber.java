//An Automorphic number is a number whose square “ends” in the same digits as the number itself.
import java.util.Scanner;
public class Automorphicnumber {
    public static void main (String[]args){
        System.out.println("Enter a number:");
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            
            int c = 0 , squared_num , sqrNumRemainder ;
            //digit count
            while (num > 0){
                num = num / 10 ;
                c++;//this variable counts the number of digit
               
            }
        
            squared_num = num * num ;
            sqrNumRemainder= squared_num %(int)Math.pow(10, c);
        if(sqrNumRemainder == num )
        {
            System.out.println("Automorphic Number");
        }
        else
        {
            System.out.println("Not Automorphic Number");
        }
        
}
}
}