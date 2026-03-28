package practice.streams.basic;

import java.util.List;

/**
 * Square all numbers
 * Given a list of numbers, calculate the square of each number.
 */
public class CalculateSquare {
    public static void main(String[] args) {
        List<Integer> nums = List.of(2,3,4);
        List<Integer> square = nums.stream().mapToInt(x -> x*x).boxed().toList();
        square.forEach(System.out::println);

        System.out.println("Without using mapToInt");
        //Without using mapToInt
        nums.stream().map(x-> x*x).forEach(System.out::println);
    }
}
