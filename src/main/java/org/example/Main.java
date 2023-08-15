package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Main {
    public static void main(String[] args) {
        testAddition();
        testSubtraction();

    }

    @Test
    static void testAddition() {
        int result = Calculator.addition(2, 3);
        assertEquals(5, result, "Addition result is incorrect");
        System.out.println(result);
    }

    @Test
    static void testSubtraction() {
        int result = Calculator.subtraction(10, 10);
        assertTrue(result == 0, "Subtraction result should be positive");
        System.out.println(result);
    }
}

class Calculator {
    public static int addition (int a, int b) {
        return a + b;
    }
    public static int subtraction (int a, int b) {
        return a - b;
    }
}