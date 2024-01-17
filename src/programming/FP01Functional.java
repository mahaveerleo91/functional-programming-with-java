package programming;

import java.util.List;

public class FP01Functional {

        public static void main(String[] args) {
            printAllNumberInListFunctional(List.of(12, 5, 76, 89, 35, 45, 6, 7, 78, 99, 67));
        }
        private static void print(int number){
            System.out.println(number);
        }
        private static void printAllNumberInListFunctional(List<Integer> numbers){
            numbers.stream().forEach(FP01Functional::print);// method reference
        }
    }

