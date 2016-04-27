/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hackengineer.hackerrank.algorithm;

import java.util.Scanner;

/**
 *
 * @author muslumoncel
 */
public class TaumAndBday {

    static void solution() {
        Scanner scanner = new Scanner(System.in);
        byte T = scanner.nextByte();
        long X, Y, Z, B, W;
        while (T-- > 0) {
            B = scanner.nextLong();
            W = scanner.nextLong();
            X = scanner.nextLong();
            Y = scanner.nextLong();
            Z = scanner.nextLong();
            if (Z >= Y && Z >= X) {
                System.out.println((B * X) + (W * Y));
            } else if (Y >= X) {
                if (X + Z >= Y) {
                    System.out.println((B * X) + (W * Y));
                } else {
                    System.out.println((B * X) + W * (X + Z));
                }
            } else if (X >= Y) {
                if (Y + Z >= X) {
                    System.out.println((B * X) + (W * Y));
                } else {
                    System.out.println(B * (Y + Z) + (W * Y));
                }
            }
        }
    }
}
