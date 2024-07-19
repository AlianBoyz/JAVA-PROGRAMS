package array.company;
import java.util.*;
public class linear_search
{
    public static void main(String args[])
    {
        int size,i,se;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the value");
        for(i=0;i<size;i++)
        {
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter the value to search");
        se= sc.nextInt();
        for(i=0;i<size;i++) {
            if (se == arr[i])
                System.out.println("Element" + se + "found " + i);
            else
                System.out.println("Element" + se + "not found");
        }
    }
}
