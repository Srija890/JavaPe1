package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsonantVowelTest {
    ConsonantVowel consonantVowel=new ConsonantVowel();
    @Before
    public void setUp()
    {
        System.out.println("Before");
    }
    @Test
    public void givenInputStringShouldReturnConsonant()
    {
        String str=consonantVowel.check("d");
        assertEquals("test case passed","Consonant",str);
        System.out.println("TestCase1");
    }
    @Test
    public void givenInputStringShouldReturnVowel()
    {
        String str=consonantVowel.check("a");
        assertEquals("test case passed","Vowel",str);
        System.out.println("TestCase2");
    }

    @After
    public void tearDown()
    {
        System.out.println("After");
    }

}

