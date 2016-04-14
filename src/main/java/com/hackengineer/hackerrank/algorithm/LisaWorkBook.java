/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hackengineer.hackerrank.algorithm;

import java.util.Scanner;

/**
 *
 * Problem Definition :
 *
 * Lisa just got a new math workbook. A workbook contains exercise problems,
 * grouped into chapters.
 *
 *
 * There are n chapters in Lisa's workbook, numbered from 1 to n.
 *
 * The i-th chapter has ti problems, numbered from 1 to ti. Each page can hold
 * up to k problems.
 *
 * There are no empty pages or unnecessary spaces, so only the last page of a
 * chapter may contain fewer than k problems.
 *
 * Each new chapter starts on a new page, so a page will never contain problems
 * from more than one chapter.
 *
 * The page number indexing starts at 1.
 *
 *
 * Lisa believes a problem to be special if its index (within a chapter) is the
 * same as the page number where it's located. Given the details for Lisa's
 * workbook, can you count its number of special problems?
 *
 * @author muslumoncel
 */
public class LisaWorkBook {

    public static void Solution() {
        Scanner scanner = new Scanner(System.in);
        int count = 0, page = 1;
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int temp = scanner.nextInt();
            for (int x = 1; x <= temp; x++) {
                if (x == page) {
                    count++;
                }
                if (x % k == 0) {
                    page++;
                }
            }
            if (temp % k != 0) {
                page++;
            }
        }
        System.out.println(count);
    }
}
