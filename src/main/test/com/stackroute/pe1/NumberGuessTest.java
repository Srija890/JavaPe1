package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberGuessTest {
    NumberGuess numberguess;
    String result;
    @Before
    public void setUp()
    {
        numberguess=new NumberGuess();
    }
    @Test
    public void givenInputShouldReturnOutputLessThanTarget()
    {
        result=numberguess.checkNumberGuess(45,34);
        assertEquals("Condition failed","Number guessed is less than original number",result);
    }
    @Test
    public void givenInputShouldReturnOutputMoreThanTarget()
    {
        result=numberguess.checkNumberGuess(30,34);
        assertEquals("test case failed","Number guessed is more than original number",result);
    }
    @Test
    public void givenInputShouldReturnExactlyMatchedTarget()
    {
        result=numberguess.checkNumberGuess(30,30);
        assertEquals("Not matching target value","YOU ARE CORRECT",result);
    }
    @Test
    public void checkTheNumberAndReturnNotRange()
    {
        result=numberguess.checkNumberGuess(45,70);
        assertEquals("Target value is out of scope","Not in range",result);
    }
    @After
    public void tearDown()
    {
        numberguess=null;
    }

}


