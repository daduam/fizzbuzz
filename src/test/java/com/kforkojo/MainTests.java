package com.kforkojo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTests {
    @Test
    public void getFizzBuzz_whenNumberDivisibleByBothThreeAndFive_returnsFizzBuzz() {
        for (int num = 1; num < 100; num++) {
            if (num % 3 == 0 && num % 5 == 0) {
                String result = Main.getFizzBuzz(num);

                assertEquals("FizzBuzz", result);
            }
        }
    }

    @Test
    public void getFizzBuzz_whenNumberDivisibleByFiveButNotThree_returnsFizz() {
        for (int num = 1; num < 100; num++) {
            if (num % 5 == 0 && num % 3 != 0) {
                String result = Main.getFizzBuzz(num);

                assertEquals("Fizz", result);
            }
        }
    }

    @Test
    public void getFizzBuzz_whenNumberDivisibleByThreeButNotFive_returnsBuzz() {
        for (int num = 1; num < 100; num++) {
            if (num % 3 == 0 && num % 5 != 0) {
                String result = Main.getFizzBuzz(num);

                assertEquals("Buzz", result);
            }
        }
    }

    @Test
    public void getFizzBuzz_whenNumberDivisibleByNeitherThreeNorFive_returnsStringRepresentationOfInputNumber() {
        for (int num = 1; num < 100; num++) {
            if (num % 3 != 0 && num % 5 != 0) {
                String result = Main.getFizzBuzz(num);

                assertEquals(Integer.toString(num), result);
            }
        }
    }
}
