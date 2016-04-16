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
 * Julius Caesar protected his confidential information by encrypting it in a
 * cipher. Caesar's cipher rotated every letter in a string by a fixed number,
 * K, making it unreadable by his enemies. Given a string, S, and a number, K,
 * encrypt S and print the resulting string.
 *
 * Note: The cipher only encrypts letters; symbols, such as -, remain
 * unencrypted.
 *
 * --- INPUT FORMAT ---
 *
 * The first line contains an integer, N, which is the length of the unencrypted
 * string. The second line contains the unencrypted string, S. The third line
 * contains the integer encryption key, K, which is the number of letters to
 * rotate.
 *
 * --- OUTPUT FORMAT ---
 *
 * For each test case, print the encoded string.
 *
 * --- CONSTRAINTS ---
 *
 * 1<=N≤100
 *
 * 0≤K≤100
 *
 * S is a valid ASCII string and doesn't contain any spaces.
 *
 *
 *
 * --- SAMPLE INPUT ---
 *
 * 11
 *
 * middle-Outz
 *
 * 2
 *
 * --- SAMPLE OUTPUT ---
 *
 * okffng-Qwvb
 *
 *
 *
 * @author muslumoncel
 */
public class CeaserCipher {

    public static void Solution() {
        Scanner scanner = new Scanner(System.in);
        StringBuilder builder = new StringBuilder();
        int N = scanner.nextInt();
        String message = scanner.next();
        int K = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            char temp = message.charAt(i);
            int temp1 = K;
            if ((64 < temp && temp < 91) || (96 < temp && temp < 123)) {
                while (temp1-- > 0) {
                    ++temp;
                    switch (temp) {
                        case 91:
                            temp = 65;
                            break;
                        case 123:
                            temp = 97;
                    }
                }
                builder.append(temp);
            } else {
                builder.append(temp);
            }
        }
        System.out.println(builder.toString());
    }
}
