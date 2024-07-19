package dsa;
import java.util.*;
class linked_list
{
    static Node head=null; //Head is a global variable starting
    private static Cycle he;
    static Node Tail=null; //Tail global ref for last

    static int size=0;
    class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data=d;
            next=null;
        }
    }
    public void inst_in_first(int data) {
        //Node ptr=head;
        Node N_node = new Node(data); // creating new node with data
        if (head==null)
        {
            head=N_node;
            Tail=N_node;
        }
        else
        {
            N_node.next=head;
            head=N_node;
        }
        size+=1;
    }
    public void inst_in_last(int data)
    {
        Node N_node=new Node(data);
        if (Tail==null)
        {
            head=N_node;
            Tail=N_node;
        }
        else
        {
            Tail.next=N_node;
            Tail=N_node;
        }
        size+=1;
    }
    public void index(int index,int data)
    {
        Node N_node= new Node(data);
        Node ptr=head;
        if (index==0)
            inst_in_first(data);
        else if (index==size)
            inst_in_last(data);
        else
        {
            for (int i=0;i<index-1;i++)
            {
                ptr=ptr.next;
            }
            N_node.next=ptr.next;
            ptr.next=N_node;
        }
        size++;
    }
    public void delt_1st()
    {
        head=head.next;
        if(head==null)
            Tail=null;
        size--;
    }
    public void delt_last()
    {
        Node ptr=head;
        if (ptr.next==null) {
            head = null;
            return;
        }
        while(ptr.next!=Tail)
            ptr=ptr.next;
        Tail=ptr;
        Tail.next=null;
        size--;
    }
    public void delt_index(int index)
    {
        Node ptr=head;
        Node ptr1=head;
        for (int i=0;i<index-1;i++)
            ptr1=ptr1.next;
        ptr=ptr1;
        ptr1=ptr1.next;
        ptr.next=ptr1.next;
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
        System.out.println("Enter the no of element in List");
        linked_list ll=new linked_list();
        int n= sc.nextInt();
        for(int i=0;i<n;i++)
            ll.inst_in_last(sc.nextInt());
       // ll.index(3,100);
       // ll.disp();
        //ll.delt_index(3);
        //ll.inst_in_last(sc.nextInt());
        //ll.inst_in_last(sc.nextInt());
        //ll.inst_in_last(sc.nextInt());
        //ll.inst_in_last(sc.nextInt());

        ll.disp();
        //ll.inst_in_last(000);
        //ll.disp();
    }
}