package PLACEMENTS.company;

import java.util.Scanner;

public class stack
{
    static int[] arrs;
    static int top=-1;
    stack(){ }
    stack(int size)
    {
        this.arrs=new int[size];
    }
    public void push()
    {
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        if (isFull())
            System.out.println("Overflow");
        else if (top==-1) {
            arrs[++top] = num;
        }
        else
            arrs[++top]=num;
    }
    public void pop()
    {
        if (isEmpty())
            System.out.println("Underflow");
        else
        {
            int temp=arrs[top];
            top--;
        }
    }
    public boolean isEmpty()
    {
        if (top==-1)
            return true;
        return false;
    }
    public boolean isFull()
    {
        if (top==arrs.length-1)
            return true;
        return false;
    }
    public void peek()
    {
        System.out.println(arrs[top]);
    }
    public void disp()
    {
        for (int i = 0; i <=top; i++) {
            System.out.println(arrs[i]);
        }
    }
}
