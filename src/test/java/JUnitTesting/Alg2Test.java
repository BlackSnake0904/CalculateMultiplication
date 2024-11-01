/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package JUnitTesting;

import com.mycompany.calculatemultiplication.Alg2;
import java.math.BigInteger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author BlackSnake
 */
public class Alg2Test {
    
    public Alg2Test() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    
    /**
     * Test of getResultArray method, of class Alg2.
     */
    @Test
    public void testGetResultArray() {
        System.out.println("getResultArray");
        Alg2 instance = new Alg2("12345678901234567890", "11111111111111111111");
        int[] expResult = new int[]{1, 3, 7, 1, 7, 4, 2, 1, 0, 0, 1, 3, 7, 1, 7, 4, 2, 0, 9, 9, 8, 6, 2, 8, 2, 5, 7, 8, 9, 9, 8, 6, 2, 8, 2, 5, 7, 9, 0};;
        int[] result = instance.getResultArray();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
