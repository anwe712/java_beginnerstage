import java.util.Scanner;
public class palindrome {
    public static void main(String[]args) {
          System.out.println("This program checks whether the number is a palindrome or not");
          
          try (Scanner Sc = new Scanner(System.in)) {
            int num = Sc.nextInt();
               int copy , d , rev = 0 ;
               copy = num ;
              //reversing the number 
              while (copy > 0){
                d = copy % 10 ;
                 rev = rev*10 + d ;
                copy /= 10 ;
              }
            if (rev == num ){
                System.out.println("The number is palindrome");
            }
            else{
                System.out.println("THe number is not palindrome");
            }
        }
    }
}
