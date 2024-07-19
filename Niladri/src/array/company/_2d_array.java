package array.company;
import java.util.*;
public class _2d_array
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the size of the 2D array");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[][] arr=new int[m][n];
        System.out.println("Enter the elements ");
        for (int i=0;i<m;i++)
        {
            for (int j=0;j<m;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter an element to search");
        int ele= sc.nextInt();
        System.out.println("The array");
        for (int i=0;i<m;i++)
        {
            for (int j = 0; j < m; j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        for (int i=0;i<m;i++)
        {
            for (int j=0;j<m;j++)
            {
                if (ele==arr[i][j])
                    System.out.println("The position of the element is "+i+","+j);

            }
        }
    }
}
