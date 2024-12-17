package org.example.write_method.tags;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main_solution {
    public static void main(String[] args) {
        List<String> text = List.of("Hello #Moscow", "Hello #Minsk", "Hello #Kiev", "#Kiev is the most prettiest place", "#Moscow is bigger then #Minsk", "#Minsk is smaller then #Kiev");
        System.out.println(getTags(text));
        System.out.println(getTagsByPopularity(text));
    }

    private static List<String> getTags(List<String> list) {
        return list
                .parallelStream()
                .flatMap(s -> Arrays.stream(s.toLowerCase().split(" ")))
                .filter(s -> s.startsWith("#"))
                .collect(Collectors.toSet())
                .stream()
                .sorted()
                .toList();//collect all case ignore tags and sort them by alphabet
    }

    private static List<String> getTagsByPopularity(List<String> list) {
        return list
                .parallelStream()
                .flatMap(s -> Arrays.stream(s.toLowerCase().split(" ")))
                .filter(s -> s.startsWith("#"))
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()))
                .entrySet()
                .parallelStream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .map(Map.Entry::getKey)
                .toList();//collect all case ignore tags and sort them by popularity
    }
}
