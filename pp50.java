import java.util.Scanner;

public class pp50 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to convert : ");
        int num = sc.nextInt();

        int octal = 0;
        int place = 1;

        while(num > 0) {

            int rem = num % 8;
            octal += rem * place;
            place *= 10;
            num /= 8;
        }

        System.out.println("The Octal of 79 is " + octal + ".");
    }
}