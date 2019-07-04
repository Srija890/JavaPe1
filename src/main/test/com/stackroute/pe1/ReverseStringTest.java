package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringTest {
    ReverseString reverseString=new ReverseString();
    @Before
    public void setUp()
    {
        System.out.println("Before");
    }
    @Test
    public void givenInputStringShouldReturnReversedString()
    {
        String str=reverseString.revString("srija");
        assertEquals("test case failed","ajirs",str);
        System.out.println("TestCase1");
    }
    @Test
    public void givenInputStringShouldReturnReversedStringAndSpace()
    {
        String str=reverseString.revString("srija ");
        assertEquals("test case failed"," ajirs",str);
        System.out.println("TestCase2");
    }
    @Test
    public void givenInputStringShouldReturnNull()
    {
        String str=reverseString.revString(" ");
        assertEquals("test case failed"," ",str);
        System.out.println("TestCase3");
    }
    @After
    public void tearDown()
    {
        System.out.println("After");
    }

}

