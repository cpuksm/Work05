package com.exam;

import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("**** �ﰢ���� ���� ���ϱ�  ****");
        System.out.print("�غ�  :  ");
        int a = sc.nextInt();
        System.out.print("����  :  ");
        int b = sc.nextInt();
        sc.close();
        double bred = (double)(a*b)/2;
        
        System.out.printf("\n����  :  %.2f",bred);
}
}