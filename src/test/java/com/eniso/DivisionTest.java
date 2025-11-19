package com.eniso;

import com.eniso.helloworld.service.CalculatorService;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DivisionTest {
    CalculatorService service = new CalculatorService();

    @Test
    public void Test() {
        assertEquals("1.0", service.division(10, 10));
        assertEquals("-100.0", service.division(200, -2));
        assertEquals("0.1", service.division(-1, -10));
        assertEquals("Infinity", service.division(1, 0));
    }

}
