package com.company;

import java.util.ArrayList;
import java.util.List;

import static com.company.JasmineMath.*;

public class Main {

    public static void main(String[] args) {
        /**
         * CODING ASSIGNMENT
         * A new class has been created called "JasmineStringUtil"
         * In JasmineStringUtil, a new method has been created called "reverseString()"
         * Implement the method details so that it reverses the passed in string
         * For example: if you pass in the string "soccer", the method should return "reccos"
         * Also, do not use any available libraries/methods that reverses a string for you, implement the method yourself
         * Example, do not use something like StringUtil.reverse()
         */

        //TODO: write code below...

        String str = "soccer";
        String reversedStr = null;

        JasmineStringUtil jasmineStringUtil = new JasmineStringUtil();
        reversedStr = jasmineStringUtil.reverseString(str);

        System.out.println("The word " + str + " has been reversed to " + reversedStr);
    }

}