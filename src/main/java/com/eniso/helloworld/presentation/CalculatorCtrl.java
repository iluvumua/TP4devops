package com.eniso.helloworld.presentation;

import com.eniso.helloworld.enumeration.MathematicalOperations;
import com.eniso.helloworld.service.CalculatorService;
import javax.faces.bean.ManagedBean;

/**
 * Javadoc.
 */

@ManagedBean
public class CalculatorCtrl {

  private final Model model = new Model();
  private final CalculatorService service = new CalculatorService();

  public Model getModel() {
    return model;
  }

  /**
   * Javadoc.
   */

  public void result() {
    getModel().setResult(service.result(getModel().getA(),
            getModel().getB(),
            getModel().getOperator()));
  }

  /**
   * Javadoc.
   */

  public MathematicalOperations[] getOperations() {
    return MathematicalOperations.values();
  }

  /**
   * Javadoc.
   */

  public class Model {

    private int numA;
    private int numB;
    private MathematicalOperations operator;
    private String result;

    public MathematicalOperations getOperator() {
      return operator;
    }

    public void setOperator(MathematicalOperations operator) {
      this.operator = operator;
    }

    public int getA() {
      return numA;
    }

    public void setA(int a) {
      this.numA = a;
    }

    public int getB() {
      return numB;
    }

    public void setB(int b) {
      this.numB = b;
    }

    public String getResult() {
      return result;
    }

    public void setResult(String result) {
      this.result = result;
    }
  }
}
