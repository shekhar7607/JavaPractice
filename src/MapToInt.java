import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MapToInt {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("3", "6", "8",
                "14", "15");

        list.stream()
                .mapToInt(num -> Integer.parseInt(num))
                .filter(num -> num%3 ==0)
                .forEach(System.out::println);

List<String> str = Arrays.asList("mikku","sonu","tikku","adil");

str.stream().mapToInt(s->s.length()).forEach(System.out::println);


    }

}
