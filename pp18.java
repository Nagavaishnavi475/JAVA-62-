import java.util.Scanner;

public class pp18 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input the Value of x : ");
        double x = sc.nextDouble();

        System.out.print("Input the number of terms : ");
        int n = sc.nextInt();

        double sum = 1;
        int sign = -1;
        int power = 2;

        for(int i = 1; i < n; i++) {

            double fact = 1;
            for(int j = 1; j <= power; j++) {
                fact *= j;
            }

            sum += sign * (Math.pow(x, power) / fact);

            sign *= -1;
            power += 2;
        }

        System.out.println("the sum = " + sum);
        System.out.println("Number of terms = " + n);
        System.out.println("value of x = " + x);
    }
}