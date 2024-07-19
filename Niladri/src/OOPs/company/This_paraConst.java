package OOPs.company;
import java.util.*;
public class This_paraConst
{
    String name;
    int age;
    int id;
    public void print_info()  // can be public or not cz called by obj in next class
    {
        System.out.println("name = "+this.name);
        System.out.println("age = "+this.age);
        System.out.println("id = "+this.id);
    }
    This_paraConst(String name,int age, int id) //parameterized constructor
    {
        this.name=name;   //assigning name to class name
        this.age=age;  //same
        this.id=id;  //same
    }
}
class student
{
    public static void main(String[] args)
    {
        String name; int age,id;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        name= sc.nextLine();
        System.out.println("Enter your age");
        age= sc.nextInt();
        System.out.println("Enter your id");
        id= sc.nextInt();

        This_paraConst obj=new This_paraConst(name,age,id); //obj of class This_paraConst
        obj.print_info(); //calling his function via obj
    }
}