package com.algorithms;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryConvertTest {


    @Test
    public void testConvertFromBinary() {
        assertEquals(37, BinaryConvert.convertFromBinary("100101"));
    }

    @Test
    public void testMegaStringCount() {
        assertEquals(2147483647, BinaryConvert.convertFromBinary("01111111111111111111111111111111"));
    }

    @Test
    public void testConvertFromBinaryBoundary() {
        assertEquals(0, BinaryConvert.convertFromBinary("0"));
    }

    @Test(expected = NullPointerException.class)
    public void convertFromBinaryNull() {
        BinaryConvert.convertFromBinary(null);
    }

    @Test(expected = NumberFormatException.class)
    public void convertFromBinaryEmptyString() {
        BinaryConvert.convertFromBinary("");
    }

    @Test(expected = NumberFormatException.class)
    public void otherDigitsTest() {
        BinaryConvert.convertFromBinary("11112");
    }

    @Test(expected = NumberFormatException.class)
    public void otherCharactersTest() {
        BinaryConvert.convertFromBinary("purple");
    }

    @Test(expected = NumberFormatException.class)
    public void otherValueOutsideRange() {
        BinaryConvert.convertFromBinary("1000000000000000000000000000000000000");
    }

}

