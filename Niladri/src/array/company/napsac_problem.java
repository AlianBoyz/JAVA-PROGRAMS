package array.company;
import java.util.*;
public class napsac_problem
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n= sc.nextInt();
        System.out.println("Enter the sac size");
        int m=sc.nextInt();
        System.out.println("Enter the profits");
        int profit[]=new int[n];
        for (int i=0;i<n;i++)
        {
            profit[i]= sc.nextInt();
        }
        System.out.println("Enter the weights");
        int weights[]=new int[n];
        for (int i=0;i<n;i++)
        {
            weights[i]= sc.nextInt();
        }
        System.out.print("Profit { ");
        for (int i=0;i<n;i++)
        {
            System.out.print(profit[i]+",");
        }
        System.out.print("}\n");
        System.out.print("Weight { ");
        for (int i=0;i<n;i++)
        {
            System.out.print(weights[i]+",");
        }
        System.out.print("}\n");
        double wi[]=new double [n];
        for (int i=0;i<n;i++)
        {
            wi[i]=(profit[i]/weights[i]);
        }
        nap_calculator obj=new nap_calculator();
        obj.sort(profit,weights,m,wi);
        System.out.println("Maximum profit = "+obj.max_pro(profit,weights,m));

    }
}
class nap_calculator
{
    static void sort(int pro[],int wei[],int m,double wi[])
    {
        double t1;
        int t2,t3;
        for (int i=0;i<pro.length;i++)
        {
            for (int j=i+1;j<pro.length;j++)
            {
                if (wi[i] < wi[j])
                {
                    t1=wi[i];
                    wi[i]=wi[j];
                    wi[j]=t1;

                    t2=pro[i];
                    pro[i]=pro[j];
                    pro[j]=t2;

                    t3=wei[i];
                    wei[i]=wei[j];
                    wei[j]=t3;
                }
            }
        }
//        for (int i=0;i<pro.length;i++)
//        {
//            System.out.print(pro[i]+",");
//        }
//        System.out.println("\n");
        for (int i=0;i<pro.length;i++)
        {
            System.out.print(wi[i]+",");
        }
        //max_pro(pro,wei,m);
    }
   static double max_pro(int pro[],int wei[],int m)
    {
        double max_p=0.0,temp=0.0;
        int n=pro.length;
        double x[]=new double[n];
        for (int i=0;i<n;i++)
            x[i]=0.0;
        for (int i=0;i<n;i++)
        {
            if ((wei[i]>0)&&(wei[i]<m))
            {
                x[i]=1;
                m-=wei[i];
            }
            else
            {
                //System.out.println(m+" ei");
                temp=wei[i];
                x[i]=(m/temp);
                m=0;
            }
        }
        for (int i=0;i<n;i++)
        {
           max_p += x[i] * pro[i];
        }
        for (int i=0;i<n;i++)
        {
            System.out.println(x[i]);
        }
        return max_p;
    }

}