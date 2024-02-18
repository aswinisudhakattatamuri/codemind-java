import java.util.*;
public class Sol{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        double c=(a+b)*(0.5);
        System.out.print(String.format("%.4f",c));
    }
}