import java.util.Scanner;
public class Sphere{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        double volume=4*(3.14)*r*r*r;
        // float a=volume/3;
        // System.out.print(volume/3);
        System.out.printf("%5.2f
",(volume/3)); 
    }
}