package com.exam;
/* [문제2]65430원을 만들기 위한 화폐의 갯수를 구하시오._ 단순 사칙연산으로만.!
money = 65430원
만원 = 6
천원 = 5
백원 = 4
십원 = 3*/

public class Test02 {

	public static void main(String[] args) {

		int a = 65430;
		int m = (a / 10000);
		int c = ((a - 60000) / 1000);
		int b = ((a - 65000) / 100);
		int s = ((a - 65400) / 10);

		// int money = 65430;
		// int q = (money/10000);
		// money = money-(a*10000);

		System.out.printf("money = %5d원\n 만원 = %1d개\n 천원 = %1d개\n 백원 = %1d개\n 십원 = %1d개\n 총 = %1d개", a, m, c, b, s,
				(m + c + b + s));
	}

}
