import java.util.Scanner;

public class pp45 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input 1st number for LCM: ");
        int a = sc.nextInt();

        System.out.print("Input 2nd number for LCM: ");
        int b = sc.nextInt();

        int max = (a > b) ? a : b;

        while(true) {

            if(max % a == 0 && max % b == 0) {
                System.out.println("The LCM of " + a + " and " + b + " is : " + max);
                break;
            }

            max++;
        }
    }
}