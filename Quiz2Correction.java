//This is my responce to question 5, directly from the quiz
/*public class Quiz2Correction{
  public static void main(String[]args){
    String firstName = "Sofia";
    String middleName = "Maria";
    String lastName = "Hernandez";
    String firstLetter = firstName.substring(0,1);
    String middleLetter = middleName.substring(0,1);
    String lastLetter = lastName.substring(0,1);
    String firstLetters = firstLetter + middleLetter + lastLetter;
    System.out.print(firstLetters.toLowerCase());
  }
}
*/

//This is my responce to question 6, directly from the quiz
import java.util.Scanner;
import java.util.Random;
public class Quiz2Correction{
  public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
    Random rand = new Random();
    System.out.println("Please type a number between 1 and 100, no decimals");
    int input = scan.nextInt();
    int randNum = rand.nextInt(100)+1;
    int luckyDifference = (input - randNum);
    int lucky = Math.abs(luckyDifference);
    System.out.println("Your lucky number is "+ lucky);
  }
}

//Both of my responces output what I wanted
