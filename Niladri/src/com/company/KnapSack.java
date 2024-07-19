package com.company;
import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;

class node{
    int profit=0;
    int weight=0;
    float ratio=0;
    node(int profit,int weight,float ratio){
        this.profit=profit;
        this.weight=weight;
        this.ratio=ratio;
    }
    node(){}
}
public class KnapSack {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        node arr[]=new node[n];
        for (int i = 0; i < n; i++) {
            node temp=new node();
            temp.profit= sc.nextInt();
            temp.weight= sc.nextInt();
            temp.ratio=(float)temp.profit/temp.weight;
            arr[i]=temp;
        }
        int maxwt= sc.nextInt();
        float maxprofit=0;
        ms(arr,0,n-1);
        for (int i = 0; i < arr.length; i++) {
            if (maxwt<=0)
                break;
            if (arr[i].weight<maxwt){

                maxprofit+=arr[i].profit;
            }
            else {
                maxprofit+=maxwt *arr[i].ratio ;
            }
            maxwt-=arr[i].weight;
        }
        System.out.println(maxprofit);

    }
    public static void ms(node []arr, int start, int end){
        if (start<end){
            int mid=start+ (end-start)/2;
            ms(arr, start, mid);
            ms(arr, mid+1, end);
            merge(arr,start, mid, end);
        }
    }
    public static void merge(node []arr, int start,int mid, int end){
        int i=start , j=mid+1, k=start;
        node[] c=new node[end+1];
        while (i<=mid && j<=end){
            if (arr[i].ratio>=arr[j].ratio)
                c[k++]=arr[i++];
            if (arr[j].ratio>=arr[i].ratio)
                c[k++]=arr[j++];
        }
        if (i>mid){
            while (j<=end)
                c[k++]=arr[j++];
        }
        else {
            while (i<=mid)
                c[k++]=arr[i++];
        }
        for (int l = start; l <= end; l++) {
            arr[l]=c[l];
        }
    }
}