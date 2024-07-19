package dsa;

class Cycle {

    class Node
    {
        int val;
        Node next;
        Node()
        {
            next=null;
        }
    }

    public boolean cycle_chk(Node head) {
        if (head == null || head.next == null) {
            return true; // If head or head.next is null, there's no cycle
        }

        Node slow = head;
        Node fast = head;
        do
        {
            slow=slow.next;
            fast=fast.next.next;
        }while(slow!=fast||fast !=null);
        if (slow==fast)
            return true;
        else
            return false;
    }
}