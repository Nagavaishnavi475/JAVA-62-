import java.util.Scanner;

public class pp55 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input any Decimal number: ");
        int num = sc.nextInt();

        String hex = Integer.toHexString(num).toUpperCase();

        System.out.println("The equivalent Hexadecimal Number : " + hex);
    }
}