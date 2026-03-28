package practice.streams.advanced;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Find duplicate elements (only duplicates)
 */
public class FindOnlyDuplicates {
    public static void main(String[] args) {
        Integer[] nums = {5, 3, 8, 1, 6, 3, 5};

        List<Integer> duplicates = Arrays.stream(nums).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(entry-> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .toList();

        System.out.println(duplicates);
    }
}
