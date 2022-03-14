package com.fibonacci;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class FibonacciTest {

    private Fibonacci fibonacci;

    @BeforeEach
    void startUp() {
        fibonacci = new Fibonacci();
    }

    @Tag("invalid")
    @Test
    void testInvalidNumber() {
        assertThrows(RuntimeException.class, () -> fibonacci.compute(-1));
    }

    @Tag("valid")
    @Test
    void test0() {
        assertEquals(0, fibonacci.compute(0));
    }

    @Tag("valid")
    @Test
    void test1() {
        assertEquals(1, fibonacci.compute(1));
    }

    @Tag("valid")
    @Test
    void testValidNumbers() {
        assertEquals(1, fibonacci.compute(2));
        assertEquals(2, fibonacci.compute(3));
        assertEquals(21, fibonacci.compute(8));
        assertEquals(55, fibonacci.compute(10));
    }

    @Tag("valid")
    @Test
    void testArray() {
        Integer[] expected = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610};
        List<Integer> actual = new ArrayList<>();
        for (int i = 0; i < 16; i++) {
            actual.add(fibonacci.compute(i));
        }
        assertArrayEquals(expected, actual.toArray());
    }
}
