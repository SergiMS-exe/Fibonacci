package tests;

import static org.junit.jupiter.api.Assertions.*;

import main.Fibonacci;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FibonacciTest {

    private Fibonacci fibonacci;

    @BeforeEach
    void startUp(){
        fibonacci=new Fibonacci();
    }

    @Test
    void testInvalidNumber(){
        assertThrows(RuntimeException.class,()->fibonacci.compute(-1));
    }

    @Test
    void test0(){
        assertEquals(0, fibonacci.compute(0));
    }

    @Test
    void test1(){
        assertEquals(1, fibonacci.compute(1));
    }

    @Test
    void testValidNumbers(){
        assertEquals(1, fibonacci.compute(2));
        assertEquals(2, fibonacci.compute(3));
        assertEquals(21, fibonacci.compute(8));
        assertEquals(55, fibonacci.compute(10));
    }
}
