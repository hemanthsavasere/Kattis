package com.hemanthsavasere;

import java.util.Scanner;

public class HissingMicrophone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        boolean hiss = false;
        String s2 = s1 + "$";
        for (int i = 0; i < s1.length(); i++) {
            if (s2.charAt(i) == 's' && s2.charAt(i+1) == 's'){
                hiss = true;
                break;
            }
        }
        if(hiss)
            System.out.println("hiss");
        else
            System.out.println("no hiss");
    }
}
