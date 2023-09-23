package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    void testAdd(){
        Calculator calc = new Calculator();
        int result = calc.add(4,5);
        assertEquals(9,result);
    }

    @Test
    void testSub(){
        Calculator calc = new Calculator();
        int result = calc.sub(4,5);
        assertEquals(1,result);
    }

    @Test
    void testMul(){
        Calculator calc = new Calculator();
        int result = calc.mul(4,5);
        assertEquals(20,result);
    }

    @Test
    void testRemainder(){
        Calculator calc = new Calculator();
        int result = calc.remainder(4,9);
        assertEquals(1,result);
    }

    @Test
    void testDivide(){
        Calculator calc = new Calculator();
        int result = calc.divide(4,2);
        assertEquals(2,result);
    }
}
