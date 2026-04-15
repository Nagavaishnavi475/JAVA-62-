import java.util.Scanner;

public class pp48 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input starting range of number : ");
        int start = sc.nextInt();

        System.out.print("Input ending range of number: ");
        int end = sc.nextInt();

        System.out.println("The Strong numbers are :");

        for(int num = start; num <= end; num++) {

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
                System.out.print(num + " ");
        }
    }
}