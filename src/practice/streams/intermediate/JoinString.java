package practice.streams.intermediate;

import java.util.List;
import java.util.stream.Collectors;

public class JoinString {
    public static void main(String[] args) {
        List<String> words = List.of("Java", "Spring", "Kafka");
        String result = words.stream().collect(Collectors.joining(" | "));
        System.out.println(result);
    }
}
