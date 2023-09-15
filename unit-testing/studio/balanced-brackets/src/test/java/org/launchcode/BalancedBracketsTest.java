package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
    @Test
    public void test_one(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void test_two(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("LaunchCode"));
    }
    @Test
    public void test_three(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }
    @Test
    public void test_four(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("launch[code]"));
    }
    @Test
    public void test_five(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void test_six(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]launchcode"));
    }
    @Test
    public void test_seven(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]launchCode]"));
    }
    @Test
    public void test_eight(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }
    @Test
    public void test_nine(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[launchCode]["));
    }
    @Test
    public void test_ten(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[launchCode]]"));
    }
    @Test
    public void test_eleven(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[launch]C[ode]"));
    }
    @Test
    public void test_twelve(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("]LaunchCode["));
    }
}