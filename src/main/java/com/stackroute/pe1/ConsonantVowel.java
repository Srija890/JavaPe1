package com.stackroute.pe1;

public class ConsonantVowel
    {
        String str="";
        int len;
        public String check(String str)
        {
            len=str.length();

            for(int i=0;i<len;i++)
            {
                char input=str.charAt(i);  // Individual character is taken by charAt()

                if((input>='a' && input<='z') || (input>='A' && input<='Z'))
                {
                    if (input == 'a' || input == 'e' || input == 'i' || input == 'o' || input == 'u')
                    {
                        str="Vowel";
                    }
                    else
                    {
                        str="Consonant";
                    }
                }
                else
                {
                    str="Input is not a letter";
                }
            }
            return str;
        }
    }

