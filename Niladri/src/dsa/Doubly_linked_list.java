package dsa;
import javax.management.modelmbean.InvalidTargetObjectTypeException;
import java.util.*;
public class Doubly_linked_list
{
    Node head;
    Node Tail;
    static int size=0;
    class Node
    {
        int data;
        Node next;
        Node prev;
        Node(int val)
        {
            data=val;
            next=null;
            prev=null;
        }
    }
    public void insert_front(int val)
    {
        Node nn=new Node(val);
        if (head==null)
        {
            Tail = nn;
            head = nn;
        }
        else
        {
            head.prev = nn;
            nn.next=head;
            head=nn;
        }
        size++;
    }
    public void insert_last(int data)
    {
        Node nn=new Node(data);
        if(Tail==null)
        {
            head=nn;
            Tail=nn;
        }
        else
        {
            Tail.next=nn;
            nn.prev=Tail;
            Tail=nn;
        }
        size++;
    }
    public void index_inst(int in,int val)
    {
        Node ptr=head;
        Node temp;
        Node nn=new Node(val);
        if (in==0)
            insert_front(val);
        else if(in==size)
            insert_last(val);
        else
        {
            for (int i = 0; i < i - 1; i++)
            {
                ptr = ptr.next;
            }
            nn.next=ptr.next;
            ptr.next=nn;
            nn.prev=ptr;
        }
        size++;
    }
    public void delt_1st()
    {
        if (head==null)
        {
            head = null;
            return;
        }
        head=head.next;
        size--;
    }
    public void delt_last()
    {
        if (Tail==null)
        {
            Tail=null;
            return;
        }
        Tail=Tail.prev;
        Tail.next=null;
        size--;
    }
    public void delete_index(int in)
    {
        Node ptr=head;
        if (in==size)
            delt_last();
        else if (in==0)
            delt_1st();
        else
        {
            for (int i = 0; i < in; i++)
            {
                ptr = ptr.next;
            }
            (ptr.prev).next = ptr.next;
            (ptr.next).prev = ptr.prev;
        }
        size--;
    }
    public void display()
    {
        Node ptr=head;
        System.out.print("null ");
        while (ptr!=null)
        {
            System.out.print(" <--> "+ptr.data);
            ptr=ptr.next;
        }
        System.out.println(" <--> null");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Doubly_linked_list dll=new Doubly_linked_list();
        System.out.println("Enter the size of DLL");
        int size=sc.nextInt();
        for (int i = 0; i < size; i++)
        {
            dll.insert_last(sc.nextInt());
        }
        dll.display();
        //dll.index_inst(1,100);
        //dll.delt_last();
        dll.delete_index(1);
        dll.display();
    }
}
