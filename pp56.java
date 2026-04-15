import java.util.Scanner;

public class pp56 {

    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= n/2; i++)
            if (n % i == 0)
                return false;
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input a positive integer: ");
        int num = sc.nextInt();

        for (int i = 2; i <= num / 2; i++) {
            if (isPrime(i) && isPrime(num - i)) {
                System.out.println(num + " = " + i + " + " + (num - i));
            }
        }
    }
}