package edu.asu.transcend.operations;

/**
 * https://introcs.cs.princeton.edu/java/11precedence/
 * "Most programmers do not memorize them all, and even those that do still use parentheses for clarity"
 */
public class Operations {
    public static void main(String[] args) {

        leftToRight(10, 20, 100, 10);
        traditionalOrder(10, 20, 100, 10);
    }

    private static int leftToRight(int a, int b, int c, int d) {
        System.out.println("A + B - C * D / A with, A: " + b + " B: " + b + " C: " + c + " D: " + d);
        int result = (a + b - c * d / a);
        System.out.println("Equals: " + result);
        return result;
    }

    private static int traditionalOrder(int a, int b, int c, int d) {
        System.out.println("(A + B )- ((C * D) / A) with, A: " + b + " B: " + b + " C: " + c + " D: " + d);
        int result = (a + b) - ((c * d) / a);
        System.out.println("Equals: " + result);
        return result;
    }


}
