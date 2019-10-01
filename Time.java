import java.util.Scanner;

public class Time{
  public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Type in a hour min sec");
    System.out.println("Example: 10 30 2");
    int hour = scan.nextInt();
    int min = scan.nextInt();
    int sec = scan.nextInt();
    int sec_h = hour * 60 * 60;
    int sec_m = min * 60;
    System.out.println("Total Seconds: "+ (sec_h + sec_m + sec));
  }
}
