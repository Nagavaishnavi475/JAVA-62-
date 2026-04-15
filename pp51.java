import java.util.Scanner;
public class pp51 {
 public static void main(String[]args) {
  Scanner sc = new Scanner(System.in);
  System.out.print("Input octal number:");
  int octal=sc.nextInt();
  int decimal num=0;
  int power=0;
  int temp octal=octal num;
  while(temp octal!=0) {
     int last digit = temp octal%10;
     decimal num+=lst digit*Math.pow(8,power);
     temp octal /= 10;
     power++;
  }
 System.out.println("octal is : "+ octal num);
 System.out.println('Equivalent decimal :" + decimal num);
 }
}