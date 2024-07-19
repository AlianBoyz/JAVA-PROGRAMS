package function.company;

import java.util.Scanner;

public class circum_circlefunc
{
    public static double cir(double r)
    {
        double circ=0.0;
        circ=(2*(3.1428)*r);
        return circ;
    }
    public static void main(String[] args)
    {
        double res=0.0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of the circle ");
        double rad=sc.nextDouble();
        res=cir(rad);
        System.out.println("The result is "+res);
    }
}
