package programming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class FP01Functional {

        public static void main(String[] args) {
            List<Integer> numbers = new ArrayList(List.of(12, 5, 76, 89, 35, 45, 6, 7, 78, 99, 67));
            printAllNumberInListFunctional(numbers);
            printEvenNumberInListFunctional(numbers);
            printOnlyOddNum(numbers);
            printReverseNum(numbers);

            Collections.sort(numbers, Collections.reverseOrder());
            numbers.forEach(System.out::println);
        }

        private static boolean isEven(int number){
            return number%2 == 0;
        }
        private static void printAllNumberInListFunctional(List<Integer> numbers){
            numbers.stream().forEach(System.out::println);// method reference
        }
        private static void printEvenNumberInListFunctional(List<Integer> numbers){
        numbers.stream()

                //.filter(FP01Functional::isEven)
                .filter(number -> number%2 == 0 )// using lambda expression
                // only allow even number
            .forEach(System.out::println);
        }
        private static void printOnlyOddNum(List<Integer> numbers){
            numbers.stream()
                    .filter(number ->number%2==1)
                    .forEach(System.out::println);
        }

        private static void printReverseNum(List<Integer> numbers){
            IntStream.range(0, numbers.size())
                    .map(i ->numbers.size() - 1 - i)
                    .mapToObj(numbers::get)
                    .forEach(System.out::println);
        }
}

