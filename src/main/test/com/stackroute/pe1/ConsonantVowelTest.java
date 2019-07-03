package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsonantVowelTest {
    ConsonantVowel obj=new ConsonantVowel();
    @Before
    public void setUp()
    {
        System.out.println("Before");
    }
    @Test
    public void checkConsonantAndReturn()
    {
        String a=obj.check("d");
        assertEquals("test case passed","Consonant",a);
        System.out.println("TestCase1");
    }
    @Test
    public void checkVowelAndReturn()
    {
        String a=obj.check("a");
        assertEquals("test case passed","Vowel",a);
        System.out.println("TestCase2");
    }
    @Test
    public void checkIfNotMatchesReturnDigitNotMatching()
    {
        String a=obj.check("4");
        assertEquals("test case passed","Input is not a letter",a);
        System.out.println("TestCase3");
    }
    @Test
    public void checkIfNotMatchesReturn()
    {
        String a=obj.check("%");
        assertEquals("test case passed","Input is not a letter",a);
        System.out.println("TestCase4");
    }
    @After
    public void tearDown()
    {
        System.out.println("After");
    }

}

