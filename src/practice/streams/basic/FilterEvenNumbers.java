package practice.streams.basic;

import java.util.List;

/**
 * Filter even numbers
 * Given a list of integers, return a list of even numbers.
 * JavaList<Integer> nums = List.of(1,2,3,4,5,6);
 */
public class FilterEvenNumbers {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1,2,3,4,5,6);
        List<Integer> even = nums.stream().filter(x -> x%2==0).toList();
        even.forEach(System.out::println);
    }
}
