import java.util.Scanner;

public class pp25 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input the number of terms : ");
        int n = sc.nextInt();

        int sum = 0;

        System.out.print("The square natural upto " + n + " terms are :");

        for(int i = 1; i <= n; i++) {
            int square = i * i;
            System.out.print(square + " ");
            sum += square;
        }

        System.out.println("\nThe Sum of Square Natural Number upto " + n + " terms = " + sum);
    }
}