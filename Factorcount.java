import java.util.Scanner;
public class Factorcount {
    public static void main(String[]args) {
    System.out.println("Enter a number:");
    try (Scanner sc = new Scanner(System.in)) {
        int num = sc.nextInt();

        int c = 0 ;
        for (int i = 1 ; i<= num ; i++ ){
            if (num % i == 0){
                c++ ;
            }
           
        }
        System.out.println("The number of factors is "+c);
    }

    
        
    }
}
