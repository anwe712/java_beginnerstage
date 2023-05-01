import java.util.Scanner;
public class DeleteLastDigit {
    public static void main(String[] args) {
        System.out.println("Enter a number :");
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
      int new_num = num / 10 ;
      System.out.println("The new number is "+ new_num);
        }

    }
}