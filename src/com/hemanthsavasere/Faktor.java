package com.hemanthsavasere;

import java.util.Scanner;

public class Faktor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int res = (n2 - 1) * n1 + 1;
        System.out.println(res);
    }
}
