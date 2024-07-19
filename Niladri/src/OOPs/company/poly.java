package OOPs.company;
import java.util.*;
public class poly
{
    String name;
    int age,id;
    public void print_info(String name)
    {
        System.out.println("Name only "+name);
    }

    public void print_info(String name, int age)
    {
        System.out.println("Name "+name);
        System.out.println("age only "+age);
    }
    public void print_info(String name, int age,int id)
    {
        System.out.println("Name "+name);
        System.out.println("age  "+age);
        System.out.println("id only "+id);
    }
}
class take
{
    public static void main(String[] args)
    {
        poly obj=new poly();
        String n;
        int a,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("name ");
        n=sc.nextLine();
        System.out.println("age");
        a=sc.nextInt();
        System.out.println("id");
        i=sc.nextInt();

        obj.print_info(n,a,i);
        obj.print_info(n);
        obj.print_info(n,a);
    }
}
