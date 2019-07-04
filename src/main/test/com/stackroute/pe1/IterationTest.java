package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IterationTest {

    Iteration iteration=new Iteration();
    @Before
    public void setUp()
    {
        System.out.println("Before");
    }
    @Test
    public void givenInputStringShouldReturnIterationSeries()
    {

        String result=iteration.iteration(3);
        assertEquals("testcase passed","122333",result );
        System.out.println("TestCase1");
    }
    @Test
    public void givenInputStringShouldNotReturnIterationSeries()
    {
        String res=iteration.iteration(0);
        assertEquals("testcase passed","",res );
        System.out.println("TestCase2");
    }

    @After
    public void tearDown()
    {
        System.out.println("After");
    }

}















