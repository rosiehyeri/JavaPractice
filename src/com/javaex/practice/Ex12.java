package com.javaex.practice;
//다음코드의 잘못된 부분을 찾아서 수정해 보세요.
//(코드를 작성해서 오류가 없도록 변경해 보세요.)

public class Ex12 {

//	public static void main(String[] args) {
//		int x, y = 0;		//x와 y를 모두 0으로 초기화
//		char grade = "A";	//문자 A를 grade에 대입
//		int salary = 2,000,000;		//salary에 2,000,000을 대입
//		byte n = 1000;			//n에 1000을 대입
//		
//
//	}
	
	public static void main(String[] args) {
		int x = 0, y = 0;		// int x, y = 0;에서 변수 y만 0으로 초기화되고 x는 초기화되지 않았으므로 
								// int x = 0, y = 0;으로 수정합니다.
		
		char grade = 'A';	// 문자열 대신에 단일 문자를 사용해야 하므로 "A"를 'A'로 수정합니다.
		int salary = 2_000_000;		// 정수를 표현할 때 쉼표를 사용할 수 없으므로 2,000,000을 2_000_000으로 수정합니다.
		short n = 1000;			// byte 데이터 타입의 범위를 벗어나므로 short로 수정합니다.
		

	}

}
