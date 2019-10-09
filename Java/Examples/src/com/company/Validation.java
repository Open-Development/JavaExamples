package com.company;

public class Validation {
    public static boolean IsValid(int a, int b){
        if(a < 0 || b < 0){
            return false;
        }else {
            return true;
        }
    }

    public static boolean IsValidForDivide(int a, int b){
        if(a < 0 || b < 0 || a == 0 || b == 0){
            return false;
        }else {
            return true;
        }
    }
}
