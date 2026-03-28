package practice.streams.advanced;

import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.LinkedHashMap;
import java.util.Map;
/**
 * Find the first non-repeated character in a string using Java Streams.
 */
public class FirstNonRepeatedCharacter {

    public static void main(String[] args) {
        if(args.length!=1)
            System.out.println("Wrong number of arguments");
        String input = args[0];
        Character answer = input.chars().mapToObj(c -> (char)c).collect(
                Collectors.groupingBy(Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()))
                .entrySet().stream()
                .filter( v -> v.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst().orElse(null);

        System.out.println(answer);


    }
}
