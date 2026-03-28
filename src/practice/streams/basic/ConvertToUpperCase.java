package practice.streams.basic;

import java.util.Arrays;
import java.util.List;

/**
 * Convert list of strings to uppercase
 */
public class ConvertToUpperCase {

    public static void main(String[] args) {

        /*Using List*/
        List<String> names = List.of("hello","hi","sudha");
        names.stream().map(String::toUpperCase).forEach(System.out::println);

        /*Using Array*/
        String[] namesArr = {"hello","hi","sudha"};
        Arrays.stream(namesArr).map(String::toUpperCase).forEach(System.out::println);
    }
}
