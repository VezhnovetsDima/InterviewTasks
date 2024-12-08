## Task: what this program will print

```java
public class Super {
    Super() {
        System.out.println("Super constructor");
    }
}

class Main extends Super {
    Main() {
        this(1);
        System.out.println("Main() constructor");
    }

    Main(int a) {
        System.out.println("Main(int) constructor");
    }

    public static void main(String[] args) {
        new Main();
    }
}
```
task code: Read more [here](./Super.java)

articles:
https://www.baeldung.com/java-initialization
(more code examples) https://www.geeksforgeeks.org/order-execution-initialization-blocks-constructors-java/