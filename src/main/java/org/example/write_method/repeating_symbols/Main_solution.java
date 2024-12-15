package org.example.write_method.repeating_symbols;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Main_solution {
    public static void main(String[] args) {
        String testString = "aaaabbbcc";
        countRepeatingLetters(testString).forEach((k, v) -> System.out.printf("%-15s : %s%n", k, v));
    }

    private static Map<String, Integer> countRepeatingLetters(String str) {
        return Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(s -> s))
                .entrySet()
                .stream()
                .collect(Collectors.toMap(Map.Entry::getKey, e -> e.getValue().size()));

    }
}
