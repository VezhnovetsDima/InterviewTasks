## Task: make a method for finding duplicates indexes in integer list

```java
public class Duplicate_1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(4);
        list.add(2);

        System.out.println(Arrays.toString(findDuplicateIndexes(list).toArray()));
    }

    public static List<Integer> findDuplicateIndexes(List<Integer> list) {
        //make a method for finding duplicates indexes in integer list
    }
}
```
task code: Read more [here](./Make_constructor.java)

solution: [here](./Make_constructor_solution.java)

Read more: https://www.baeldung.com/java-type-erasure