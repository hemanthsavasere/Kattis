package com.hemanthsavasere;

import java.util.Scanner;

public class Tarifa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a = sc.nextInt();
        int usage = x * a;
        while (a-- > 0) {
            usage -= sc.nextInt();
        }
        System.out.println(usage + x);
    }
}
