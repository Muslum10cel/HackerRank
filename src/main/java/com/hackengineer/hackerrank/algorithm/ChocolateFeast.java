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
