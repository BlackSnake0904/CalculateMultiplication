/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package JUnitTesting;

import com.mycompany.calculatemultiplication.Alg1;
import com.mycompany.calculatemultiplication.Alg2;
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
public class CompareResultJUnitTest {

    public CompareResultJUnitTest() {
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
     * Test for comparingResult of Alg1 Alg2.
     */
    @Test

    public void testGetResultArray() {
        System.out.println("CompareArray");
        Alg1 instance = new Alg1("12345678901234567890", "11111111111111111111");
        Alg2 instance2 = new Alg2("12345678901234567890", "11111111111111111111");
        int[] expResult = instance2.getResultArray();
        int[] result = instance.getResultArray();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }
}
