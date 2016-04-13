/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hackengineer.hackerrank.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * Definition of Problem :
 *
 * You are given N sticks, where the length of each stick is a positive integer.
 * A cut operation is performed on the sticks such that all of them are reduced
 * by the length of the smallest stick.
 *
 * Suppose we have six sticks of the following lengths: 5 4 4 2 2 8
 *
 * Then, in one cut operation we make a cut of length 2 from each of the six
 * sticks. For the next cut operation four sticks are left (of non-zero length),
 * whose lengths are the following: 3 2 2 6
 *
 * The above step is repeated until no sticks are left.
 *
 * Given the length of N sticks, print the number of sticks that are left before
 * each subsequent cut operations.
 *
 * Note: For each cut operation, you have to recalculate the length of smallest
 * sticks (excluding zero-length sticks).
 *
 * @author muslumoncel
 */
public class CutTheStick {

    public static void Solution() {
        List<Integer> sticks = new ArrayList<>();
        List<Integer> cuts = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            sticks.add(scanner.nextInt());
        }
        Collections.sort(sticks);
        while (sticks.get(sticks.size() - 1) > 0) {
            int count = 0, y = 0, cutSize = 0;
            for (int i = y; i < sticks.size(); i++) {
                if (sticks.get(i) > 0) {
                    cutSize = sticks.get(i);
                    y = i;
                    break;
                }
            }
            for (int x = y; x < sticks.size(); x++) {
                sticks.set(x, sticks.get(x) - cutSize);
                count++;
            }
            cuts.add(count);
        }

        cuts.stream().forEach((cut) -> {
            System.out.println(cut);
        });
    }
}
