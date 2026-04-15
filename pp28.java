import java.util.Scanner;

public class pp28 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input the starting range : ");
        int start = sc.nextInt();

        System.out.print("Input the ending range : ");
        int end = sc.nextInt();

        System.out.print("The Perfect numbers within the given range : ");

        for(int num = start; num <= end; num++) {

            int sum = 0;

            for(int i = 1; i <= num/2; i++) {
                if(num % i == 0)
                    sum += i;
            }

            if(sum == num)
                System.out.print(num + " ");
        }
    }
}