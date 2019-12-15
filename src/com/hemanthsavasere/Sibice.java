package com.hemanthsavasere;

import java.util.Scanner;

public class Sibice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        double hyp = Math.sqrt(Math.pow(w, 2) + Math.pow(h, 2));
        int maxi = Math.max(w, h);
        while(a-- > 0){
            int n = sc.nextInt();
            if(n > maxi && n > hyp)
                System.out.println("NE");
            else
                System.out.println("DA");
        }
    }
}
