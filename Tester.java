import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;

public class Tester{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    Random rand = new Random();
    int month = rand.nextInt(12)+1;
    System.out.println(month);
     if (month == 2){
       int day = rand.nextInt(28)+1;
       System.out.println(day);
     } else if (month == 1){
       int day = rand.nextInt(31)+1;
       System.out.println(day);
     } else if (month == 3){
       int day = rand.nextInt(31)+1;
       System.out.println(day);
     } else if (month == 5){
       int day = rand.nextInt(31)+1;
       System.out.println(day);
     } else if (month == 7){
       int day = rand.nextInt(31)+1;
       System.out.println(day);
     } else if (month == 8){
       int day = rand.nextInt(31)+1;
       System.out.println(day);
     } else if (month == 10){
       int day = rand.nextInt(31)+1;
       System.out.println(day);
     } else if (month == 12){
       int day = rand.nextInt(31)+1;
       System.out.println(day);
     } else {
       int day = rand.nextInt(30)+1;
       System.out.println(day);
     }
    int hours = rand.nextInt(24);
    int minute = rand.nextInt(60);

  }
}
