import java.util.Scanner;

public class pp24 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input the value of x : ");
        int x = sc.nextInt();

        System.out.print("Input number of terms : ");
        int n = sc.nextInt();

        int sum = 0;
        int sign = 1;
        int power = 1;

        System.out.println("The values of the series:");

        for(int i = 1; i <= n; i++) {
            int term = (int)Math.pow(x, power) * sign;
            System.out.println(term);
            sum += term;

            sign *= -1;
            power += 2;
        }

        System.out.println("The sum = " + sum);
    }
}