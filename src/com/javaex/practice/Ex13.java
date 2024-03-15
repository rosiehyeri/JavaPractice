package com.javaex.practice;

public class Ex13 {
	
//	다음 중 결과값이 다른 것을 선택하고 이유를 설명해 보세요

	public static void main(String[] args) {
		
		System.out.println(13/5);					//	(1)	정수 나눗셈이므로 몫인 2가 출력됩니다.
		System.out.println((double)13/5);			//	(2)	하나의 피연산자가 double로 형변환되어 실수 나눗셈을 수행하므로 결과는 2.6이 됩니다.
		System.out.println(13/(double)5);			//	(3)	하나의 피연산자가 double로 형변환되어 실수 나눗셈을 수행하므로 결과는 2.6이 됩니다.
		System.out.println((double)13/(double)5);	//	(4)	모든 피연산자가 double로 형변환되어 실수 나눗셈을 수행하므로 결과는 2.6이 됩니다.
		System.out.println(13.0/5);					//	(5)	하나의 피연산자가 double 형태로 표현되어 있으므로 실수 나눗셈을 수행하고 결과는 2.6이 됩니다.
		System.out.println(13/5.0);					//	(6)	하나의 피연산자가 double 형태로 표현되어 있으므로 실수 나눗셈을 수행하고 결과는 2.6이 됩니다.
		System.out.println((double)(13/5));			//	(7)	정수 나눗셈을 먼저 수행하고 그 결과를 double로 형변환하므로 2.0이 출력됩니다.
	}
			// 정답 (7)
}
