package array.company;

import java.util.Arrays;
import java.util.Scanner;

public class start_end_no
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Size");
        int s= sc.nextInt();
        int arr[]=new int[s];
        System.out.println("Element");
        for (int i = 0; i <s; i++)
        {
            arr[i]= sc.nextInt();
        }
        System.out.println("Target");
        int tgt=sc.nextInt();
        System.out.println(Arrays.toString(st_ed(arr, tgt)));
    }
    public static int [] st_ed(int arr[],int t)
    {
        int se[]={-1,-1};
        boolean star=true;
        int j= arr.length-1,i=0;
        while(j!=0||i!= arr.length-1){
            if (arr[i]==t&&se[0]<0) {
                se[0] = i;
            }
            i++;
            if(arr[j] == t&&se[1]<0) {
                se[1] = j;
            }
            j--;
        }
        return se;
    }
}
