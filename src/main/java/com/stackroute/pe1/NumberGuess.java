package com.stackroute.pe1;

public class NumberGuess {
    private int target,num;
    private String str="";

    public String checkNumberGuess(int target,int num)
    {

        do{
            if(num>1 && num<50)
            {
                if(num == target)
                {
                    str="YOU ARE CORRECT";
                }
                else if(num<target)
                {
                    str="Number guessed is less than original number";
                }
                else
                {
                    str="Number guessed is more than original number";
                }
            }
            else
            {
                str="Not in range";
            }
        }while (num != target);

        return str;
    }

}


