package com.exam;

import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("**** ªÔ∞¢«¸¿« ≥–¿Ã ±∏«œ±‚  ****");
        System.out.print("πÿ∫Ø  :  ");
        int a = sc.nextInt();
        System.out.print("≥Ù¿Ã  :  ");
        int b = sc.nextInt();
        sc.close();
        double bred = (double)(a*b)/2;
        
        System.out.printf("\n≥–¿Ã  :  %.2f",bred);
}
}