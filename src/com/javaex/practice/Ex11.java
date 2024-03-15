package com.javaex.practice;

public class Ex11 {
//	아래의 코드에서 오류가 발생하는 부분을 예상하고 수정하세요
//	public static void main(String[] args) {
//		
//		int iVar = 10;
//		long lVar = 100000000000L;
//		char cVar = 'ab';
//		double dVar = 10;
//		float fVar = 12.4;
//		String str = 'ab';
//	}
public static void main(String[] args) {
		
		int iVar = 10;
		long lVar = 100000000000L;
		char cVar = 'a'; // 'ab'는 하나의 문자가 아니므로 수정한다. 문자(char)를 표현할 때 작은 따옴표를 사용한다.
		double dVar = 10;
		float fVar = 12.4f; // float 타입의 변수를 선언할 때는 숫자 뒤에 f를 붙여야 한다.
		String str = "ab"; // 문자열은 큰 따옴표로 감싸야한다. 문자열(String)을 표현할 때 큰 따옴표를 사용한다.
}
}
