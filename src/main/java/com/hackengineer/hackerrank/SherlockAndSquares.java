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
class SherlockAndSquares {

    public static void Solution() {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println((int) (Math.floor(Math.sqrt(b)) - Math.ceil(Math.sqrt(a))) + 1);
        }
    }
}
