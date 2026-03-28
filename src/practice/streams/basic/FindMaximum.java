package practice.streams.basic;

import java.util.List;
/**
 * Find the maximum number
 * Given a list of numbers, find the maximum number in the list.
 */
public class FindMaximum {

    public static void main(String[] args) {
        List<Integer> nums = List.of(11,2,5,7,9,6);
        int max = nums.stream().mapToInt(x->x).max().getAsInt();

        System.out.println("Maximum number: " + max);
    }
}
