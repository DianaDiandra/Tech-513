package adv_unitesting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class FizzBuzzTests {

    @Test
    @DisplayName("Given one, return one as a String")
    public void givenOne_Return_OneString(){
        Assertions.assertEquals("1", FizzBuzzExample.fizzBuzz(1));
    }

    @ParameterizedTest
    @CsvSource(
            {
                "1,1",
                "2,2"
            }
    )
    @DisplayName("Given one, return one as a String")
    public void givenNumber_Return_ItsString(int n, String expected){
        Assertions.assertEquals("1", FizzBuzzExample.fizzBuzz(1));
    }

    @Test
    @DisplayName("Given three, return 3 as a String")
    public void givenThree_Return_ItsString(){
        Assertions.assertEquals("Fizz", FizzBuzzExample.fizzBuzz(3));
    }

    @Test
    @DisplayName("Given five, return 5 as a String")
    public void giveFive_Return_ItsString(){
        Assertions.assertEquals("Buzz", FizzBuzzExample.fizzBuzz(5));
    }

    @Test
    @DisplayName("Given fifteen, return 15 as a String")
    public void giveFifteen_Return_ItsString(){
        Assertions.assertEquals("FizzBuzz", FizzBuzzExample.fizzBuzz(15));
    }

    @Test
    @DisplayName("givenANumberDivisibleByThreeButNotFive_Return_Fizz")
    public void giveNumber_DivisibleBy3_ButNotBy5(){
        Assertions.assertEquals("Fizz", FizzBuzzExample.fizzBuzz(9));
    }

    @Test
    @DisplayName("givenANumberDivisibleByFiveButNotThree_Return_Buzz")
    public void giveNumber_DivisibleBy5_ButNotBy3(){
        Assertions.assertEquals("Buzz", FizzBuzzExample.fizzBuzz(25));
    }

    @Test
    @DisplayName("givenANumberDivisibleByFifteen_Return_FizzBuzz")
    public void giveNumber_DivisibleBy15(){
        Assertions.assertEquals("FizzBuzz", FizzBuzzExample.fizzBuzz(225));
    }
}
