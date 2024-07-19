package function.company;

public class Call_value_and_referance
{
    static int val(int a)
    {
        a=a+10;
        System.out.println("In Call by value "+a);
        return a;
    }
    static int ref(int b1)
    {
        b1=b1+200;
        System.out.println("In Call by reference "+b1);
        return b1;
    }
    public static void main(String[] args)
    {
        int a =10;
        int c=100;
        System.out.println("Before call by value "+a);
        val(a);
        System.out.println("After call by value "+a);
        System.out.println("Before call by reference "+c);
        c=ref(c);
        System.out.println("After call by reference "+c);
    }
}
