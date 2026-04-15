import java.util.Scanner;

public class pp8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input number of terms : ");
        int n = sc.nextInt();

        int sum = 0;

        System.out.print("The odd numbers are :");

        for(int i = 1; i <= n; i++) {
            int odd = 2 * i - 1;
            System.out.print(odd + " ");
            sum += odd;
        }

        System.out.println("\nThe Sum of odd Natural Number upto " + n + " terms : " + sum);
    }
}