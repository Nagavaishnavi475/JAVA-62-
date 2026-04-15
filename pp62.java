import java.util.Scanner;

public class pp62 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter consumer number: ");
        int consumer = sc.nextInt();

        System.out.print("Enter units consumed: ");
        int units = sc.nextInt();

        System.out.print("Is payment late? (true/false): ");
        boolean late = sc.nextBoolean();

        if(units < 0) {
            System.out.println("Error: Invalid Input");
            return;
        }

        double bill = 10; // base charge

        if(units <= 100)
            bill += units * 0.5;
        else if(units <= 300)
            bill += (100 * 0.5) + (units - 100) * 0.75;
        else
            bill += (100 * 0.5) + (200 * 0.75) + (units - 300) * 1.2;

        if(late)
            bill += bill * 0.05;

        System.out.println("Total Bill: $" + bill);
    }
}