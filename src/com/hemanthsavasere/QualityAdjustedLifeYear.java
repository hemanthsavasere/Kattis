package com.hemanthsavasere;

import java.util.Scanner;

public class QualityAdjustedLifeYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double sum = 0;
        while (a-- > 0) {
            double n1 = sc.nextDouble(), n2 = sc.nextDouble();
            sum += n1 * n2;
        }
        System.out.println(sum);
    }
}
