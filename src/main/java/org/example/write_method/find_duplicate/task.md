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
task code: Read more [here](./Duplicate_1.java)

solution: [here](./Duplicate_1_solution.java)

read more: https://stackoverflow.com/questions/39079605/why-does-set-add-not-return-an-object