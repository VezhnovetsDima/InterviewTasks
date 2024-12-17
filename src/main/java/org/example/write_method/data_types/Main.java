package org.example.write_method.data_types;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<? super Number> list = new ArrayList<>();
        Integer toAddValue = 32;
        list.add(toAddValue);
        Integer getValue = (Integer) list.get(0);
    }
}
