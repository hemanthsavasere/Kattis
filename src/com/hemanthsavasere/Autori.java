package com.hemanthsavasere;

import java.util.Scanner;

public class Autori {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String[] s2 = s1.split("-");
        StringBuilder sb = new StringBuilder();
        for (String i : s2) {
            sb.append(i.charAt(0));
        }
        System.out.println(sb.toString());
    }
}
