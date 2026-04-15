import java.util.Scanner;

public class pp47 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input a number to check whether it is Strong number: ");
        int num = sc.nextInt();

        int temp = num;
        int sum = 0;

        while(temp > 0) {

            int digit = temp % 10;
            int fact = 1;

            for(int i = 1; i <= digit; i++)
                fact *= i;

            sum += fact;
            temp /= 10;
        }

        if(sum == num)
            System.out.println(num + " is a Strong number.");
        else
            System.out.println(num + " is not a Strong number.");
    }
}