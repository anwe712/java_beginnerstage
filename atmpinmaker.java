import java.util.Scanner;
public class atmpinmaker {
    public static void main(String[]args) {
        System.out.println("Welcome to SBI BANK!");
        System.out.println("Please enter your 4 digit pin here:");
        try (Scanner sc = new Scanner (System.in)) {
            int pin = sc.nextInt();
             
      int actual_pin = 4671;
            while ( actual_pin != pin ){
                System.out.println("You have not entered the correct pin");
                System.out.println("ENTER YOUR PIN: ");
            	pin = sc.nextInt();
            }
        }
        System.out.println("PIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
    }}

