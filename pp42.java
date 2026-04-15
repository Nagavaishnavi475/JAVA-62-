import java.util.Scanner;

public class pp42 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input a binary number : ");
        int binary = sc.nextInt();

        int decimal = 0;
        int base = 1;

        for(int temp = binary; temp > 0; temp = temp / 10) {

            int last = temp % 10;
            decimal += last * base;
            base = base * 2;
        }

        System.out.println("The Binary Number : " + binary);
        System.out.println("The equivalent Decimal Number : " + decimal);
    }
}