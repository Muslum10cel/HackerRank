/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hackengineer.hackerrank.algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * Definition of Problem :
 *
 * Little Bob loves chocolate, and he goes to a store with $N in his pocket. The
 * price of each chocolate is $C. The store offers a discount: for every M
 * wrappers he gives to the store, he gets one chocolate for free. How many
 * chocolates does Bob get to eat?
 *
 * --- INPUT FORMAT ---
 *
 * The first line contains the number of test cases, T. T lines follow, each of
 * which contains three integers, N, C, and M.
 *
 * --- OUTPUT FORMAT ---
 *
 * Print the total number of chocolates Bob eats.
 *
 * --- CONSTRAINTS ---
 *
 * 1<=T<=1000
 *
 * 2≤N≤10^5
 *
 * 1≤C≤N
 *
 * 2≤M≤N
 *
 *
 *
 * --- SAMPLE INPUT ---
 *
 * 3
 * 10 2 5 
 * 12 4 4 
 * 6 2 2
 *
 * --- SAMPLE OUTPUT ---
 * 6
 * 3
 * 5
 * 
 *
 * 
 * @author muslumoncel
 */
class ChocolateFeast {

    public static void Solution() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> choc = new ArrayList<>();
        int T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            int N = scanner.nextInt();
            int C = scanner.nextInt();
            int M = scanner.nextInt();
            if (N / C < M) {
                choc.add(N / C);
            } else if (N / C == M) {
                choc.add(N / C + 1);
            } else {
                int count = 0, temp = N / C;
                while (temp >= M) {
                    temp -= M;
                    ++temp;
                    ++count;
                }
                choc.add((N / C) + count);
            }
        }
        choc.stream().forEach((ch) -> {
            System.out.println(ch);
        });
    }
}
