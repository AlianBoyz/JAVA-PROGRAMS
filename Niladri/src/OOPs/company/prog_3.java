package OOPs.company;
import java.util.*;
class circle
{
    public void area(int r)
    {
        double a=(3.14)*r*r;
        System.out.println("Area circle ="+a);
    }
    public void circum(int r)
    {
        double ci=2*(3.14)*r;
        System.out.println("Circumference circle = "+ci);
    }
}
class square
{
    public void area(int s)
    {
        int a=s*s;
        System.out.println("Area of square= "+a);
    }
    public void peri(int s)
    {
        int p=4*s;
        System.out.println("Peri of square= "+p);
    }
}
class triangle
{
    public void area(int b,int h)
    {
        double a=(0.5)*b*h;
        System.out.println("Area of triangle= "+a);
    }
    public void peri(int a,int b,int c)
    {
        int p=a+b+c;
        System.out.println("Peri of square= "+p);
    }
}
public class prog_3
{
    public static void main(String[] args)
    {
        int rad,len,bed,hei,si;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius");
        rad= sc.nextInt();

        System.out.println("Enter the side");
        si= sc.nextInt();

        System.out.println("Enter the length");
        len= sc.nextInt();
        System.out.println("Enter the breadth");
        bed= sc.nextInt();
        System.out.println("Enter the height");
        hei= sc.nextInt();

        circle c=new circle();
        square s=new square();
        triangle t=new triangle();

        c.area(rad);
        c.circum(rad);

        s.area(si);
        s.peri(si);

        t.area(len,bed);
        t.peri(len,bed,hei);
    }
}
