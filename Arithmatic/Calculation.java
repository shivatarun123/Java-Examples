package com.method;

public class Calculation {
    public static int calculation(int x, int y, String operation){
        if(operation=="add"){
            return x+y;
        }
        else if(operation=="sub"){
            return x-y;
        }
        else if(operation=="mul"){
            return x*y;
        }else {
            return 0;
        }

    }
//this method defaults assumes no same numbers are passed , to avoid return 0 when sub operation was performed use diff numbers

    public static void main(String args[]){
         System.out.println(calculation(1,2,"add"));
        System.out.println(calculation(1,2,"mul"));
        System.out.println(calculation(1,2,"sub"));
    }
}
