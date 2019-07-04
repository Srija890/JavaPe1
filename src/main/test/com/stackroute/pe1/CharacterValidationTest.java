package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharacterValidationTest {
    CharacterValidation characterValidation;
    @Before
    public void setUp()
    {
        System.out.println("Before");
    }
    @Test
    public void givenInputStringShouldReturnUpperCaseLetter()
    {
        characterValidation = new CharacterValidation();
        char res=characterValidation.characterCheck('A');
        assertEquals("test failed",'A',res);
        System.out.println("TestCase1");

    }
    @Test
    public void givenInputStringShouldReturnSmallerCaseLetter()
    {
        characterValidation = new CharacterValidation();
        char res=characterValidation.characterCheck('a');
        assertEquals("test failed",'a',res);
        System.out.println("TestCase2");
    }
    @Test
    public void givenInputStringShouldReturnDigit()
    {
        characterValidation= new CharacterValidation();
        char res=characterValidation.characterCheck('5');
        assertEquals("test passed",'5',res);
        System.out.println("TestCase3");
    }
    @After
    public void tearDown()
    {
        System.out.println("After");
    }

}

