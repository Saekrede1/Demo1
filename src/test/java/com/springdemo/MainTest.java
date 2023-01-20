package com.springdemo;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Test
    public void testCase1() {
        System.setOut(new PrintStream(outContent));
        Main.main(null);
        assertEquals("Welcome to Java!", outContent.toString());
        System.setOut(originalOut);
    }
//    @Test
//    public void testCase2() {
//        System.setOut(new PrintStream(outContent));
//        Main.main(null);
//        assertEquals("Changed message", outContent.toString());
//        System.setOut(originalOut);
//    }
}
