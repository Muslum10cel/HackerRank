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
 * Watson gives two integers (A and B) to Sherlock and asks if he can count the
 * number of square integers between A and B (both inclusive).
 *
 * Note: A square integer is an integer which is the square of any integer. For
 * example, 1, 4, 9, and 16 are some of the square integers as they are squares
 * of 1, 2, 3, and 4, respectively.
 *
 * 
 * 
 * --- INPUT FORMAT ---
 *
 * The first line contains T, the number of test cases. T test cases follow,
 * each in a new line. Each test case contains two space-separated integers
 * denoting A and B.
 *
 * --- OUTPUT FORMAT ---
 *
 * For each test case, print the required answer in a new line.
 *
 * --- CONSTRAINTS---
 *
 * 1<=T<=100
 *
 * 1≤A≤B≤(10^9)
 *
 *
 * 
 * --- SAMPLE INPUT ---
 *
 * 2
 * 3 9
 * 17 24
 *
 * --- SAMPLE OUTPUT ---
 *
 * 2
 * 0
 * 
 * 
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
