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
 * Your local library needs your help! Given the expected and actual return
 * dates for a library book, create a program that calculates the fine (if any).
 * The fee structure is as follows:
 *
 * 1-) If the book is returned on or before the expected return date, no fine
 * will be charged (i.e.: fine=0)fine=0).
 *
 * 2-) If the book is returned after the expected return day but still within
 * the same calendar month and year as the expected return date, fine=15 Hackos
 * × (the number of days late)fine=15 Hackos × (the number of days late).
 *
 * 3-) If the book is returned after the expected return month but still within
 * the same calendar year as the expected return date, the fine=500 Hackos ×
 * (the number of months late)fine=500 Hackos × (the number of months late).
 *
 * 4-) If the book is returned after the calendar year in which it was expected,
 * there is a fixed fine of 10000 Hackos10000 Hackos.
 *
 *
 *
 * --- INPUT FORMAT ---
 *
 * The first line contains 3 space-separated integers denoting the respective
 * day, month, and year on which the book was actually returned.
 *
 * The second line contains 3 space-separated integers denoting the respective
 * day, month, and year on which the book was expected to be returned (due
 * date).
 *
 * --- OUTPUT FORMAT ---
 *
 * Print a single integer denoting the library fine for the book received as
 * input.
 *
 * --- CONSTRAINTS ---
 *
 * 1<=D≤31
 *
 * 1≤M≤12
 *
 * 1≤Y≤3000
 *
 * It is guaranteed that the dates will be valid Gregorian calendar dates.
 *
 *
 *
 * --- SAMPLE INPUT ---
 *
 * 9 6 2015
 *
 * 6 6 2015
 *
 * --- SAMPLE OUTPUT ---
 *
 * 45
 *
 *
 *
 * @author muslumoncel
 */
public class LibraryFine {

    public static void Solution() {
        Scanner scanner = new Scanner(System.in);
        short Ya, Ye, Y;
        byte Ma, Me, Da, De, D, M;
        Da = scanner.nextByte();
        Ma = scanner.nextByte();
        Ya = scanner.nextShort();
        De = scanner.nextByte();
        Me = scanner.nextByte();
        Ye = scanner.nextShort();
        D = (byte) (Da - De);
        M = (byte) (Ma - Me);
        Y = (short) (Ya - Ye);

        if (Y < 0) {
            System.out.println(0);
        } else if (Y == 0) {
            if (M < 0) {
                System.out.println(0);
            } else if (M == 0) {
                if (D <= 0) {
                    System.out.println(0);
                } else {
                    System.out.println(15 * D);
                }
            } else {
                System.out.println((500 * M));
            }
        } else {
            System.out.println(10000);
        }
    }
}
