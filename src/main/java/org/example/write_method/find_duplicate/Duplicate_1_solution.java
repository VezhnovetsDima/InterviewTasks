package org.example.write_method.find_duplicate;

import java.util.*;

public class Duplicate_1_solution {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(4);
        list.add(2);
        list.add(2);

        System.out.println(Arrays.toString(findDuplicateIndexes(list).toArray()));
    }

    public static List<Integer> findDuplicateIndexes(List<Integer> list) {
        if (list == null || list.size() <= 1) {
            return new ArrayList<>();
        }

        Set<Integer> seen = new HashSet<>();
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (!seen.add(list.get(i))) { //Set.add() return true if the value is unique, and false if the value is present
                result.add(i);
            }
        }

        return result;
    }
}
