import java.util.Scanner;

public class pp46 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input the binary number : ");
        int binary = sc.nextInt();

        int decimal = 0;
        int power = 0;
        int temp = binary;

        while(temp > 0) {
            int digit = temp % 10;
            decimal += digit * Math.pow(2, power);
            power++;
            temp /= 10;
        }

        System.out.println("The Binary Number : " + binary);
        System.out.println("The equivalent Decimal Number is : " + decimal);
    }
}