package org.example.write_method.TwoThreads;

public class Main_solution {
    public static void main(String[] args) throws InterruptedException {
        Thread a = new Thread(() -> {
            System.out.println(cal1());
        });
        Thread b = new Thread(() -> {
            System.out.println(cal2());
        });

        a.start();

        a.join();

        b.start();

        b.join();
    }

    private static String cal1() {
        return "a";//collect all case ignore tags and sort them by alphabet
    }

    private static String cal2() {
        return "b";//collect all case ignore tags and sort them by popularity
    }
}