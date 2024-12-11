## Task: what this program will print

```java

public class Main {
    public static class A {
        private void a1() {
            System.out.println("a1");
        }

        public static void a2() {
            System.out.println("a2");
        }

        public void a3() {
            System.out.println("a3");
        }
    }

    public static class B extends A {
        private void a1() {
            System.out.println("b1");
        }

        public static void a2() {
            System.out.println("b2");
        }

        public void a3() {
            System.out.println("b3");
        }
    }

    public static void main(String[] args) {
        A a = new B();
        a.a1();
        a.a2();
        a.a3();
    }
}

```
task code: Read more [here](./Main.java)

articles:
https://stackoverflow.com/questions/19721640/why-static-methods-are-allowed-to-invoke-private-methods