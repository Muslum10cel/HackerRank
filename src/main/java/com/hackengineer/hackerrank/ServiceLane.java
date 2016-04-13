/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hackengineer.hackerrank;

import java.util.Scanner;

/**
 *
 * Definition of Problem :
 *
 * Calvin is driving his favorite vehicle on the 101 freeway. He notices that
 * the check engine light of his vehicle is on, and he wants to service it
 * immediately to avoid any risks. Luckily, a service lane runs parallel to the
 * highway. The length of the service lane is N units. The service lane
 * consists of N segments of equal length and different width.
 *
 * Calvin can enter to and exit from any segment. Let's call the entry segment
 * as index i and the exit segment as index j. Assume that the exit segment
 * lies after the entry segment (i<=j) and 0≤i. Calvin has to pass through
 * all segments from index i to index j (both inclusive).
 *
 *
 * Calvin has three types of vehicles - bike, car, and truck - represented by
 * 1, 2 and 3, respectively. These numbers also denote the width of the
 * vehicle.
 *
 * You are given an array width of length N, where width[k] represents
 * the width of the kth segment of the service lane. It is guaranteed that while
 * servicing he can pass through at most 1000 segments, including the entry
 * and exit segments.
 *
 * If width[k]=1, only the bike can pass through the kth segment.
 * If width[k]=2, the bike and the car can pass through the kth segment.
 * If width[k]=3, all three vehicles can pass through the kth segment.
 * 
 * 
 * Given the entry and exit point of Calvin's vehicle in the service lane,
 * output the type of the largest vehicle which can pass through the service
 * lane (including the entry and exit segments).
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
