package practice.streams.intermediate;

import java.util.List;

/**
 * Calculate the sum of numbers in a list using streams.
 */
public class SumOfNumbers {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1,2,3,4,5);
        int sum = nums.stream().mapToInt(x -> x).sum();
        //Using reduce
        int reduceSum = nums.stream().reduce(0, (a, b) -> a+b);
        //Using method reference
        //int reduceSum = nums.stream().reduce(0, Integer::sum);
        System.out.println(sum);
        System.out.println(reduceSum);
    }
}
