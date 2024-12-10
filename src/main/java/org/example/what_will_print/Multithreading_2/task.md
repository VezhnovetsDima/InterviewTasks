## Task: what this program will print and what can you make better

```java
public class Main_2 {
    public static void main(String[] args) {
        final int [] i = {0};
        for (int j = 0; j < 10; j++) {
            for (int c = 0; c< 10; c++) {
                new Thread(() -> {
                    ++i[0];
                    try {
                        Thread.sleep(3);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    --i[0];
                }).start();
            }
        }

        System.out.println(i[0]);
    }
}
```
task code: Read more [here](./Main_2.java)

articles:
https://www.baeldung.com/java-thread-join

What can i make better?

i think something like this, when each thread fully work(it may be prettier, but the main key in this point)
```java
public class Main_2 {
    public static void main(String[] args) {
        final int [] i = {0};
        for (int j = 0; j < 10; j++) {
            for (int c = 0; c < 10; c++) {
                var a = new Thread(() -> {
                    ++i[0];
                    try {
                        Thread.sleep(3);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    --i[0];
                });

                a.start();
                try {
                    a.join();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        System.out.println(i[0]);
    }
}
```

