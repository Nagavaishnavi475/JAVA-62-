import java.util.Scanner;

public class pp52 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input the first number of the G.P. series: ");
        double a = sc.nextDouble();

        System.out.print("Input the number of terms in the G.P. series: ");
        int n = sc.nextInt();

        System.out.print("Input the common ratio of G.P. series: ");
        double r = sc.nextDouble();

        double sum = 0;

        System.out.println("The numbers for the G.P. series:");

        for(int i = 0; i < n; i++) {

            double term = a * Math.pow(r, i);
            System.out.print(term + " ");
            sum += term;
        }

        System.out.println("\nThe Sum of the G.P. series : " + sum);
    }
}