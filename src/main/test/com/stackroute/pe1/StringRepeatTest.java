package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringRepeatTest {
    StringRepeat stringRepeat=new StringRepeat();
    @Before
    public void setUp()
    {

        System.out.println("Before");
    }
    @Test
    public void checkStringAndReturnRepeated()
    {
        String str=stringRepeat.repeat("srija",2);
        assertEquals("test case failed","srijajaja",str);
        System.out.println("Test Case 1");
    }
    @Test
    public void checkStringAndReturnNotRepeatedString()
    {
        String str=stringRepeat.repeat("srija",0);
        assertEquals("test case failed","srija",str);
        System.out.println("Test Case 2");
    }
    @After
    public void tearDown()
    {
        System.out.println("After");
    }
}

