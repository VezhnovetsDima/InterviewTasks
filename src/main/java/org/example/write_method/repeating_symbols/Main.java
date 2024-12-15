package org.example.write_method.repeating_symbols;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String testString = "aaaabbbcc";
        countRepeatingLetters(testString).forEach((k, v) -> System.out.printf("%-15s : %s%n", k, v));
    }

    private static Map<String, Integer> countRepeatingLetters(String str) {
        return null;
    }
}
