package dsa;
import java.util.*;
// Insert LL data using recursion
public class questions_LL
{
    Node head;
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
    public void insert(int data)
    {
        Node N_node = new Node(data); // creating new node with data
        if (head==null)
        {
            head=N_node;
        }
        else
        {
            N_node.next=head;
            head=N_node;
        }
    }
    public void removeDup()
    {
        Node ptr=head;
        while (ptr.next!=null)
        {
            if (ptr.data==ptr.next.data)
            {
                ptr.next=ptr.next.next;
                //s--;
            }
            else
                ptr=ptr.next;
        }
    }
    public void sort()
    {
        Node ptr=head;
        Node p=head;
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
    public void disp()
    {
        System.out.println("Values of Linked List are:");
        Node ptr=head;
        while (ptr!=null)
        {
            System.out.print(ptr.data+" --> ");
            ptr=ptr.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        questions_LL q=new questions_LL();
        System.out.println("Enter the size of LL");
        int size=sc.nextInt();
        for (int i = 0; i < size; i++)
        {
            q.insert(sc.nextInt());
        }
        q.disp();
        q.sort();
        //q.removeDup();
        q.disp();
    }
}
