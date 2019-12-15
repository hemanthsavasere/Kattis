package com.hemanthsavasere;

import java.util.Scanner;

public class Pot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        long sum = 0;
        while (a-- > 0) {
            long n1 = sc.nextLong();
            long x1 = n1 % 10;
            long y1 = n1 / 10;
            sum += (long) Math.pow(y1, x1);
        }
        System.out.println(sum);
    }
}
