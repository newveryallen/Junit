package com.shen.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestLogic {
    @Test  
    public void testFindMax(){  
        assertEquals(4,Calculation.findMax(new int[]{1,3,4,2}));  
        assertEquals(-1,Calculation.findMax(new int[]{-12,-1,-3,-4,-2}));
        assertEquals(12,Calculation.findMax(new int[]{12,-1,-3,-99,-2}));
        assertEquals(99,Calculation.findMax(new int[]{99,88,2,9}));
    }  
}
