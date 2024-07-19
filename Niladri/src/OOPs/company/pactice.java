package OOPs.company;
import java.util.*;
class rectangle
{
    private int length=0;
    private int breadth=0;
    int area=0;
    rectangle (int a,int b)
    {
        this.length=a;
        this.breadth=b;
    }
    rectangle()
    {
        this.length=4;
        this.breadth=5;
    }
    public double area()
    {
        area=length*breadth;
        return area;
    }
}
class cylinder
{
    private int rad=0;
    private int hei=0;
    double area=0.0;
    cylinder (int r,int h)
    {
        rad=r;
        hei=h;
    }
    public double area()
    {
        area =(2*3.14*rad*(rad + hei));
        return area;
    }
    public int getHeight()
    {
        return hei;
    }
    public int getRadius()
    {
        return rad;
    }
}
public class pactice
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the height of the cylinder");
        int h= sc.nextInt();
        System.out.println("Enter the radius of the cylinder");
        int r= sc.nextInt();

        cylinder c=new cylinder(r,h);
        System.out.println("Height of the cylinder "+c.getHeight());
        System.out.println("Enter the height of the cylinder "+c.getRadius());
        System.out.println("Area of the cylinder "+c.area());

        //rectangle rect=new rectangle();
        System.out.println("Enter the length");
        int l= sc.nextInt();
        System.out.println("Enter the breadth");
        int b=sc.nextInt();
        rectangle rect=new rectangle(l,b);
        System.out.println("Area of rectangle="+rect.area());
    }
}
