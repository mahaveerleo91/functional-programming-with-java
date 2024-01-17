package programming;

import java.util.List;

public class FP01Functional {

        public static void main(String[] args) {
            List<Integer> numbers = List.of(12, 5, 76, 89, 35, 45, 6, 7, 78, 99, 67);
            //printAllNumberInListFunctional(numbers);
            printEvenNumberInListFunctional(numbers);
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
}

