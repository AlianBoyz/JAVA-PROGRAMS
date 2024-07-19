package PLACEMENTS.company;

import java.util.Scanner;

public class stack_queue
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 for stack");
        System.out.println("Enter 2 for queue");
        int num=sc.nextInt();
        if (num==1) {
            System.out.println("Enter size");
            int size=sc.nextInt();
            st_view(size);
        }
        else {
            System.out.println("Enter size");
            int size1=sc.nextInt();
            qu_view(size1);
        }
    }

    private static void qu_view(int s) {
        Scanner sc = new Scanner(System.in);
        queue q=new queue(s);
        int c = 0;
        while (c != 9) {
            System.out.println("Enter the choice");
            System.out.println("1 for enqueue");
            System.out.println("2 for dequeue");
            System.out.println("3 for peek front");
            System.out.println("4 for peek rear");
            System.out.println("5 for is empty");
            System.out.println("6 for is full");
            System.out.println("7 for size");
            System.out.println("8 for display");
            System.out.println("9 for exit");
            c = sc.nextInt();
            if (c == 1)
                q.enqueue();
            else if (c == 2)
                q.dqueue();
            else if (c == 3)
                q.peek_front();
            else if (c == 4)
                q.peek_rear();
            else if (c == 5)
                q.isEmpty();
            else if (c == 6)
                q.isFull();
            else if (c == 7)
                q.qsize();
            else if(c==8)
                q.disp();
        }
    }

    private static void st_view(int s)
    {
        Scanner sc=new Scanner(System.in);
        stack st=new stack(s);
        int c=0;
        while(c!=5)
        {
            System.out.println("Enter the choice");
            System.out.println("1 for push");
            System.out.println("2 for pop");
            System.out.println("3 for peek");
            System.out.println("4 for display");
            System.out.println("5 for exit");
            c= sc.nextInt();
            if (c==1)
                st.push();
            else if (c==2)
                st.pop();
            else if (c==3)
                st.peek();
            else if (c==4)
                st.disp();
        }
    }
}
