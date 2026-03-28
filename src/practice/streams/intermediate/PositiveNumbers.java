package practice.streams.intermediate;

import java.util.Arrays;
public class PositiveNumbers {
    public static void main(String[] args) {
        Integer[] nums = {-5, 3, -2, 8, -1, 6};

      boolean isPositive = Arrays.stream(nums).allMatch( n -> n>0);
      //.anyMatch(n -> n < 0) - checks if any negative
        //.noneMatch(n -> n <= 0) - no zero or negative

        System.out.println(isPositive);
    }
}
