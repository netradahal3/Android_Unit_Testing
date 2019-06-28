package com.example.testing;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Arithmetic_Test {
    @Test
    public void testAdd(){
        Arithmetic arithmetic=new Arithmetic();
        float expectedResult=10;
        float actualResult=arithmetic.add(4,6);
        assertEquals(expectedResult,actualResult);
    }
    @Test
    public void testsub(){
        Arithmetic arithmetic=new Arithmetic();
        float expectedResult=10;
        float actualResult=arithmetic.sub(4,6);
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testdiv(){
        Arithmetic arithmetic=new Arithmetic();
        float expectedResult=2;
        float actualResult=arithmetic.divide(4,2);
        assertEquals(expectedResult,actualResult);
    }

}
