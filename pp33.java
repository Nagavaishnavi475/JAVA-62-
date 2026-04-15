import java.util.Scanner;

public class pp33 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input number of rows: ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {

            int num = 1;

            for(int space = 0; space < n - i; space++)
                System.out.print(" ");

            for(int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = num * (i - j) / (j + 1);
            }

            System.out.println();
        }
    }
}