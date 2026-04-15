import java.util.Scanner;

public class pp15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input the number : ");
        int n = sc.nextInt();

        int fact = 1;

        for(int i = 1; i <= n; i++) {
            fact *= i;
        }

        System.out.println("The Factorial of " + n + " is: " + fact);
    }
}