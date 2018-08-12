package edu.asu.transcend.hellodave;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.spy;

public class HelloDaveTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;


    @Mock
    Scanner scanner;

    @InjectMocks
    HelloDave helloDave = spy(HelloDave.class);

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @Test
    public void mainTest_Dave() {
        String input = "Dave";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        HelloDave.main(new String[]{});

        assertEquals("What's your name?\r\nHello, " + input, outContent.toString().trim());
    }

    @Test
    public void mainTest_Bob() {
        String input = "Bob";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        HelloDave.main(new String[]{});

        assertEquals("What's your name?\r\nHello, " + input, outContent.toString().trim());
    }

    @Test
    public void mainTest_Susan() {
        String input = "Susan";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        HelloDave.main(new String[]{});

        assertEquals("What's your name?\r\nHello, " + input, outContent.toString().trim());
    }

    @Test
    public void mainTest_Jenny() {
        String input = "Jenny";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        HelloDave.main(new String[]{});

        assertEquals("What's your name?\r\nHello, " + input, outContent.toString().trim());
    }
}