package com.stackroute.pe1;

public class ReverseString {
    String reverse = "";
    public String revString(String str)
    {

        for (int i = str.length() - 1; i >= 0; i--)
        {
            reverse = reverse + str.charAt(i);
        }

        return reverse;
    }
}

