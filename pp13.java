public class pp13 {
    public static void main(String[] args) {

        int num = 1;
        int rows = 4;

        for(int i = 1; i <= rows; i++) {

            // spaces
            for(int space = 1; space <= rows - i; space++) {
                System.out.print(" ");
            }

            // numbers
            for(int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }

            System.out.println();
        }
    }
}