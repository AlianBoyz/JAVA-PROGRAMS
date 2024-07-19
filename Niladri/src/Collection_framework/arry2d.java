package Collection_framework;
import java.util.*;
public class arry2d
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        //initialising list in a list
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        //initialising list as default value is null
        for (int i=0;i<3;i++)
            list.add(new ArrayList<>());

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                list.get(i).add(sc.nextInt());
            }
        }
        //no loop required
        System.out.println(list);
    }

}
