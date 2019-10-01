
/**
 * Write a description of class Geometry here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Geometry
{
    public static void main(String[]args){
        int sides = 7;
        double radius = 5.0;
        final double PI = (3.14);

        System.out.print("sides= "+sides+" radius= "+radius+" PI= "+PI+"\n");
        System.out.print("A heptagon has "+ sides+" sides\n");
        System.out.print("A decagon has "+ (sides+(10-sides))+" sides\n");
        System.out.print("A dodecagon has "+ (sides+(12-sides))+" sides\n");
        System.out.print("The circumference of a circle with a radius of "
        + radius+" is "+(2*PI*radius)+"\n");

        int a = 40;
        int b = 6;
        double c;
        double x = 2.5;
        double y = -1.5;
        int n = 4;
        System.out.println("hey" + (x + n * y - (x + n) * y));
        double z;
        int num_1 = 11;
        int num_2 = 456;
        int num_3 = 123;
        int num_4 = 456;
        int num_5 = 789;
        int num_6 = 23, other = 45;
        int num_7 = 45678;
        int num_8 = 7658;
        double result = num_1 / 2.0;
        System.out.println(result);
        int digit = (num_2 % 1000) / 100;
        System.out.println(digit);
        int num2_1 = num_2 / 10;
        int num3_1 = num2_1 / 10;
        System.out.println(num_2 - num3_1 * 100);
        int num2_9 = num_2 / 10;
        int num3_9 = num2_9 / 10;
        int num4 = num_2 - num3_9 * 100;
        int num5 = num4 / 10;
        int num6 = num4 - num5 * 10;
        System.out.println(num6 * 100 + num5 * 10 + num3_9);

        double result2 = num_5 * 100 % 1000;
        System.out.println(result2);
        //c needs to be double or lossey error
        c = a/y;
        System.out.print("c = "+c+"\n");

        z = (double) a/b;
        System.out.print("z = "+z+"\n");
    }
}
