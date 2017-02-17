package com.company;

import static com.company.JasmineMath.*;

public class Main {

    public static void main(String[] args) {
        /**
         * CODING ASSIGNMENT
         * Create a new class called "JasmineMath"
         * In the JasmineMath class, create 2 methods
         * One method should be called "add".  It should accept 2 arguments (2 Integer numbers) and return an Integer.  The method should add the 2 arguments together, and then return the Integer result
         * The other method should be called "subtract".  It should accept 2 arguments (2 Integer numbers) and return an Integer.  The method should subtract the 2 arguments together, and then return the result
         * Once you have this done, initialize a new "JasmineMath" class, and call those methods with any numbers you want to demonstrate it works.  You will need to print the result to console.
         * Note- look at the original "Jasmine" class. Look at the method called "public void setAge(Integer age)".  In this example, this accepts 1 argument (1 Integer number called age)
         * Note- look at the original "Jasmine" class. Look at the method called "public Integer getAge()".  In this example, it returns an Integer.
         * Note- public Integer methodName(). in this example, the return type will be an Integer.  it will return an Integer value when you call "return X" at the end of the method
         * Note- public String methodName().  in this example, the return type will be a String.  it will return a String value when you call "return X" at the end of the method
         * Note- public void methodName().  in this example, there is no return type.  it does not return anything. You cannot call return at the end of the method when it's void.
         */

        //TODO: write code below...

       JasmineMath newJasmineMath= new JasmineMath();

        System.out.println(newJasmineMath.add(5,7));
        System.out.println(newJasmineMath.subtract(9,8));

    }

}