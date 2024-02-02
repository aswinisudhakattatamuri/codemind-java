import java.util.Scanner;
// import Math;
public class Hypotenuse{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double a=sc.nextInt();
        double b=sc.nextInt();
        float c=(float)Math.sqrt((a*a)+(b*b));
        System.out.format("%.2f",c);
    }
}