package sample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
  @Test
  void canaryTest(){
    assertTrue(true);
  }

  @Test
  void addTwoPositiveNumbers(){
    assertEquals(6, new Calculator().add(4, 2));
  }

  @Test
  void addTwoNegativeNumbers(){
    assertEquals(-5, new Calculator().add(-2, -3));
  }

  @Test
  void divideAPositiveNumberByAPositiveNumber(){
    assertEquals(6, new Calculator().divide(12, 2));
  }

  @Test
  void divideANegativeNumberByAPositiveNumber(){
    assertEquals(-6, new Calculator().divide(-12, 2));
  }

  @Test
  void divideAPositiveNumberByZero(){
    assertThrows(ArithmeticException.class, () -> new Calculator().divide(6, 0));
  }
}

//We have tests to verify the behavior of the code.
//Tests are expressing the expectations we have in the code.

//In accounting we use double bookkeeping to find errors quickly.
//In refineries we use redundant equipment for handling failures
//Automated tests are those duplicates or backup units

//Unit tests are angels on your shoulder. They tell you quickly when the code misbehaves and
//saves your day.

//The time between introducing an error and finding it should be really small in order to reduce the
//cost and the time impact of the error.

//As a developer, it not important what a test is doing, as long as it is doing what the business
//is expecting as a behavior.

//Tests are not about what the code does, it is about what the code should do.

//My job as a programmer is not to program, but to focus on solving the business needs.
