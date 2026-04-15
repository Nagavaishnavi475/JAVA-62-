
import java.util.Scanner;

public class pp23 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input the value of x : ");
        double x = sc.nextDouble();

        System.out.print("Input number of terms : ");
        int n = sc.nextInt();

        double sum = 1;
        double fact = 1;

        for(int i = 1; i < n; i++) {
            fact *= i;
            sum += Math.pow(x, i) / fact;
        }

        System.out.println("The sum is : " + sum);
    }
}