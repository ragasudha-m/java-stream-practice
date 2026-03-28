package practice.streams.intermediate;


import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
public class GroupEvenAndOdd {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Map<String, List<Integer>> evenOdd = nums.stream()
                .collect(Collectors.groupingBy(x->x%2==0?"Even":"Odd", Collectors.toList()));

        evenOdd.forEach((k,v)->{
            System.out.println("Key:"+ k + " Values:");
            v.forEach(System.out::println);
        });
    }
}
