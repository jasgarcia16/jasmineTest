package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jas on 2/16/17.
 */
public class JasmineMath {


    public Integer add(Integer a, Integer b) {
        return a + b;
    }

    public Integer subtract(Integer a, Integer b) {
        return a - b;
    }

    public Integer findBiggestNumberIn(List<Integer> numbers) {


        int x = 0;
        int max = numbers.get(x);


        while (++x < numbers.size())
            if (numbers.get(x) > max)
                max = numbers.get(x);

        return max;
    }

    public Integer findSmallestNumberIn(List<Integer> numbers) {

        int y=0;
        int min = numbers.get(y);

        while (++y <numbers.size())
            if (numbers.get(y) < min)
                min = numbers.get(y);
        return min;

    }
}




