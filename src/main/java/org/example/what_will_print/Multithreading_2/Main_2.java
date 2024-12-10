package org.example.what_will_print.Multithreading_2;

public class Main_2 {
    public static void main(String[] args) {
        final int [] i = {0};
        for (int j = 0; j < 10; j++) {
            for (int c = 0; c < 10; c++) {
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
