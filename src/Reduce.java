import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class Reduce {

    public  static  int sum_java_even(List<Integer> list)
    {
        return  list.stream().filter(i-> i>30).mapToInt(i->i).sum();
    }

    public static int sum_even(List<Integer> list)
    {
        return list.stream().filter(i->i%3==0).mapToInt(i->i).sum();
    }
    public static int sum(List<Integer> list)
    {
        Iterator<Integer> it = list.iterator();

        int res =0;

        while(it.hasNext())
        {
            int num = it.next();

            if (num>30)
            {
                res  = res + num;
            }
        }

        return res;
    }

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();

        list.add(78);
        list.add(34);
        list.add(23);
        list.add(12);

        System.out.println(sum_even(list));



    }
}
