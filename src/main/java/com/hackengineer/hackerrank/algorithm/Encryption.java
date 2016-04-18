/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hackengineer.hackerrank.algorithm;

import java.util.Scanner;

/**
 *
 * @author muslumoncel
 */
public class Encryption {

    private static void Solution() {
        Scanner scanner = new Scanner(System.in);
        char[] sentence = scanner.next().trim().toCharArray();
        byte length = (byte) sentence.length;
        byte rows = (byte) Math.floor(Math.sqrt(length));
        byte columns = (byte) Math.ceil(Math.sqrt(length));
        if (rows * columns < length) {
            rows = columns;
        }
        for (byte i = 0; i < columns; i++) {
            for (byte j = 0; j < rows; j++) {
                try {
                    System.out.print(sentence[i + (j * columns)]);
                } catch (Exception e) {
                }
            }
            System.out.print(" ");
        }
    }
}
