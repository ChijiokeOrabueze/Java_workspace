package com.dufuna.berlin.chijiokeorabueze.tax.service;

import com.dufuna.berlin.chijiokeorabueze.tax.model.TaxBracket;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class TaxBracketServiceImplTest {

    @Autowired
    TaxBracketService taxBracketService1;

    @Test
    void negativeIncomeInputShouldThrowIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class,
                () -> {taxBracketService1.calculateTax(-1.00);});

    }

    @Test
    void returnTypeOfCalculateTaxIsDouble() {
        var tax = taxBracketService1.calculateTax(34.56);
        assertFalse(Double.isNaN(tax));

    }

    @Test
    void returnTypeOfGetBracketsIsIterable() {
        var allBrackets = taxBracketService1.getBrackets();
        assertTrue(allBrackets instanceof Iterable<TaxBracket>);


    }

    @Test
    void checkTestCase1() {
        assertEquals(7797.8099999999995, taxBracketService1.calculateTax(50000.00));
    }

    @Test
    void checkEdgeCase1() {
        assertEquals(31897.49, taxBracketService1.calculateTax(120000.00));
    }

    @Test
    void checkEdgeCase2() {
        assertEquals(0.00, taxBracketService1.calculateTax(0.00));
    }

    @Test
    void checkEdgeCase3() {
        assertEquals(0.19, taxBracketService1.calculateTax(18201.00));
    }

    @Test
    void checkEdgeCase4() {
        assertEquals(0.00, taxBracketService1.calculateTax(18200.00));
    }

    @Test
    void checkEdgeCase5() {
        assertEquals(54097.12, taxBracketService1.calculateTax(180000.00));
    }



}