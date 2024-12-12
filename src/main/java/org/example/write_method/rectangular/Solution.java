package org.example.write_method.rectangular;

public class Solution {

    public static void main(String[] args) {
        makeRectangular(5);
    }

    static void makeRectangular(int n) {
        int i = 0;
        StringBuilder stringBuilder = new StringBuilder();
        while (i < n) {
            i++;
            stringBuilder.append("*");
            System.out.println(stringBuilder);
        }
    }
}
/*
usually people make something like this and it is, in my opinion, the fail result my solution with 'string manipulation' and efficiency for repeated concatenation is faster
public class Main {
    public static void main(String[] args) {
        // Example usage of the method
        int N = 4; // You can change this value to test with different inputs
        printRectangle(N);
    }

    // Method to print a rectangular pattern of '*'
    public static void printRectangle(int N) {
        for (int i = 1; i <= N; i++) { // Outer loop for the number of rows
            for (int j = 1; j <= i; j++) { // Inner loop for the number of '*' in a row
                System.out.print("*");
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }
}

 */
