package OOPs.company;
import java.util.*;
class Employee
{
    private int salary;
    private String name;
    public String getName()
    {
        return name;
    }
    public void setName(String n)
    {
        name=n;
    }
    public int getSalary()
    {
        return salary;
    }
    public void setSalary(int s)
    {
        salary=s;
    }
}
public class prog_1
{
    public static void main(String[] args)
    {
        int sal=0;
        String name="";
        Employee obj=new Employee();
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the name");
        name=sc.nextLine();
        System.out.println("Enter the salary");
        sal=sc.nextInt();
        obj.setName(name);
        obj.setSalary(sal);
        System.out.println("Name = "+obj.getName());
        System.out.println("Salary = "+obj.getSalary());
    }
}
