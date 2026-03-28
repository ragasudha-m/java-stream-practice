package practice.streams.intermediate;

import java.util.List;

public class FlattenNestedList {

    public static void main(String[] args) {

        List<List<Integer>> list =
                List.of(
                        List.of(1, 2),
                        List.of(3, 4),
                        List.of(5)
                );
        List<Integer> flattenedList = list.stream()
                .flatMap( e -> e.stream())
                .toList();
        System.out.println(flattenedList);
    }
}
