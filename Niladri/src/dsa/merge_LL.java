package dsa;

import java.util.Scanner;

public class merge_LL
{
    Node head;
    Node tail;
    class Node
    {
        int data;
        Node next;
        Node(int val)
        {
            data=val;
            next=null;
        }
    }
    public Node inst(int val)
    {
        Node nn=new Node(val);
        if (head==null)
        {
            head = nn;
            tail = nn;
        }
        else
        {
            nn.next=head;
            head=nn;
        }
        return head;
    }
    public Node merge(Node h1,Node h2)
    {
        Node ptr =h1;
        while (ptr.next!=null)
            ptr=ptr.next;
        ptr.next=h2;
        System.out.println("Merging");
        disp(h1);
        return h1;
    }
    public void sort(Node h)
    {
        Node ptr=h;
        Node p=h;
        int t;
        while (p.next!=null)
        {
            while (ptr!=null)
            {
                if (p.data< ptr.data)
                {
                    t=p.data;
                    p.data=ptr.data;
                    ptr.data=t;
                }
                ptr=ptr.next;
            }
            p=p.next;
            ptr=p;
        }
    }
    public void disp(Node h)
    {
        Node ptr=h;
        while (ptr!=null)
        {
            System.out.print(ptr.data+" --> ");
            ptr=ptr.next;
        }
        System.out.println(" null");
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        merge_LL ml1=new merge_LL();
        System.out.println("Enter the size of LL_1");
        int n1=sc.nextInt();
        Node h1=null;
        merge_LL ml2=new merge_LL();
        System.out.println("Enter the size of LL_2");
        int n2=sc.nextInt();
        Node h2=null;
        System.out.println("data 1st");
        for (int i = 0; i < n1; i++)
        {
            h1=ml1.inst(sc.nextInt()); // call it from diff obj
        }
        System.out.println("data 2nd");
        for (int i = 0; i < n2; i++)
        {
            h2=ml2.inst(sc.nextInt());
        }
        System.out.println("print 1st");
        ml1.disp(h1);
        System.out.println("print 2nd");
        ml1.disp(h2);
        ml1.merge(h1,h2);
        ml1.sort(h1);
        ml1.disp(h1);
    }
}
