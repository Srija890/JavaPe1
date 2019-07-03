package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringTest {
    ReverseString obj=new ReverseString();
    @Before
    public void setUp()
    {
        System.out.println("Before");
    }
    @Test
    public void getStringReverseAndComapare()
    {
        String a=obj.revString("srija");
        assertEquals("test case failed","ajirs",a);
        System.out.println("TestCase1");
    }
    @Test
    public void getStringReverseAndComapareSpace()
    {
        String a=obj.revString("srija ");
        assertEquals("test case failed"," ajirs",a);
        System.out.println("TestCase2");
    }
    @Test
    public void passNullAndCompare()
    {
        String a=obj.revString(" ");
        assertEquals("test case failed"," ",a);
        System.out.println("TestCase3");
    }
    @After
    public void tearDown()
    {
        System.out.println("After");
    }

}

