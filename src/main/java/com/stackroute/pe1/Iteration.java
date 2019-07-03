package com.stackroute.pe1;

public class Iteration {
    int i=0,j=0,n;
    String series="";
    public String iteration(int n) {

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                series = series + i;
            }
        }
        return series;
    }
}


