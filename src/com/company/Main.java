package com.company;

import java.util.ArrayList;
import java.util.List;

import static com.company.JasmineMath.*;

public class Main {

    public static void main(String[] args) {
        /**
         * CODING ASSIGNMENT
         * A new method has been created in tbe JasmineMath class
         * The new method name is called "findBiggestNumberIn"
         * The method's body is empty
         * You job is to fill out the method implementation
         * The method takes in a list of numbers (already created called "numbers")
         * The method will need to find the largest number in the "numbers" list and return it
         */

        //TODO: write code below...

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(7);
        numbers.add(16);
        numbers.add(11);
        numbers.add(12);
        numbers.add(15);

        JasmineMath jasmineMath = new JasmineMath();
        Integer largestNumber = jasmineMath.findBiggestNumberIn(numbers);
        Integer smallestNumber = jasmineMath.findSmallestNumberIn(numbers);

        System.out.println("The largest number in the list is: " + largestNumber);
        System.out.println("The smallest number in the list is: " + smallestNumber);


    }

}