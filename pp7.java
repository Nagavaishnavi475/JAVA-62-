import java.util.Scanner;

public class pp7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input upto the table number starting from 1 : ");
        int n = sc.nextInt();

        System.out.println("Multiplication table from 1 to " + n);

        for(int i = 1; i <= 10; i++) {
            for(int j = 1; j <= n; j++) {
                System.out.print(j + "x" + i + " = " + (j * i));
                if(j != n)
                    System.out.print(", ");
            }
            System.out.println();
        }
    }
}