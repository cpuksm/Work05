package com.exam;

public class Test01 {
	public static void MyView(String a, String b) {
		
		
		int a1 = Integer.parseInt(a);
		int b1 = Integer.parseInt(b);
		
		//System.out.printf("%5d * %5d = %5d",a1,b1,(a1*b1));
		String str = String.format("%5d * %5d = %5d",a1,b1,(a1*b1));
		System.out.println(str);

	}
	
public static String MyView02(String a, String b) {
		
		
		int a1 = Integer.parseInt(a);
		int b1 = Integer.parseInt(b);
		
		
		String str = String.format("%5d * %5d = %5d",a1,b1,(a1*b1));
	return(str);

	}
public void MyView03(String a, String b) {
	
	
	int a1 = Integer.parseInt(a);
	int b1 = Integer.parseInt(b);
	
	
	String str = String.format("%5d * %5d = %5d",a1,b1,(a1*b1));
	System.out.println(str);

}
public String MyView04(String a, String b) {
	
	
	int a1 = Integer.parseInt(a);
	int b1 = Integer.parseInt(b);
	
	
	String str = String.format("%5d * %5d = %5d",a1,b1,(a1*b1));
	System.out.println(str);
	return str;

}
	public static void main(String[] args) {
		//메인으로 부터 두개의 값을 받아 a,b에 대입을 하고 a*b = 
		
		
		//String a = "90";
		//String b = "80";
		String a = args[0];
		String b = args[1];
		MyView(a,b); // public static void MyView(a,b)
	  String res = MyView02(a,b); // public static String MyView(a,b)
	  System.out.println("결과 : "+res);
	  
	  System.out.println("non_Static 호출해보자.");
	  new Test01().MyView03(a, b);
	  
	  String res02 = new Test01().MyView04(a, b);
	  System.out.println("결과 "+ res02);
	}

}
