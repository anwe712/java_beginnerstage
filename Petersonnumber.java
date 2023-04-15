import java.util.Scanner;

public class Petersonnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;
        int temp = num;
        while(temp > 0) {
            int digit = temp % 10;
            int fact = 1;
            for(int i = 1; i <= digit; i++) {
                fact *= i;
            }
            sum += fact;
            temp /= 10;
        }
        if(num == sum) {
            System.out.println(num + " is a Peterson number.");
        } else {
            System.out.println(num + " is not a Peterson number.");
        }
        sc.close();
    }
}
