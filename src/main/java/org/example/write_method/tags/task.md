## Task: write a method 

```java
package org.example.write_method.tags;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> text = List.of("Hello #Moscow", "Hello #Minsk", "Hello #Kiev", "#Kiev is the most prettiest place", "#Moscow is bigger then #Minsk", "#Minsk is smaller then #Kiev");
        System.out.println(getTags(text));
        System.out.println(getTagsByPopularity(text));
    }

    private static List<String> getTags(List<String> list) {
        return null;//collect all case ignore tags and sort them by alphabet
    }

    private static List<String> getTagsByPopularity(List<String> list) {
        return null;//collect all case ignore tags and sort them by popularity
    }
}


```
task code: Read more [here](./Main.java)
solution: [here](./Main_solution.java)