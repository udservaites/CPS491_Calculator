/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cps491calculator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Chewbecca
 */
public class MainTest {

    public MainTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class Main.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Calculator.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void AdditionTest1() {
        assertEquals(5, Calculator.add(2, 3));
    }
    @Test
    public void AdditionTestSquare() {
        assertEquals(4, Calculator.square(2), .001);
    }
    
    @Test
    public void SubtractionTest() {
        assertEquals(5, Calculator.subtraction(5,2));
    }

    @Test
    public void divisionTest(){
        assertEquals(4, Calculator.divide(16,4), .001);
        assertEquals(5.5, Calculator.divide(55,10), .001);
        Calculator.divide(1,0);
    }
    
    @Test
    public void MultiplyTest1(){

        assertEquals(39.6, Calculator.multiply(5.5, 7.2), .001);

    }
}
