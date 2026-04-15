public class pp20 {
    public static void main(String[] args) {

        int rows = 3;

        for(int i = 1; i <= rows; i++) {

            // spaces
            for(int space = 1; space <= rows - i; space++) {
                System.out.print(" ");
            }

            // odd stars
            for(int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}