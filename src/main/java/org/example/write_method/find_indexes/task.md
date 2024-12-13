## Task: make a method for finding pair of indexes in array which gives a target sum value
for example [1, 1] target = 2 result = [0, 1]
for example [2, 11, 7, 15] target = 9 result = [0, 2]
```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(calc(new int[]{2, 11, 7, 15}, 9)));
    }

    public static int[] calc(int[] nums, int target) {
        return null; //todo
    }
}
```
task code: Read more [here](./Main.java)

solution: [here](./MainSolution.java)

read more: https://stackoverflow.com/questions/39079605/why-does-set-add-not-return-an-object