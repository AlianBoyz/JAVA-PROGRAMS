package OOPs.company;

public class first   //class 1
{
    String name;
    int id;
    public void info()   // info function
    {
        System.out.println("Name = "+this.name);
        System.out.println("Id = "+this.id);
    }
    first (first f1)
    {
        this.name=f1.name;
        this.id=f1.id;
    }
    first()
    {

    }
}
class oops {
    public static void main(String[] args) {
        first f = new first();   // creating object of class first O1 or constructor
        f.name = "Niladri";    // assigning values of class 1 variables
        f.id = 11343;

        first s=new first();
        s.name = "name 2";
        s.id=2;

        first f1=new first(s);

        s.info();
        f.info(); // calling info function of class 1
        f1.info();
    }
}
