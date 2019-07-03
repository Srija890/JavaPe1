package com.stackroute.pe1;

public class Palindrome {
    String str= "";
    public String checkPalindrome(int a){
        {

            int remainder = 0, sum = 0, num = a, temp = a, x=0,rem=0,add=0;;
            while (num > 0)
            {
                remainder = num % 10;
                sum = (sum * 10) + remainder;
                num = num / 10;
            }
            if (sum == temp)
            {
                while(sum>0)
                {
                    rem=sum%10;
                    sum=sum/10;
                    if(rem%2==0)
                    {
                        add=add+rem;
                    }
                }
                if(add>25)
                {
                    str=temp+" "+"is palindrome and sum of even numbers is greater than 25";
                }
                else
                {
                    str=temp+" "+"is palindrome and sum of even numbers is less than 25";
                }

            }
            else
            {
                str=temp+" "+"is not a palindrome";
            }
            return str;
        }

    }

}

