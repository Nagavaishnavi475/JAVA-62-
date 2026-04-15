import java.util.Scanner;

public class pp53 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input a binary number : ");
        int binary = sc.nextInt();

        int decimal = 0, power = 0, temp = binary;

        while (temp > 0) {
            int digit = temp % 10;
            decimal += digit * Math.pow(2, power);
            power++;
            temp /= 10;
        }

        int octal = 0, place = 1;

        while (decimal > 0) {
            int rem = decimal % 8;
            octal += rem * place;
            place *= 10;
            decimal /= 8;
        }

        System.out.println("The Binary Number : " + binary);
        System.out.println("The equivalent Octal Number : " + octal);
    }
}