/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package za.ac.iie.prog5121icetasks3;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Student
 */
public class MarkCalculatorTest {
    
    public MarkCalculatorTest() {
    }

    /**
     * Test of calculateTotal method, of class MarkCalculator.
     */
    @Test
    public void calculateTotal_WithValidMarks_ReturnsCorrectTotal() {
        int markOne = 40;
        int markTwo = 50;
        MarkCalculator instance = new MarkCalculator();
        int expResult = 90;
        int result = instance.calculateTotal(markOne, markTwo);
        assertEquals(expResult, result);
  
    }

    /**
     * Test of calculateAverage method, of class MarkCalculator.
     */
    @Test
    public void calculateAverage_WithValidMarks_ReturnsCorrectAverage() {
        int markOne = 40;
        int markTwo = 50;
        MarkCalculator instance = new MarkCalculator();
        double expResult = 45.0;
        double result = instance.calculateAverage(markOne, markTwo);
        assertEquals(expResult, result, 0);
       
    }
    
}
