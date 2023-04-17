import java.util.Scanner;
public class Countnumberofdigits {
    public static void main(String[]args) {
        System.out.println("This program gives the count of the digit present in the number!");
        System.out.println("Enter a number:");
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            int c = 0;
            //digit counting
            while (num > 0){
                num = num / 10 ;
                ++c;
            }
    System.out.println("The number of digits in a number is "+c);
        }
    }
}

        