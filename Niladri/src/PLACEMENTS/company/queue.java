package PLACEMENTS.company;

import java.util.Scanner;

public class queue
{

    Scanner sc=new Scanner(System.in);
    int front=-1, rear=-1;
    int[]  arr;
    public queue() {    }
    queue(int s)
    {
        this.arr=new int[s];
    }
    public void enqueue()
    {
        int num= sc.nextInt();
        if (isFull())
            System.out.println("Overflow");
        else if (front==-1 && rear==-1)
        {
            rear++;
            front++;
            arr[rear]=num;
        }
        else
        {
            arr[++rear]=num;
        }
    }
    public void dqueue()
    {
        if (isEmpty())
        {
            System.out.println("Underflow");
        }
        else if (front==rear)
        {
            int temp = arr[front];
            System.out.println("Element is removed"+temp);
            front=-1;
            rear=-1;
        }
        else
        {
            int temp = arr[front];
            System.out.println("Element is removed"+temp);
            front++;
        }
    }
    public void peek_front()
    {
        System.out.println("Front element "+arr[front]);
    }
    public void peek_rear()
    {
        System.out.println("Rear element"+arr[rear]);
    }
    public boolean isFull()
    {
        if (rear==arr.length-1)
            return true;
        return false;
    }
    public boolean isEmpty()
    {
        if(front==-1&&rear==-1)
            return true;
        return false;
    }
    public void qsize()
    {
        System.out.println("Size = "+(rear+1));
    }
    public void disp()
    {
        for (int i=front;i<=rear;i++)
        {
            System.out.print(arr[i]+" "+"\n");
        }
    }
}
