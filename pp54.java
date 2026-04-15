import java.util.Scanner;

public class pp54 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input an octal number (using digit 0 - 7) : ");
        int octal = sc.nextInt();

        int decimal = 0, power = 0, temp = octal;

        while (temp > 0) {
            int digit = temp % 10;
            decimal += digit * Math.pow(8, power);
            power++;
            temp /= 10;
        }

        int binary = 0, place = 1;

        while (decimal > 0) {
            int rem = decimal % 2;
            binary += rem * place;
            place *= 10;
            decimal /= 2;
        }

        System.out.println("The Octal Number : " + octal);
        System.out.println("The equivalent Binary Number : " + binary);
    }
}