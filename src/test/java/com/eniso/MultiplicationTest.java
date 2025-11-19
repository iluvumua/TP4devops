package com.eniso;

import com.eniso.helloworld.service.CalculatorService;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultiplicationTest {
    CalculatorService service = new CalculatorService();

    @Test
    public void Test() {
        assertEquals("10.0", service.multiplication(1, 10));
        assertEquals("-400.0", service.multiplication(200, -2));
        assertEquals("10.0", service.multiplication(-1, -10));
        assertEquals("0.0", service.multiplication(1, 0));
    }

}
