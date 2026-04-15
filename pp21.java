import java.util.Scanner;

public class pp21 {
public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input the number of terms : ");
        int n = sc.nextInt();

        int sum = 0;
        int term = 0;

        for(int i = 1; i <= n; i++) {
            term = term * 10 + 9;
            System.out.print(term + " ");
            sum += term;
        }

        System.out.println("\nThe sum of the saries = " + sum);
    }
}