## Task: which datatypes can be set in '***' place

```java
public class Main {
    public static void main(String[] args) {
        List<? extends Number> list = new ArrayList<>();
        //*** toAddValue = null;
        //list.add(toAddValue);
        //*** getValue = list.get(0);
    }
}
```
task code: Read more [here](./Main.java)


Solution:
List<? extends Number> is read-only for adding elements:
The wildcard ? extends Number allows the list to accept any type that extends Number (e.g., Integer, Double, Float), but the compiler cannot determine the exact subtype at runtime.
Therefore, adding elements is restricted to avoid type safety violations.

You cannot add any value other than null.
The only operation allowed is retrieval, and the retrieved type is guaranteed to be Number.

for example
List<? extends Number> list = new ArrayList<>();
list.add(3.14); // Error: The actual list type might be ArrayList<Integer>, ArrayList<Double>, and etc.

*** getValue = list.get(0); might be only Object, Number, var(it is not a datatype, but you can demonstrate your knowledges)

extends worked as you think only if there was only one extend class from Number interface

also the code will work as someone expected  if you set super in list declaration
example:
```java
public class Main {
    public static void main(String[] args) {
        List<? super Number> list = new ArrayList<>();
        Integer toAddValue = 32;
        list.add(toAddValue);
        Integer getValue = (Integer) list.get(0);
    }
}
```
articles:
https://www.baeldung.com/java-generics-vs-extends-object
https://amitosh.medium.com/java-generics-producer-extends-consumer-super-7235307d3d11