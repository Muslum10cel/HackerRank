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

    private static final Byte[][] map = new Byte[101][101];
    private static final String[][] temp = new String[101][101];

    public static void Solution() {
        Scanner scanner = new Scanner(System.in);
        byte n = scanner.nextByte(), i, j;
        for (i = 0; i < n; i++) {
            String[] line = scanner.next().trim().split("");
            for (j = 0; j < n; j++) {
                try {
                    map[i][j] = Byte.parseByte(line[j]);
                    temp[i][j] = line[j];
                } catch (Exception e) {
                }

            }
        }

        for (i = 1; i < n - 1; i++) {
            for (j = 1; j < n - 1; j++) {
                if (map[i][j - 1] < map[i][j] && map[i - 1][j] < map[i][j] && map[i][j + 1] < map[i][j] && map[i + 1][j] < map[i][j]) {
                    temp[i][j] = "X";
                }
            }
        }
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(temp[i][j]);
            }
            System.out.println();
        }

    }
}
