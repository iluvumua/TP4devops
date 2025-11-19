package com.eniso;

import com.eniso.helloworld.service.CalculatorService;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SubstractionTest {
    CalculatorService service = new CalculatorService();

    @Test
    public void Test() {
        assertEquals("0.0", service.substraction(1, 1));
        assertEquals("199.0", service.substraction(200, 1));
        assertEquals("1.0", service.substraction(-1, -2));
    }

}
