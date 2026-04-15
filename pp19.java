import java.util.Scanner;

public class pp19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input the number of terms : ");
        int n = sc.nextInt();

        double sum = 0;

        for(int i = 1; i <= n; i++) {
            System.out.print("1/" + i + " + ");
            sum += 1.0 / i;
        }

        System.out.println("\nSum of Series upto " + n + " terms : " + sum);
    }
}