import java.util.Scanner;

public class Distance{
  public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter two xs and two ys, first integer is x1, second is y1, third is x2, and fourth is y2");
    int x1 = scan.nextInt();
    int y1 = scan.nextInt();
    int x2 = scan.nextInt();
    int y2 = scan.nextInt();
    double distance = Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
    System.out.println("Distance is " + distance);
  }
}
