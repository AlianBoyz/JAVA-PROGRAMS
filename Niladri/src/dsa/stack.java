package dsa;
import java .util.*;
public class stack
{
    static int tp=-1;
    public int push(int ele,int []arr)
    {
        if (!isFull(arr))
        {
            tp += 1;
            arr[tp] = ele;
            return ele;
        }
        else
        {
            System.out.println("Stack full");
            return arr.length-1;
        }
    }
    public int pop(int []arr)
    {
        if (!isEmpty(arr))
        {
            return arr[tp--];
        }
        else
        {
            System.out.println("Stack is Empty");
            return -1;
        }
    }
    public static boolean isEmpty(int []arr)
    {
        if (tp==-1)
            return true;
        else
            return false;
    }
    public static boolean isFull(int []arr)
    {
        if (tp==arr.length-1)
            return true;
        else
            return false;
    }
    public void disp(int []arr)
    {
        int t=tp;
        while (t!=-1)
        {
            System.out.println(arr[t]);
            t-=1;
        }
    }
    public int peek(int []arr,int ind)
    {
        if (ind==-1 && ind==arr.length-1)
            return -999;
        return arr[ind];
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        stack st=new stack();
        System.out.println("Enter the size");
        int size=sc.nextInt();
        int []arr=new int[size];

        System.out.println(st.push(1,arr));
        System.out.println(st.push(2,arr));
        System.out.println(st.push(3,arr));
        System.out.println(st.push(4,arr));

        System.out.println(st.isEmpty(arr));
        System.out.println(st.isFull(arr));

        st.disp(arr);
        System.out.println();
        System.out.println(st.pop(arr));
        System.out.println(st.pop(arr));
        System.out.println();
        st.disp(arr);

        System.out.println();
        System.out.println(st.peek(arr,1));
        System.out.println(st.isEmpty(arr));
        System.out.println(st.isFull(arr));
    }
}
