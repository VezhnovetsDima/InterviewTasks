package org.example.what_will_print.try_catch_finally;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("try");
            throw new RuntimeException();
            //System.out.println("throw"); remove comment and see error
        } catch (Exception e) {
            System.out.println("catch");
            throw new RuntimeException();
        } finally {
            System.out.println("finally");
        }
    }
}
