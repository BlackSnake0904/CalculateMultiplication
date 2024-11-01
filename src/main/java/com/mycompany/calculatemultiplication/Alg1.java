/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculatemultiplication;

/**
 *
 * @author BlackSnake
 */
public class Alg1 {
    private String firstNumber;
    private String secondNumber;
    private int[] result;

    public Alg1(String aFirstNumber, String aSecondNumber) {
        firstNumber = aFirstNumber;
        secondNumber = aSecondNumber;

        result = multiplication1(aFirstNumber, aSecondNumber);
        result = reverseArray(result);
        result = removeZero(result);

        resultNumber(result);

    }

    public int[] getResultArray() {
        return Alg1.this.result;
    }

    public static void resultNumber(int[] result) {
        System.out.println("Result of Alg1 is: ");
        for (int i : result) {
            System.out.print(i);
        }
        System.out.println(" ");
    }

    private int[] reverseArray(int[] result) {

        //reverseArray so First number from left is at the begining of Array
        int[] reverseArray = new int[result.length];
        int k = 0;
        for (int i = result.length - 1; i >= 0; i--) {

            reverseArray[k] = result[i];
            k++;
        }
        return reverseArray;
    }

    //Remove 0 at the begining of array
    private int[] removeZero(int[] arrayWithZero) {

        int[] newArray = new int[arrayWithZero.length - 1];

        int index = 1;
        if (arrayWithZero[0] == 0) {
            while (newArray[0] == 0) {

                for (int i = 0; i < arrayWithZero.length - index; i++) {
                    newArray[i] = arrayWithZero[i + 1];
                }
                //System.out.println(Arrays.toString(newArray));
                index++;
            }
        } else {
            return arrayWithZero;
        }
        return newArray;
    }

    private int[] multiplication1(String aFirstNumber, String aSecondNumber) {

        int[] firstArray = (aFirstNumber).chars().map(c -> c - '0').toArray();
        int[] secondArray = (aSecondNumber).chars().map(c -> c - '0').toArray();
        result = new int[firstArray.length + secondArray.length];
        int indexPosunutia = 0;
        int b;
        for (int i = firstArray.length - 1; i >= 0; i--) {
            b = indexPosunutia;
            for (int j = secondArray.length - 1; j >= 0; j--) {

                int pom = firstArray[i] * secondArray[j];
                pom += result[b];

                if (pom > 9) {
                    result[b] = pom % 10;
                    result[b + 1] += pom / 10;
                } else {
                    result[b] = pom;
                }
                b++;
            }
            indexPosunutia++;
            /*for (int k = result.length - 1; k >= 0; k--) {
                System.out.print(result[k]);
            }*/
            System.out.println(" ");
        }

        return result;
    }
;
}
