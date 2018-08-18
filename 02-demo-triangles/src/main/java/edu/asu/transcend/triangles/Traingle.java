package edu.asu.transcend.triangles;

public class Traingle {
    public static void main(String[] args) {
        printTriangleOne(50);
        printTriangleOne(5);

        printTriangleTwo(50);
        printTriangleTwo(5);

        printTriangleOneTwoCombined(50);
        printTriangleOneTwoCombined(5);

        printTriangleThree(50);
        printTriangleThree(5);

        printTriangleFour(50);
        printTriangleFour(5);

        printTriangleThreeFourCombined(50);
        printTriangleThreeFourCombined(5);
    }

    private static void printTriangleOne(int height) {
        for (int i = 0; i <= height; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void printTriangleTwo(int height) {

        for (int i = 0; i <= height; i++) {

            for (int j = 0; j <= height - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void printTriangleOneTwoCombined(int height) {
        //TODO: If we have an odd number, we will draw a triangle a little differnetly
        for (int i = 0; i <= height; i++) {
            for (int j = 0; j <= height - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    private static void printTriangleThree(int height) {
        for (int i = height; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void printTriangleFour(int height) {

        for (int i = height; i >= 0; i--) {

            for (int j = 0; j <= height - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void printTriangleThreeFourCombined(int height) {
        //TODO: If we have an odd number, we will draw a triangle a little differnetly
        for (int i = height; i >= 0; i--) {
            for (int j = 0; j <= height - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
