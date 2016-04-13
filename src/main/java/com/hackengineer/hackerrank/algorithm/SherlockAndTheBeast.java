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
