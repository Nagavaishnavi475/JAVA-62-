import java.util.Scanner;

public class pp34 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input starting number of range: ");
        int start = sc.nextInt();

        System.out.print("Input ending number of range : ");
        int end = sc.nextInt();

        System.out.println("The prime number between " + start + " and " + end + " are :");

        for(int num = start; num <= end; num++) {

            int count = 0;

            for(int i = 1; i <= num; i++) {
                if(num % i == 0)
                    count++;
            }

            if(count == 2)
                System.out.print(num + " ");
        }
    }
}