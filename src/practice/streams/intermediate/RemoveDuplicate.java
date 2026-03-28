package practice.streams.intermediate;

import java.util.List;
/**
 * Remove duplicates without using Set explicitly.
 */
public class RemoveDuplicate {

    public static void main(String[] args) {
        List<Integer> nums = List.of(1,2,2,3,3,4);

        List<Integer> uniqueNums = nums.stream().distinct().toList();
        uniqueNums.forEach(System.out::println);
    }
}
