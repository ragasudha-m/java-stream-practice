package practice.streams.advanced;

import java.util.Arrays;
import java.util.Comparator;


public class LongestString {
    public static void main(String[] args) {
        String[] str = {"apple", "banana", "grapefruit", "kiwi", "strawberries"};

        String longWord = Arrays.stream(str).max(Comparator.comparing(String::length)).orElse(null);

        System.out.println(longWord);
    }
}
