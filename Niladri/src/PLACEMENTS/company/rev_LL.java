package PLACEMENTS.company;

import java.util.Scanner;

public class rev_LL
{
    static Node head=null;
    static Node tail=null;
    class Node
    {
        int data;
        Node next;
        Node prev;
        Node(int d)
        {
            data=d;
            next=null;
            prev=null;
        }
    }
    void inst(int data)
    {
        Node nn=new Node(data);
        if (head==null)
        {
            head=nn;
            tail=nn;
        }
        else
        {
            tail.next=nn;
            nn.prev=tail;
            tail=nn;
        }
    }
    void disp()
    {
        Node ptr=head;
        while (ptr!=null)
        {
            System.out.print(ptr.data+"-->");
            ptr=ptr.next;
        }
        System.out.println("null");
    }
    void rev_disp_prev()
    {
        Node ptr=tail;
        while (ptr!=null)
        {
            System.out.print(ptr.data+"-->");
            ptr=ptr.prev;
        }
        System.out.println("null");
    }
    void rev_disp()
    {

    }
    public static void main(String[] args)
    {
        rev_LL r=new rev_LL();
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            r.inst(sc.nextInt());
        }
        r.disp();
        r.rev_disp_prev();
    }
}
