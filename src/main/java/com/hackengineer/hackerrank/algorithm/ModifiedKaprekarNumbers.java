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
 * @author muslumoncel
 */
public class ModifiedKaprekarNumbers {

    static void solution() {
        Scanner scanner = new Scanner(System.in);
        long p = scanner.nextShort();
        long q = scanner.nextInt();
        boolean found = false;
        String temp = "";
        for (; p < q + 1; p++) {
            if (p == 1) {
                System.out.print(p + " ");
            } else {
                temp += (String.valueOf(p * p));
                try {
                    if (Double.parseDouble(temp.substring(0, temp.length() / 2))
                            + Double.parseDouble(temp.substring(temp.length() / 2, temp.length()))
                            == p) {
                        System.out.print(p + " ");
                        found = true;
                    }
                } catch (Exception e) {
                }
                temp = "";
            }
        }
        if (!found) {
            System.out.print("INVALID RANGE");
        }
    }
}
