package array.company;

import java.util.*;

public class bank_wealth
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Size");
        int n= sc.nextInt();
        int m= sc.nextInt();
        int [][] arr=new int[n][m];
        System.out.println("Element");
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                arr[i][j]= sc.nextInt();
            }
        }
        det(arr,n,m);
    }
    public static void det(int arr[][],int n,int m)
    {
        int max_w=0,sum_w=0,c=0;
        int [] ar=new int[n];
        for (int i = 0; i <n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                sum_w+=arr[i][j];
            }
            ar[i]=sum_w;
            if (max_w<sum_w) {
                c = i;
                max_w = sum_w;
            }
            sum_w=0;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(i+1+" customer = "+ar[i]);
        }
        System.out.println(c+1+" Customer is richest = "+max_w);
    }
}
