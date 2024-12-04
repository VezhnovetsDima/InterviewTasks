package org.example.what_will_print.Anthropod;

public class Anthropod {
    public Anthropod() {
        System.out.println("Super");
    }

    public void printName(Double input) {
        System.out.println("Anthropod");
    }
}

class Spider extends Anthropod {
    public void printName(Integer input) {
        System.out.println("Anthropod");
    }

    public static void main(String[] args) {
        Spider spider = new Spider();
        spider.printName(3);
        spider.printName(3.0);
    }
}
