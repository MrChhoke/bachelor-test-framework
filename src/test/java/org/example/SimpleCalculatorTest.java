package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    @Test
    void add() {
        assertEquals(2, new SimpleCalculator().add(1, 1));
    }

    @Test
    void subtract() {
        assertEquals(0, new SimpleCalculator().subtract(1, 1));
    }
}