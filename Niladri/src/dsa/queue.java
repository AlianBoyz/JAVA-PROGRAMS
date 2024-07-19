package dsa;

import java.util.*;
public class queue {
    static int p=-1;
    public static void enqueue(int []arr,int data)
    {
        if (!isFull(arr))
        {
            p += 1;
            arr[p] = data;
            System.out.println(data+" added");
        }
        else
           System.out.println("full");

    }

    public static void dequeue(int []arr)
    {
        if(!isEmpty(arr))
        {
            int ele = arr[0];
            for (int i=0;i<p;i++)
            {
                arr[i]=arr[i+1];
            }
            p-=1;
            System.out.println(ele+" deleted");
        }
        else
            System.out.println("Empty");
    }

    public static boolean isEmpty(int arr[])
    {
        if (p<0)
            return true;
        else
            return false;
    }

    public static boolean isFull(int arr[])
    {
        if (p==sz(arr))
            return true;
        else
            return false;
    }

    public static int front(int arr[])
    {
        int ele=arr[0];
        if (!isEmpty(arr))
            return ele;
        else
            return -99;
    }
    public static int rear(int arr[])
    {
        if (!isEmpty(arr))
            return arr[p];
        else
            return -99;
    }
    public static int sz(int arr[])
    {
        int size=arr.length;
        return size;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size");
        int size= sc.nextInt();
        int q[]=new int[size];
        enqueue(q,1);
        enqueue(q,2);
        enqueue(q,3);
        System.out.println(front(q));
        System.out.println(rear(q));
        //System.out.println(sz(q));
        dequeue(q);
        dequeue(q);
        //dequeue(q);
        System.out.println(front(q));
        System.out.println(rear(q));
    }
}
