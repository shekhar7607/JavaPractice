import java.util.Arrays;
import java.util.stream.Stream;

public class StreamTest {

    public static void main(String[] args) {

        String[] arr = {"Geeks", "for", "geeks"};

        Stream<String> stream = Arrays.stream(arr);

        stream.forEach(str -> System.out.print(str + " "));


    }

}
