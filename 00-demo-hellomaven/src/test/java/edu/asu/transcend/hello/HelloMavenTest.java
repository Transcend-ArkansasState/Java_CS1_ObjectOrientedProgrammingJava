package edu.asu.transcend.hello;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


// Note: Using JUnit5 so this code survives longer into the future
public class HelloMavenTest {
    // Setting up Variables so we can use them to interact with System.in and System.out
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @BeforeEach
    public void setUpStreams() {
        // Overriding System.out and System.err so we can intercept and validate
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @AfterEach
    public void restoreStreams() {
        // Undoing the Stream rewriting, just in case we add tests later that run after this.
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @Test
    public void mainTest() {
        HelloMaven.main(new String[]{});
        // We know what it should say, let's see if it said it.
        Assertions.assertEquals("Hello World", outContent.toString().trim());
    }
}