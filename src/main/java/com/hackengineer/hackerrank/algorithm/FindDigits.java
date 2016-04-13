/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hackengineer.hackerrank.algorithm;

import java.util.Scanner;

/**
 *
 * Definition of Problem :
 *
 * Given an integer, N, traverse its digits (d1,d2,...,dn) and determine how
 * many digits evenly divide N (i.e.: count the number of times N divided by
 * each digit di has a remainder of 0). Print the number of evenly divisible
 * digits.
 *
 * Note: Each digit is considered to be unique, so each occurrence of the same
 * evenly divisible digit should be counted (i.e.: for N=111, the answer is 3).
 *
 * @author muslumoncel
 */
public class FindDigits {

    public void Solution() {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();
            int temp = n, count = 0;
            while (temp != 0) {
                try {
                    if (n % (temp % 10) == 0) {
                        count++;
                    }
                } catch (Exception e) {
                }
                temp /= 10;
            }
            System.out.println(count);
        }
    }
}
