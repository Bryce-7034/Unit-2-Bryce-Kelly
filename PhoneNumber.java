import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;

public class PhoneNumber{
  public static void main(String[]args){
    Random rand = new Random();
    DecimalFormat number2 = new DecimalFormat("00");
    DecimalFormat number4 = new DecimalFormat("0000");
    int initNumber = rand.nextInt(7) + 2;
    int secNumber = rand.nextInt(9);
    int unrestricted1 = rand.nextInt(10);
    int unrestricted2 = rand.nextInt(100);
    int unrestricted4 = rand.nextInt(10000);

    System.out.print("("+initNumber+secNumber+unrestricted1+") "
    +initNumber+number2.format(unrestricted2)+ " - "
    + number4.format(unrestricted4));
  }
}
