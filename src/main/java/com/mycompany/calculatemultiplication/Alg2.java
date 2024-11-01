/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculatemultiplication;

import java.math.BigInteger;

/**
 *
 * @author BlackSnake
 */
public class Alg2 {
    
    private BigInteger A, B, C;
     
     public Alg2(String aA, String aB){
     A = new BigInteger(aA);
     B = new BigInteger(aB);
     C = A.multiply(B);
     
     getResultNumber(C);
     }
      
     public static void getResultNumber(BigInteger C){
         System.out.println("Result of Alg2 is:");
        System.out.println(C);
     }
     
     public int[] getResultArray(){
         
     String BigIntegerC = this.C.toString();
     int[] BigIntegerArray = (BigIntegerC).chars().map(c -> c - '0').toArray();
     return BigIntegerArray;
     };
}
