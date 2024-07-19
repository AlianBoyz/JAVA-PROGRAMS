package Collection_framework;
import java.util.*;
public class arrayList
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Syntax
        ArrayList<Integer> list=new ArrayList<>();

        // add
        list.add(5);
        list.add(51);
        list.add(52);
        list.add(53);

        //print
        System.out.println(list);
        for (int i = 0; i < 10; i++) {
            list.add(sc.nextInt());
        }
        // print for iteratively use ".get()"
        for (int i = 0; i < 10; i++) {
            System.out.println(list.get(i));
        }
    }
}
