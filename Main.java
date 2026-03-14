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

    public static void main(String[] args) {
        DiamondPattern();
    }
}