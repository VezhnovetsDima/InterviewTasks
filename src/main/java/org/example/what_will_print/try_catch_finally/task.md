## Task: what this program will print

```java
public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("try");
            throw new RuntimeException();
            System.out.println("throw");
        } catch (Exception e) {
            System.out.println("catch");
            throw new RuntimeException();
        } finally {
            System.out.println("finally");
        }
    }
}
```
task code: Read more [here](./Main.java)

articles:
https://javarush.com/en/groups/posts/en..exceptions-in-java-java-exception