package org.multigenesys;

public class Main {
    // java test 0001
    static void DiamondPattern(){
            int n = 5;

            // Upper part
            for (int i = 1; i <= n; i++) {

                // Leading spaces
                for (int j = i; j < n; j++) {
                    System.out.print(" ");
                }

                System.out.print("*");

                // Inner spaces
                if (i > 1) {
                    for (int j = 1; j <= (2 * i - 3); j++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }

                System.out.println();
            }

            // Lower part
            for (int i = n - 1; i >= 1; i--) {

                // Leading spaces
                for (int j = n; j > i; j--) {
                    System.out.print(" ");
                }

                System.out.print("*");

                // Inner spaces
                if (i > 1) {
                    for (int j = 1; j <= (2 * i - 3); j++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }

                System.out.println();
            }

    }

    // java test 0002
    static void NumberPyramid() {

        int n = 5;

        for (int i = 1; i <= n; i++) {

            // Print leading spaces
            for (int j = i; j < n; j++) {
                System.out.print("  ");
            }

            // Print increasing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            // Print decreasing numbers
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }

    // java test 0003
    static void BinaryTriangle() {

        int n = 6;

        for (int i = 1; i <= n; i++) {

            int num;
            if (i % 2 == 1) {
                num = 1;   // odd row starts with 1
            } else {
                num = 0;   // even row starts with 0
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num = (num == 1) ? 0 : 1; // toggle between 1 and 0
            }

            System.out.println();
        }

    }

    // java test 0004
    static void ConcentricPattern() {

        int n = 4;
        int size = 2 * n - 1;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {

                int top = i;
                int left = j;
                int right = size - 1 - j;
                int bottom = size - 1 - i;

                int min = Math.min(Math.min(top, bottom), Math.min(left, right));

                System.out.print((n - min) + " ");
            }
            System.out.println();
        }


    }

    // java test 0005
    static void NumberTriangle() {

        int n = 5;
        int num = 1;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }

            System.out.println();
        }



    }


    public static void main(String[] args) {
        DiamondPattern();
        NumberPyramid();
        BinaryTriangle();
        ConcentricPattern();
        NumberTriangle();
    }
}