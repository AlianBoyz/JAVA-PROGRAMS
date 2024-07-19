package dsa;
import java.util.*;


public class Circular_Linked_list
{
    static Node head=null;
    static Node tail=null;
    static int size=0;

    class Node
    {
        int data;
        Node next;
        Node(int val)
        {
            data=val;
        }
    }
    public void insert(int data)
    {
        Node nn = new Node(data);
        if (head == null)
        {
            head = nn;
            tail = nn;
            return;
        }
        tail.next=nn;
        nn.next=head;
        tail=nn;
        size++;
    }

    public void display()
    {
        Node ptr=head;
        if (ptr==null){
            System.out.println("null");
            return;
        }
        do
        {
            System.out.print(ptr.data + " -->");
            ptr = ptr.next;
        }while (ptr!=head);
        //System.out.println("head"+head.data);
        //System.out.println("tail"+tail.data);
    }
    public void delete(int val)
    {
        Node ptr=head;
        if (ptr==null || size<=1){
            return;
        }
        else{
        while(val!=(ptr.next).data)
            ptr=ptr.next;
        if (ptr.next==head)
        {
            ptr.next = (ptr.next).next;
            head=ptr.next;
        }
        else if (ptr.next==tail)
        {
            ptr.next = (ptr.next).next;
            tail=ptr;
        }
        else
        {
            ptr.next=ptr.next.next;
        }
        size--;}
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Circular_Linked_list cll=new Circular_Linked_list();
        System.out.println("Enter the size of CLL");
        int size=sc.nextInt();
        for (int i = 0; i < size; i++)
        {
            cll.insert(sc.nextInt());
        }
        //cll.delete(3);
        cll.display();
    }
}
