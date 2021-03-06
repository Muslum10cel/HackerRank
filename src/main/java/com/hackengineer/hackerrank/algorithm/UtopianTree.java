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
 * The Utopian Tree goes through 2 cycles of growth every year. Each spring, it
 * doubles in height. Each summer, its height increases by 1 meter.
 *
 * Laura plants a Utopian Tree sapling with a height of 1 meter at the onset of
 * spring. How tall will her tree be after N growth cycles?
 *
 * --- INPUT FORMAT ---
 *
 * The first line contains an integer, T, the number of test cases. T subsequent
 * lines each contain an integer, N, denoting the number of cycles for that test
 * case.
 *
 * --- OUTPUT FORMAT ---
 *
 * For each test case, print the height of the Utopian Tree after NN cycles.
 * Each height must be printed on a new line.
 *
 * --- CONSTRAINTS ---
 *
 * 1<=T<=10
 *
 * 0≤N≤60
 *
 *
 *
 * --- SAMPLE INPUT ---
 *
 * 3
 * 0
 * 2
 * 4
 *
 * --- SAMPLE OUTPUT ---
 *
 * 1
 * 2
 * 7
 *
 *
 * 
 * @author muslumoncel
 */
public class UtopianTree {

    public void Solution() {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();
            switch (n) {
                case 0:
                    System.out.println("1");
                    break;
                case 1:
                    System.out.println("2");
                    break;
                default:
                    int initial = 1;
                    for (int i = 1; i <= n; i++) {
                        if (i % 2 == 0) {
                            initial += 1;
                        } else {
                            initial *= 2;
                        }
                    }
                    System.out.println(initial);
            }
        }
    }
}
