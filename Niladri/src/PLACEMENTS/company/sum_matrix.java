package PLACEMENTS.company;

import java.util.Scanner;

public class sum_matrix
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int [][]arr1={{1,2,3},
                      {4,5,6}};
        int [][]arr2={{11,22,33},
                      {44,55,66}};
        int [][] res=new int[2][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                res[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
}
