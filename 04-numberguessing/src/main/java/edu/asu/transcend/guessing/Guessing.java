package edu.asu.transcend.guessing;

import java.util.Random;
import java.util.Scanner;

public class Guessing {
    public static void main(String[] args) {
        // Create a Scanner to read from the Standard In "System.in"
        Scanner scanner = new Scanner(System.in);
        int numberToGuess = getRandomNumberFromJava();
        System.out.println("I guessed : " + numberToGuess);

        System.out.println("Guess what number I picked! Between 0 and 15");
        int numberToCompare = -1;

        // Do this guess and check procedure until the values are equal
        do {
            numberToCompare = scanner.nextInt();
            if (numberToCompare > numberToGuess) {
                System.out.println("Too High, try again.");
            } else if (numberToCompare < numberToGuess) {
                System.out.println("Too Low, try again.");
            }
        } while (!(numberToCompare == numberToGuess));
        // If the code makes it here, then we've guessed the right number.
        System.out.println("You got it!");
    }

    /**
     * THis method uses java.util.Random to create random integers.
     * <p>
     * mkyong tutorial that is similar to this implementation with some more explanation here
     * https://www.mkyong.com/java/java-generate-random-integers-in-a-range/
     * <p>
     * Note, we're doing this the "Java 8" way as MKYong labels it.
     * This is because the older methods are more likely to be removed in future java versions.
     * There's no reason to use the 'older' methods because it would make our program not live for as long,
     * ie - when using an older method that gets removed from the language,
     * you can no longer compile that code in newer versions of Java. This is why it's
     * important to stay up to date and aware of changes coming
     *
     * @return a random Integer between 0 and 15 inclusive.
     */
    private static int getRandomNumberFromJava() {
        // Returns a random number between 0 and 15 (has to be less than 16, which is our upper bound)
        Random r = new Random();
        return r.ints(0, 16).limit(1).findFirst().getAsInt();
        // value is returned directly, no checking or modifying.
        // This pattern, where many methods are strung together
        // is called "Method Chaining", and in some cases, the "Builder Pattern"
    }


}
