import java.util.Scanner;

public class pp37 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input a number: ");
        int num = sc.nextInt();

        int reverse = 0;

        while(num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }

        System.out.println("The number in reverse order is : " + reverse);
    }
}