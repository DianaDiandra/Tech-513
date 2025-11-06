package com.sparta.nam.adv_unitesting;

public class FizzBuzzExample {
    public static String fizzBuzz(int n) {


        return n % 15 == 0 ? "FizzBuzz" :
                n % 5 == 0 ? "Buzz" :
                        n % 3 == 0? "Fizz" :
                                Integer.toString(n);

    }
}
