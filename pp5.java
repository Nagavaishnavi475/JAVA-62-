import java.util.Scanner;

public class pp5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Input number of terms : ");
        n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            System.out.println("Number is : " + i +
                    " and cube of the " + i + " is :" + (i*i*i));
        }
    }
}