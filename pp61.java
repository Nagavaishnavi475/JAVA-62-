import java.util.Scanner;

public class pp61 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input characters : ");
        String str = sc.nextLine();

        int upper = 0, lower = 0, other = 0;

        for(int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if(Character.isUpperCase(ch))
                upper++;
            else if(Character.isLowerCase(ch))
                lower++;
            else
                other++;
        }

        System.out.println("Uppercase letters: " + upper);
        System.out.println("Lowercase letters: " + lower);
        System.out.println("Other characters: " + other);
    }
}