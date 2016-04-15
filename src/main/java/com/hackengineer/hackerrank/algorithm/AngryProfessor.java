/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hackengineer.hackerrank.algorithm;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

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
 *
 *
 * --- INPUT FORMAT ---
 *
 * The first line of input contains T, the number of test cases.
 *
 * Each test case consists of two lines. The first line has two space-separated
 * integers, N (students in the class) and K (the cancellation threshold). The
 * second line contains N space-separated integers (a1,a2,..,aN) describing the
 * arrival times for each student.
 *
 * Note: Non-positive arrival times (ai<=0) indicate the student arrived
 * early or on time; positive arrival times (ai>0) indicate the student arrived
 * ai minutes late.
 *
 * --- OUTPUT FORMAT ---
 *
 * For each test case, print the word YES if the class is canceled or NO if it
 * is not.
 *
 * --- CONSTRAINTS ---
 *
 * 1<=T≤10
 *
 * 1≤N≤1000
 *
 * 1≤K≤N
 *
 * −100≤ai≤100,where i∈[1,N]
 *
 * Note If a student arrives exactly on time (ai=0), the student is considered
 * to have entered before the class started.
 *
 *
 *
 * --- SAMPLE INPUT ---
 *
 * 2
 *
 * 4 3
 *
 * -1 -3 4 2
 *
 * 4 2
 *
 * 0 -1 2 1
 *
 * --- SAMPLE OUTPUT ---
 *
 * YES
 *
 * NO
 *
 *
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
