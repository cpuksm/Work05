package com.exam;
/* [����2]65430���� ����� ���� ȭ���� ������ ���Ͻÿ�._ �ܼ� ��Ģ�������θ�.!
money = 65430��
���� = 6
õ�� = 5
��� = 4
�ʿ� = 3*/

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

		System.out.printf("money = %5d��\n ���� = %1d��\n õ�� = %1d��\n ��� = %1d��\n �ʿ� = %1d��\n �� = %1d��", a, m, c, b, s,
				(m + c + b + s));
	}

}
