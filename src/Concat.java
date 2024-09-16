import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Concat {
    public static void main(String[] args) {

        List<Integer> l = new ArrayList<>();

        l.add(45);
        l.add(35);
        l.add(12);

        List<Integer> arr = new ArrayList<Integer>();

        arr.add(45);
        arr.add(1);
        arr.add(90);

        l.addAll(arr);

        System.out.println(l);

        System.out.println();

        int g = l.stream().sorted(Comparator.reverseOrder()).limit(3).skip(2).findFirst().get();
        System.out.println(g);
    }

}
