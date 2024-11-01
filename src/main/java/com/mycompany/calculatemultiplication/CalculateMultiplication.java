/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.calculatemultiplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Integer.parseInt;
import java.util.Arrays;

/**
 *
 * @author BlackSnake
 */
public class CalculateMultiplication {

    public static void main(String[] args) throws IOException {
        //Alg1 priklad10 = new Alg1("12345678901234567890", "11111111111111111111");
        //Alg1 priklad1 = new Alg1( "84727484", "458541825"); 
        //Alg2 priklad20 = new Alg2("12345678901234567890", "11111111111111111111");
        //System.out.println(Arrays.toString(priklad1.getResultArray()));
        //System.out.println(Arrays.toString(priklad2.getResultArray()));

        //Console Application
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.println("Write first number:");
        String firstNumber = reader.readLine();
        System.out.println("Write second number:");
        String secondNumber = reader.readLine();
        System.out.println("Write 1 for users algorithm or 2 for system algorithm");
        int options = parseInt(reader.readLine());
        if (options == 1) {
            Alg1 priklad1 = new Alg1(firstNumber, secondNumber);
        } else {
            if (options != 2) {
                System.out.println("Options: " + options + " not found we will use default algorithm");
            }
            Alg2 priklad1 = new Alg2(firstNumber, secondNumber);
        }

    }
}
