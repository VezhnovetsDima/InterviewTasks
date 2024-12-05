package org.example.what_will_print.Multithreading_1;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Main extends Thread {
    private static int a;
    private static int b;
    private boolean flag;

    @Override
    public void run() {
        if(flag) {
            a = 2;
            b = 4;
        } else {
            System.out.println("a = " + a + " b = " + b);
        }
    }

    public static void main(String[] args) {
        Main thread1 = new Main();
        Main thread2 = new Main();
        thread1.setFlag(true);
        thread1.start();
        thread2.start();
    }
}
