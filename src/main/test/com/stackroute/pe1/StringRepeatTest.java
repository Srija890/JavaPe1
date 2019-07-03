package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringRepeatTest {
    StringRepeat obj=new StringRepeat();
    @Before
    public void setUp()
    {
        System.out.println("Before");
    }
    @Test
    public void checkStringAndReturnRepeated()
    {
        String s=obj.repeat("srija",2);
        assertEquals("test case failed","srijajaja",s);
        System.out.println("Test Case 1");
    }
    @Test
    public void checkStringAndReturnNotRepeatedString()
    {
        String s=obj.repeat("srija",0);
        assertEquals("test case failed","vishnu",s);
        System.out.println("Test Case 2");
    }
    @After
    public void tearDown()
    {
        System.out.println("After");
    }
}

