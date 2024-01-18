import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Exercises {
    public static void main(String[] args) {
        List.of("Apple", "Ant", "Bat").stream().map(s -> s.toLowerCase()).forEach(p -> System.out.println(p)); //  print in lower case of given list of words
        IntStream.rangeClosed(1,10).map(n -> n * n).forEach(n -> System.out.println(n)); // print square of the numbers from 1 to 10
        List.of("Apple", "Ant", "Cockroches").stream().map(s -> s.length()).forEach(s -> System.out.println(s)); // Print lenth of the given list of words
        System.out.println(IntStream.range(1,100).reduce(0,(n1,n2) -> n1 + n2)); // Print all the number from 1 to 100 using stream

    }
}
