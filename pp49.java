import java.util.Scanner;

public class pp49 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input the starting number of the A.P. series: ");
        int a = sc.nextInt();

        System.out.print("Input the number of items for the A.P. series: ");
        int n = sc.nextInt();

        System.out.print("Input the common difference of A.P. series: ");
        int d = sc.nextInt();

        int sum = 0;

        System.out.print("The Sum of the A.P. series are :\n");

        for(int i = 0; i < n; i++) {

            int term = a + i * d;
            sum += term;

            System.out.print(term);

            if(i < n-1)
                System.out.print(" + ");
        }

        System.out.println(" = " + sum);
    }
}