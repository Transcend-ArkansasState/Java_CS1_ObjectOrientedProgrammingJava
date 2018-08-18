package edu.asu.transcend.hellodave;

import java.util.Scanner;

/**
 * This is the classic "hello, world" example program, but with some input to say "Hello Dave"
 * <p>
 * First, the program asks your name.
 * Then, the program echo's back "Hello, [name]"
 * <p>
 * This Class is unit tested in HelloDaveTest.java with several names tested.
 */
public class HelloDave {
    /**
     * Standard Java Main Method
     * <p>
     * In this method, we create a Scaner object to read System.in (STD.IN/CONSOLE.IN)
     * <p>
     * Using scaner.next() method to scan for the next String token.
     * <p>
     * A token, in this context, is a string fragment, where the fragments
     * are separated by white-space charachters. Like a space, or a carriage return.
     *
     * @param args these are not used for this example.
     */
    public static void main(String[] args) {
        /*
        Creating a scanner object so we can read the Input from the Console. System.in is the Java console input.
         */
        Scanner scanner = new Scanner(System.in);
        /*
        Let's print something out to the user, so they know what to do.
         */
        System.out.println("What's your name?");
        /*
        At this point, we wait for Scanner.next() to return a String token. The program will halt while it waits for a RETURN on the console.
        It's important to note that this will only read the first *String Token* and not the entire input line if it includes any whitespace characters.

         */
        String name = scanner.next();
        /*
        Now we concatenate the String Token input with our greeting to say "Hello, Dave!" [ if they put "Dave" as their name.]
         */
        System.out.println("Hello, " + name);
    }
}
