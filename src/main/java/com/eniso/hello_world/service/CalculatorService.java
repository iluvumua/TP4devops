/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eniso.hello_world.service;

import com.eniso.hello_world.enumeration.MathematicalOperations;

/**
 *
 * @author Houssem
 */
public class CalculatorService {

    int x;

    public String addition(float a, float b) {
        return Float.toString(a + b);
    }

    public String result(float a, float b, MathematicalOperations operation) {
        try {
            if (operation.equals(MathematicalOperations.ADDITION)) {
                return addition(a, b);
            }
        } catch (Exception e) {
        }
        return "ERROR OPERATOR";
    }

}
