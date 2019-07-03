package com.stackroute.pe1;

public class CharacterValidation {
    String a="";

    public char characterCheck(char a)
    {
        if(a>='A' && a<='Z') //Validating Capital Letters
        {
            return a;
        }
        else if(a>='a' && a<='z')  // Validating Small Case Letters
        {
            return a;
        }
        else if(a>='0' && a<='9')  // Digits validation
        {
            return a;
        }
        else
        {
            return '@';
        }
    }
}


