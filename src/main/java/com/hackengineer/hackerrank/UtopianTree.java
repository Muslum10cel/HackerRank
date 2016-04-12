/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hackengineer.hackerrank;

import java.util.Scanner;

/**
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
