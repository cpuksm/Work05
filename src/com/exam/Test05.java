package com.exam;
import java.util.*;
public class Test05 {

	public static void main(String[] args) {
		//����Ÿ Ÿ�� 
		String name = null;
		int kor = 0, eng=0, mat =0, tot= 0;
		double avg =0.0;

		//������
		Scanner sc = new Scanner(System.in);
		System.out.print("input name : ");
		name = sc.nextLine();
		
		System.out.print("kor : "); kor= sc.nextInt();
		System.out.print("eng : "); eng= sc.nextInt();
		System.out.print("mat : "); mat= sc.nextInt();
		
		//����
		tot = kor+eng+mat;
		avg = (double) tot/3;
		//���
		System.out.println("�̸�:"+name);
		System.out.println("�հ�����:"+tot + "��");
		System.out.printf("������� : %5.1f",avg);
		
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("�Է��ϼ��� �̸� = ");
		String name = sc.nextLine();
		System.out.println("name : "+name);*/
	}

}
