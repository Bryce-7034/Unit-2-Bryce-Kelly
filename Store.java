import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;

public class Store{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    Random rand = new Random();
    DecimalFormat fmt = new DecimalFormat("0.00");
    DecimalFormat time = new DecimalFormat("00");
    int month = rand.nextInt(12)+1;
    int day = rand.nextInt(28)+1;
    int hours = rand.nextInt(24);
    int minute = rand.nextInt(60);

    //System.out.println(hours +":"+ minute);
    //System.out.println(month+"/"+day+"/2019");

    System.out.println("How many books did you purchase?");
    int books = input.nextInt();
    System.out.println("How many movies did you purchase?");
    int movies = input.nextInt();
    System.out.println("How many pounds of peanuts did you purchase?");
    double peanuts = input.nextDouble();

    double booksPrice = (books * 9.00);
    double moviesPrice = (movies * 13.97);
    double peanutsPrice = (peanuts * 1.72);

    double price = (booksPrice + moviesPrice + peanutsPrice);

    double booksShipping = books * 0.95;
    double moviesShipping = moviesPrice * .04;
    double peanutsShipping = peanuts * .3;

    double shipping = (booksShipping + moviesShipping + peanutsShipping);
    double total_2 = (shipping + price);

    double booksTax = booksPrice * .072;
    double moviesTax = moviesPrice * .072;

    double tax = (booksTax + moviesTax);
    double finalPrice = (tax + total_2);




System.out.print("================================================\n"
+"|      STEVE S-MART                                        \n"
+"|===============================================\n"
+"|      1234 STEVIE ST.                                     \n"
+"|  Cashier: Steve              \n"
+"|   Transaction Time:"+time.format(hours) +":"+time.format(minute)+" on "+month+"/"+day+"/2019\n"
+"|-----------------------------------------------\n"
+"|Item      Amount       Price    \n"
+"|                                              \n"
+"|Books     X"+books+"         "+fmt.format(booksPrice)+"\n"
+"|                                              \n"
+"|Movies    X"+movies+"         "+fmt.format(moviesPrice)+"\n"
+"|                                              \n"
+"|Peanuts   X"+peanuts+"lbs    "+fmt.format(peanutsPrice)+"\n"
+"|                                                          \n"
+"|Sub-Total:               "+fmt.format(price)+"\n"
+"|\n"
+"|Shipping: Books      "+fmt.format(booksShipping)+"\n"
+"|Shipping: Movies     "+fmt.format(moviesShipping)+"\n"
+"|Shipping: Peanuts    "+fmt.format(peanutsShipping)+"\n"
+"|\n"
+"|Shipping Total:          "+fmt.format(shipping)+"      \n"
+"|Sub-Total & shipping         "+ fmt.format(total_2)+"\n"
+"|\n"
+"|Tax: Books           "+fmt.format(booksTax)+"\n"
+"|Tax: Movies          "+fmt.format(moviesTax)+"\n"
+"|\n"
+"|Tax Total:               "+fmt.format(tax)+"\n"
+"|--------------------------------------------------\n"
+"|*Total Price*            "+fmt.format(finalPrice)+"\n"
+"|                                                  \n"
+"|   Thank You For Shopping At Steve S-Mart!!\n"
+"|==================================================");
  }
}
