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
 * A Discrete Mathematics professor has a class of NN students. Frustrated with
 * their lack of discipline, he decides to cancel class if fewer than KK
 * students are present when class starts.
 *
 * Given the arrival time of each student, determine if the class is canceled.
 *
 * @author muslumoncel
 */
public class AngryProfessor {

    public void Solution() {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            int arrivalCount = 0;
            int n = in.nextInt();
            int cancelationThreshold = in.nextInt();
            int a[] = new int[n];
            for (int a_i = 0; a_i < n; a_i++) {
                a[a_i] = in.nextInt();
                if (a[a_i] <= 0) {
                    arrivalCount++;
                }
            }
            if (arrivalCount >= cancelationThreshold) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
