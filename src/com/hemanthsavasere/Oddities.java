package com.hemanthsavasere;

import java.util.Scanner;

public class Oddities {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while(a-- > 0){
            int n = sc.nextInt();
            if(n % 2 == 0)
                System.out.println(n + " is even");
            else
                System.out.println(n + " is odd");
        }
    }
}
