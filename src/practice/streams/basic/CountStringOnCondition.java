package practice.streams.basic;

import java.util.List;

/**
 *  Count strings starting with a letter
 * Given a list of strings, count how many strings start with the letter 'A'.
 */
public class CountStringOnCondition {

    public static void main(String[] args) {
        List<String> names = List.of("Apple", "Ant", "Ball", "Air");

        long count = names.stream().filter(x->x.charAt(0)=='A').count();
        System.out.println("Count of words starting with 'A':"+count);
    }
}
