/**
 * Enumeration for mathematical operations.
 */

package com.eniso.helloworld.enumeration;

/**
 * Enumeration for mathematical operations.
 */

public enum MathematicalOperations {
    ADDITION("Addition"),
    SUBTRACTION("Subtraction"),
    MULTIPLICATION("Multiplication"),
    DIVISION("Division");

  private String label;

  MathematicalOperations(String label) {
    this.label = label;
  }

  public String getLabel() {
    return label;
  }
}