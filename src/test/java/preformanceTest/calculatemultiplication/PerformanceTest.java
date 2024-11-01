/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package preformanceTest.calculatemultiplication;

import com.mycompany.calculatemultiplication.Alg1;
import com.mycompany.calculatemultiplication.Alg2;
import java.io.IOException;
import java.math.BigInteger;
import java.security.SecureRandom;

/**
 *
 * @author BlackSnake
 */
public class PerformanceTest {

    public static void main(String[] args) throws IOException {
        SecureRandom random = new SecureRandom();      
        int bitLength = 80;
        for (int i = 0; i < 1000; i++) {
            BigInteger firstNumber = new BigInteger(bitLength, random);
            BigInteger secondNumber = new BigInteger(bitLength, random);
            //Alg1 priklad10 = new Alg1(firstNumber.toString(), secondNumber.toString());
            Alg2 priklad10 = new Alg2(firstNumber.toString(), secondNumber.toString());
        }
        
        
        

        //Alg1 priklad10 = new Alg1("12345678901234567890", "11111111111111111111");
    }

}
