package com.sparta.dc.hamcrest;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class CalculatorTest {
    @Test
    void given2And6_Add_Returns8Pt0() {
        Calculator calc = new Calculator(6, 2);
        assertEquals(8.0, calc.add());

        assertThat(calc.add(), is(8.0));

        // These are equivelant to the above
        assertThat("Failed",calc.add(), is(Matchers.equalTo(8.0)));
        assertThat(calc.add(), equalTo(8.0));

    }

    @Test
    void given6And3_DivisibleBy_ReturnsTrue() {
        Calculator calc = new Calculator(6, 2);
        Assertions.assertTrue(calc.divisibleBy());
        assertThat(calc.divisibleBy(), is(true));
    }

    @Test
    void given7And3_DivisibleBy_ReturnsFalse() {
        Calculator calc = new Calculator(7, 3);
        Assertions.assertFalse(calc.divisibleBy());
        assertThat(calc.divisibleBy(), is(false));
    }

    @Test
    void given7And3_ToString_OutputContainsCalculator() {
        Calculator calc = new Calculator(7, 3);
        Assertions.assertTrue(calc.toString().contains("Calculator"));
        assertThat(calc.toString(), containsString("Calculator"));
    }

    @Test
    void moreStringMatchers(){
        var testString = "The quick brown fox jumps over the lazy dog";

        //Write some tests to show:
        // 1. The string starts with "The"
        assertThat(testString, startsWith("The"));
        // 2. The string ends with "dog."
        assertThat(testString, endsWith("dog"));
        // 3. The string contains the string (ignoring case) "the quick"
        assertThat(testString, containsStringIgnoringCase("the quick"));
        // 4. The string contains, in order, "quick", "jumps", "lazy"
        assertThat(testString, stringContainsInOrder("quick", "jumps", "lazy"));
        // 5. The string is not empty or null **/
        assertThat(testString, not(emptyOrNullString()));
    }

    @Test
    void collectionMatchersExercise(){
        List<String> fruit = List.of(
                "apple", "pear", "banana", "peach", "pomegranate", "pineapple", "lemon"
        );


         // Assert the following in the test method using MatcherAssert@
         // 1. There are 7 elements in the collection
         MatcherAssert.assertThat(fruit, hasSize(7));
         // 2. The collection contains the following items in this order: ["apple", "banana", "pomegranate", "lemon"]
         MatcherAssert.assertThat(fruit, hasItems("apple", "banana", "pomegranate", "lemon"));
         // 3. The collections contain ["banana", "pear"] in any order
         MatcherAssert.assertThat(fruit, hasItems("banana", "pear"));
         // 4. The collection contains the following items (they must be in this order in your assertion): ["lemon", "pineapple", "pomegranate", "apple", "peach", "pear", "banana"].
         MatcherAssert.assertThat(fruit, hasItems("lemon", "pineapple", "pomegranate", "apple", "peach", "pear", "banana"));
         // 5. The collection does not contain "grap"
         MatcherAssert.assertThat(fruit, not(hasItem("grap")));
         // 6. The collection does not contain an item that ends with the letter "z"
         MatcherAssert.assertThat(fruit, not(contains(endsWith("z"))));

    }
}
