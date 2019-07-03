package com.stackroute.pe1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {
    Palindrome obj = new Palindrome();

    @Before
    public void setUp()
    {
        System.out.println("Before");
    }
    @Test
    public void checkNumberIsPalindrome()
    {
        String a=obj.checkPalindrome(121);
        assertEquals("test case failed","121 is palindrome and sum of even numbers is less than 25",a);
        System.out.println("TestCase1");
    }
    @Test
    public void checkNumberIsNotPalindrome()
    {
        String a=obj.checkPalindrome(12232);
        assertEquals("test case failed","12232 is not a palindrome",a);
        System.out.println("TestCase2");
    }
    @Test
    public void checkNumberIsPalindromeAndMoreThanSum()
    {
        String a=obj.checkPalindrome(5684865);
        assertEquals("test case failed","5684865 is palindrome and sum of even numbers is greater than 25",a);
        System.out.println("TestCase3");
    }

}

