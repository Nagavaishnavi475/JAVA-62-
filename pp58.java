import java.util.Scanner;

public class pp58 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input a string : ");
        String str = sc.nextLine();

        int count = 0;

        for(char c : str.toCharArray()) {
            count++;
        }

        System.out.println("The string contains " + count + " number of characters.");
        System.out.println("So, the length of the string " + str + " is : " + count);
    }
}