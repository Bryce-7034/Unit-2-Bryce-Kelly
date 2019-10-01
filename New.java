import java.util.Scanner;

public class New{
  public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
    System.out.println("type two floating numbers");
    double num1 = scan.nextDouble();
    double num2 = scan.nextDouble();
    System.out.println("sum: "+ Math.round((num1 + num2) * 100) / 100);
    System.out.println("difference: "+ Math.round(Math.abs((num1 - num2) * 100)) / 100);
    System.out.println("product: "+Math.round((num1 * num2) * 100.0) / 100.0);
    System.out.println("quotient: "+Math.round((num1 / num2) * 100) / 100);
  }
}
