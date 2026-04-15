import java.util.Scanner;

public class pp30 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input starting number of range: ");
        int start = sc.nextInt();

        System.out.print("Input ending number of range : ");
        int end = sc.nextInt();

        System.out.print("Armstrong numbers in given range are: ");

        for(int num = start; num <= end; num++) {

            int temp = num;
            int sum = 0;

            while(temp != 0) {
                int digit = temp % 10;
                sum += digit * digit * digit;
                temp /= 10;
            }

            if(sum == num)
                System.out.print(num + " ");
        }
    }
}