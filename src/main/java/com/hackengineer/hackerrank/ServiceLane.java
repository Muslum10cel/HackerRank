/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hackengineer.hackerrank;

import java.util.Scanner;

/**
 *
 * @author muslumoncel
 */
class ServiceLane {

    private static final Integer[] width = new Integer[100000];
    private static final int BIKE = 1, CAR = 2, TRUCK = 3;

    public static void Solution() {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int T = scanner.nextInt();
        for (int j = 0; j < N; j++) {
            width[j] = scanner.nextInt();
        }
        for (int i = 0; i < T; i++) {
            int bikecount = 0, carcount = 0, truckcount = 0;
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int len = (y - x) + 1;
            for (int j = x; j < y; j++) {
                if (width[j] >= BIKE) {
                    bikecount++;
                }
                if (width[j] >= CAR) {
                    carcount++;
                }
                if (width[j] >= TRUCK) {
                    truckcount++;
                }
                if (len == bikecount) {
                    if (len == carcount) {
                        if (len == truckcount) {
                            System.out.println(3);
                        } else {
                            System.out.println(2);
                        }
                    } else {
                        System.out.println(1);
                    }
                }
            }
        }
    }
}
