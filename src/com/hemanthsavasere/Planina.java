package com.hemanthsavasere;

import java.util.Scanner;

public class Planina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = 2;
        long n = sc.nextLong();
        int latest = 0;
        for(int i = 1; i <= n; i++){
            start = start + (int) Math.pow(2,i-1);
        }
        System.out.println(start * start);
    }
}
