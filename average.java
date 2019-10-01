import java.util.Scanner;
public class average{
     public static void main(String[]args){
          Scanner scan = new Scanner(System.in);
          System.out.println("Type three numbers and I will print the average");
          System.out.println("Example: 3 4 6");
          double num1 = scan.nextDouble();
          double num2 = scan.nextDouble();
          double num3 = scan.nextDouble();
          double average = (num1 + num2 + num3) / 3;
          System.out.println(average);
     }
}
