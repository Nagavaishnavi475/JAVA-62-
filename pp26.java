import java.util.Scanner;

public class pp26 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input the number of terms : ");
        int n = sc.nextInt();

        int term = 0;
        int sum = 0;

        System.out.print("Series : ");

        for(int i = 1; i <= n; i++) {
            term = term * 10 + 1;
            System.out.print(term + " ");
            sum += term;
        }

        System.out.println("\nThe Sum is : " + sum);
    }
}