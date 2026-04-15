import java.util.Scanner;

public class pp59 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input an integer : ");
        int num = sc.nextInt();

        int temp = num, digits = 0;

        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        temp = num;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        if (sum == num)
            System.out.println(num + " is an Armstrong number");
        else
            System.out.println(num + " is not an Armstrong number");
    }
}