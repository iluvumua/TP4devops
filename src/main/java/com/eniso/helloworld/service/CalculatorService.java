package com.eniso.helloworld.service;

import com.eniso.helloworld.enumeration.MathematicalOperations;

/**
 * Enumeration for mathematical operations.
 */

public class CalculatorService {


  public String addition(float a, float b) {
    return Float.toString(a + b);
  }

  public String substraction(float a, float b) {
    return Float.toString(a - b);
  }

  public String multiplication(float a, float b) {
    return Float.toString(a * b);
  }

  /**
   * Javadoc.
   */

  public String division(float a, float b) {
    try {
      return Float.toString(a / b);
    } catch (ArithmeticException e) {
      return "Division by zero";
    }
  }

  /**
   * Javadoc.
   */

  public String result(float a, float b, MathematicalOperations operation) {
    try {
      if (operation.equals(MathematicalOperations.ADDITION)) {
        return addition(a, b);
      } else if (operation.equals(MathematicalOperations.SUBTRACTION)) {
        return substraction(a, b);
      } else if (operation.equals(MathematicalOperations.MULTIPLICATION)) {
        return multiplication(a, b);
      } else if (operation.equals(MathematicalOperations.DIVISION)) {
        return division(a, b);
      }
    } catch (Exception ignored) {
      return "Error";
    }
    return "ERROR OPERATOR";
  }
}
