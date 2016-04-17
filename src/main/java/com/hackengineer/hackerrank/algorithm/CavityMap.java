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
 * You are given a square map of size n×n. Each cell of the map has a value
 * denoting its depth. We will call a cell of the map a cavity if and only if
 * this cell is not on the border of the map and each cell adjacent to it has
 * strictly smaller depth. Two cells are adjacent if they have a common side
 * (edge).
 *
 * You need to find all the cavities on the map and depict them with the
 * uppercase character X.
 *
 *
 *
 * --- INPUT FORMAT ---
 *
 * The first line contains an integer, n, denoting the size of the map. Each of
 * the following n lines contains n positive digits without spaces. Each digit
 * (1-9) denotes the depth of the appropriate area.
 *
 * --- OUTPUT FORMAT ---
 *
 * Output n lines, denoting the resulting map. Each cavity should be replaced
 * with character X.
 *
 * --- CONSTRAINTS ---
 *
 * 1<=n≤100
 *
 *
 *
 * --- SAMPLE INPUT ---
 *
 * 4
 *
 * 1112
 *
 * 1912
 *
 * 1892
 *
 * 1234
 *
 * --- SAMPLE OUTPUT ---
 *
 * 1112
 *
 * 1X12
 *
 * 18X2
 *
 * 1234
 *
 *
 *
 * @author muslumoncel
 */
public class CavityMap {

    public static void Solution() {
        Scanner scanner = new Scanner(System.in);
        byte n = scanner.nextByte(), i, j;

    }

    public static void main(String[] args) {
        Solution();
    }
}
