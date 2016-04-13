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
