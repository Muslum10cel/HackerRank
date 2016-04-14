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
 * Sherlock Holmes suspects his archenemy, Professor Moriarty, is once again
 * plotting something diabolical. Sherlock's companion, Dr. Watson, suggests
 * Moriarty may be responsible for MI6's recent issues with their supercomputer,
 * The Beast.
 *
 * Shortly after resolving to investigate, Sherlock receives a note from
 * Moriarty boasting about infecting The Beast with a virus; however, he also
 * gives him a clue—a number, N. Sherlock determines the key to removing the
 * virus is to find the largest Decent Number having N digits.
 *
 * A Decent Number has the following properties:
 *
 * Its digits can only be 3's and/or 5's. The number of 3's it contains is
 * divisible by 5. The number of 5's it contains is divisible by 3. If there are
 * more than one such number, we pick the largest one.
 *
 * Moriarty's virus shows a clock counting down to The Beast's destruction, and
 * time is running out fast. Your task is to help Sherlock find the key before
 * The Beast is destroyed!
 *
 *
 *
 * --- INPUT FORMAT ---
 *
 * The first line is an integer, T, denoting the number of test cases.
 *
 * The T subsequent lines each contain an integer, N, detailing the number of
 * digits in the number.
 *
 * --- OUTPUT FORMAT ---
 *
 * Print the largest Decent Number having N digits; if no such number exists,
 * tell Sherlock by printing -1.
 *
 * --- CONSTRAINTS ---
 *
 * 1<=T≤20
 *
 * 1≤N≤100000
 *
 *
 *
 * --- SAMPLE INPUT ---
 *
 * 4
 * 1
 * 3
 * 5
 * 11
 *
 * --- SAMPLE OUTPUT ---
 *
 * -1 
 * 555
 * 33333
 * 55555533333
 * 
 * 
 *
 * @author muslumoncel
 */
public class SherlockAndTheBeast {

    public static void Solution() {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            int n = scan.nextInt();
            switch (n) {
                case 1:
                case 2:
                    System.out.println("-1");
                    break;
                case 3:
                    System.out.println("555");
                    break;
                case 5:
                    System.out.println("33333");
                    break;
                default:
                /**
                 * will try later
                 */
            }
        }
    }
}
