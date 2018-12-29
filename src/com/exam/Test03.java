package com.exam;

/*[문제3] 급여명세서를 작성하시오
  조건1) 기본급이 1,500,000원,수당이 55,000원,세금은 기본급의 10%
  조건2) 실수령액 = 기본급 + 시간수당 - 세금

--출력--     
실수령액 : 1405000원*/


public class Test03 {
	
	
	
	public static void main(String[] args) {

		int a = 1500000;
		int b = 55000;
		int c = 1500000/10;
		int d = a+b-c;
		
		System.out.println(d);
		
	}
}
