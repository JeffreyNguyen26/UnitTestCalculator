/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thang.test;


//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.RepeatedTest;
//import org.junit.jupiter.api.Test;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import thang.nguyen.Calculator;

/**
 *
 * @author ACER
 */
public class CalculatorTest {
    
   @Test  
    public void testFindMax(){  
        assertEquals(4,Calculator.findMax(new int[]{1,3,4,2}));  
        assertEquals(-1,Calculator.findMax(new int[]{-12,-1,-3,-4,-2}));  
    }  
}
