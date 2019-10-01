import java.util.Random;

public class randomnumber{
  public static void main(String[]args){

    Random rand = new Random();

    rand.nextInt(10);
    System.out.println("[0,9] " + rand.nextInt(10));
    System.out.println("[1,10] " + (rand.nextInt(10) + 1));
    System.out.println("[20,34] " + (rand.nextInt(15) + 20));
    System.out.println("[-10,9] " + (rand.nextInt(20) - 20));
    System.out.println("[0,1] " + (rand.nextDouble()));
    System.out.println("[0,6] " + (rand.nextDouble() + rand.nextInt(6)));

    System.out.println((int) (Math.random()*10));
    System.out.println((int) ((Math.random()+.1)*10));
    System.out.println((int) ((Math.random()*15)+20));
    System.out.println((int) ((Math.random()*20)-10));
  }
}
