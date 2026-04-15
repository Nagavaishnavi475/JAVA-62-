import java.util.Scanner;

public class pp3 {
 public static void main(String[]args) {
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter the number:");
  int num = sc.nextInt();
  int sum = 0;
  System.out.println("The first " + num + " natural num's are ");
  for(int i = 1 ; i<= num ; i++ ) {
   System.out.print(i + " " );
   sum = sum + i;
   }
 System.out.println("Sum = " + sum );
 }
}