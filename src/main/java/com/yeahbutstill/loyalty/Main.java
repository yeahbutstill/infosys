package com.yeahbutstill.loyalty;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner redeem = new Scanner(System.in);
        System.out.print("Redeem point: ");

        int point = redeem.nextInt();
        int pulsa = 0;
        if (point >= 100 && point < 200) {
            pulsa = 10_000;
        } else if (point >= 200 && point < 400) {
            pulsa = 25_000;
        } else if (point >= 400 && point < 800) {
            pulsa = 50_000;
        } else if (point >= 1000 && point < 1150) {
            pulsa = 100_000;
            int sisaPoint = point - 1000;
            System.out.println(sisaPoint);
        } else if (point >= 1150) {
            pulsa = 100_000 + 25_000 + 10_000;
            int sisaPoint = point - 1150;
            System.out.println(sisaPoint);
        }

        System.out.println("Pulsa = " + pulsa);
    }
}