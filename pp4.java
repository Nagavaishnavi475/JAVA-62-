import java.util.Scanner;

public class pp4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        double avg;

        System.out.println("Input the 10 numbers :");

        for(int i = 1; i <= 10; i++) {
            System.out.print("Number-" + i + " : ");
            int num = sc.nextInt();
            sum += num;
        }

        avg = sum / 10.0;

        System.out.println("The sum of 10 no is : " + sum);
        System.out.println("The Average is : " + avg);
    }
}