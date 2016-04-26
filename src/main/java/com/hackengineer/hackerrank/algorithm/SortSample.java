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
public class SortSample {

    static void Solution() {
        Scanner scan = new Scanner(System.in);
        short n, V, i;
        V = scan.nextShort();
        n = scan.nextShort();
        for (i = 0; i < n; i++) {
            if (V == scan.nextShort()) {
                System.out.println(i);
                break;
            }
        }
    }
}
