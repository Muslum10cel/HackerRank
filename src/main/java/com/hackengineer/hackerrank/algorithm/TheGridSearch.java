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
public class TheGridSearch {

    private final static String[] grid = new String[1001];
    private final static String[] search = new String[1001];

    public static void Solution() {
        Scanner scanner = new Scanner(System.in);
        byte T = scanner.nextByte();
        short R, r, C, c, i, search_index = 0, j, begin_index = 0;
        boolean ok = false;

        while (T-- > 0) {
            R = scanner.nextShort();
            C = scanner.nextShort();

            for (i = 0; i < R; i++) {
                grid[i] = scanner.next();
            }

            r = scanner.nextShort();
            c = scanner.nextShort();

            for (i = 0; i < r; i++) {
                search[i] = scanner.next();
            }
            
            
        }
    }
}
