package com.exam;
/*[문제4] 각각변수에 대입하여 출력하시오
조건1) data는 홍길동, 개발부, 과장, 1500000로 대입
       변수명은 각각  name,department,position,sal로 할것
조건2)출력은 아래와 같은 메서드(함수)를 이용하시오

--출력--
이름 : 홍길동    ---> println
부서 : 과장     ---> printf  
직위 : 대리       ---> print 1번만써서 직위,급여출력
급여 : 1500000원*/


public class Test04 {

	public static void main(String[] args) {
		 String name ="홍길동";
		 String department = "과장";
		 String position = "대리";
		 int sal = 1500000;
		 
		 System.out.println("이름:"+ name);
		 System.out.printf("부서:%s\n", department);
		 System.out.print("직위:" + position +"\n 급여:"+sal +"원");

	}

}
