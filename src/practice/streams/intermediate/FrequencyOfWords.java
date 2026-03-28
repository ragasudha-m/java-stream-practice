package practice.streams.intermediate;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Remove duplicates
 * Remove duplicates without using Set explicitly.
 */
public class FrequencyOfWords {

    public static void main(String[] args) {
        String[] words = {"apple", "banana", "apple", "orange", "banana", "grape"};

        Map<String, Long> freq =Arrays.stream(words)
                .collect(Collectors.groupingBy(
                        w -> w,
                        Collectors.counting()));

        //Using Function.identity() instead of w -> w
        //Map<String, Long> freq =Arrays.stream(words).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        freq.forEach((k,v) -> System.out.println(k + ": " + v));
    }
}
