import java.util.Scanner;
public class Conversion{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int inches=sc.nextInt();
        double cm=inches*2.54;
        // System.out.print("%.2f",centimeters);
        System.out.println(String.format("%.2f", cm));
    }
}