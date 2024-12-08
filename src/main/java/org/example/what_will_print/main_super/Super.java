package org.example.what_will_print.main_super;

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