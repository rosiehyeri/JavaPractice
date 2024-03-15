package com.javaex.practice;

public class Ex18 {
	
	//다음의 코드를 컴파일 할 때 오류가 발생한다. 오류의 원인은?
	
//	public static void main(String[] args) {
//		int x;
//		System.out.println(x);
		
		//주어진 코드를 컴파일할 때 오류가 발생하는 이유는 변수 x가 초기화되지 않았기 때문입니다.
		//Java에서 지역 변수는 반드시 초기화되어야 합니다. 변수를 선언할 때 초기값을 주지 않으면 컴파일러가 해당 변수가 사용되기 전에 값을 가지고 있지 않다는 것을 인식합니다.
		//따라서 오류를 해결하려면 변수 x에 초기값을 할당해야 합니다. 아니면 변수를 사용하기 전에 초기화해야 합니다.
	
	public static void main(String[] args) {
		int x = 0;
		System.out.println(x);
	}

}
