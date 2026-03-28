package practice.streams.advanced;

import java.util.Arrays;
import java.util.Comparator;
import java.util.OptionalInt;

/**
 *  Find second highest number
 * Without sorting the entire list manually.
 */
public class SecondHighestNumber {
    public static void main(String[] args) {
        Integer[] nums = {5, 3, 8, 1, 6};
        //without using sorting
//        OptionalInt max = Arrays.stream(nums).max();
//        OptionalInt secondMax = Arrays.stream(nums).filter(x -> x!=max.getAsInt()).max();
//        max.ifPresent(System.out::println);
//        System.out.println("Second highest number:");
//        secondMax.ifPresent(System.out::println);

        Integer secondMax = Arrays.stream(nums).distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(null);

        System.out.println(secondMax);

    }
}
