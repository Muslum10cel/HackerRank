/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hackengineer.hackerrank.algorithm;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * Definition of Problem :
 *
 * You are given an integer NN. Print the factorial of this number.
 *
 * N!=N×(N−1)×(N−2)×⋯×3×2×1
 *
 * --- INPUT ---
 *
 * Input consists of a single integer N, where 1<=N≤100.
 *
 * --- OUTPUT ---
 *
 * Print the factorial of N.
 *
 *
 *
 * --- SAMPLE INPUT-OUTPUT ---
 *
 * For an input of 25, you would print 15511210043330985984000000.
 *
 *
 *
 * @author muslumoncel
 *
 * ---> Extra Info : We got result has 103000 digit :)
 */
public class ExtraLongFactorial {

    private static final Scanner scanner = new Scanner(System.in);
    private static BigInteger result;
    private static BigInteger bigInteger = null, temp = null;

    public static void Solution() {
        int number = scanner.nextInt();
        bigInteger = BigInteger.valueOf(number);
        result = fact(bigInteger);
        System.out.println("" + result);
    }

    private static BigInteger fact(BigInteger bigInteger) {
        temp = bigInteger;
        if (bigInteger == BigInteger.ONE || bigInteger == BigInteger.ZERO) {
            return BigInteger.ONE;
        } else {
            return temp.multiply(fact(temp.subtract(BigInteger.ONE)));
        }
    }
}
