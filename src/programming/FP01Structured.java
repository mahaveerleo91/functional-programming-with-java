package programming;

import java.util.List;

public class FP01Structured {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 5, 76, 89, 35, 45, 6, 7, 78, 99, 67);
        //printAllNumberInListStructured(numbers);
        printEvenNumberInListStructured(numbers);
    }
    private static void printAllNumberInListStructured(List<Integer> numbers){
        // Loop the numbers
        for (int number: numbers){
            System.out.println(number);
        }
    }
    private static void printEvenNumberInListStructured(List<Integer> numbers){
        // Loop the numbers
        for (int number: numbers){
            if(number%2==0)
            System.out.println(number);
        }
    }
}