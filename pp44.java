import java.util.Scanner;

public class pp44 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input 1st number for LCM: ");
        int a = sc.nextInt();

        System.out.print("Input 2nd number for LCM: ");
        int b = sc.nextInt();

        int hcf = 1;

        for(int i = 1; i <= a && i <= b; i++) {
            if(a % i == 0 && b % i == 0)
                hcf = i;
        }

        int lcm = (a * b) / hcf;

        System.out.println("The LCM of " + a + " and " + b + " is : " + lcm);
    }
}