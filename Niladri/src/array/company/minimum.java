package array.company;

import java.util.Scanner;

public class minimum
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr=new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println(min(arr));
    }
    public static int min(int arr[])
    {
        int m=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (m>arr[i])
                m=arr[i];
        }
        return m;
    }
}
