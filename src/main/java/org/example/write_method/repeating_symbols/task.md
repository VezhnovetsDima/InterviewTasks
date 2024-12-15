## Task: write a method for counting repeating letters in string

```java
//write a method for counting repeating letters in string
//
//for example aaaabbbcc
//a               : 4
//b               : 3
//c               : 2
public class Main {
    public static void main(String[] args) {
        String testString = "aaaabbbcc";
        countRepeatingLetters(testString).forEach((k, v) -> System.out.printf("%-15s : %s%n", k, v));
    }

    private static Map<String, Integer> countRepeatingLetters(String str) {
        return null;
    }
}

```
task code: Read more [here](./Main.java)
solution: [here](./Main_solution.java)