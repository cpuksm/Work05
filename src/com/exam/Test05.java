package com.exam;
import java.util.*;
public class Test05 {

	public static void main(String[] args) {
		//데이타 타입 
		String name = null;
		int kor = 0, eng=0, mat =0, tot= 0;
		double avg =0.0;

		//값대입
		Scanner sc = new Scanner(System.in);
		System.out.print("input name : ");
		name = sc.nextLine();
		
		System.out.print("kor : "); kor= sc.nextInt();
		System.out.print("eng : "); eng= sc.nextInt();
		System.out.print("mat : "); mat= sc.nextInt();
		
		//연산
		tot = kor+eng+mat;
		avg = (double) tot/3;
		//출력
		System.out.println("이름:"+name);
		System.out.println("합계점수:"+tot + "점");
		System.out.printf("평균점수 : %5.1f",avg);
		
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("입력하세요 이름 = ");
		String name = sc.nextLine();
		System.out.println("name : "+name);*/
	}

}
