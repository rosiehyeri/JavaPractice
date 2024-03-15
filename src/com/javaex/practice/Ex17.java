package com.javaex.practice;

//다음 코드의 오류가 나는 부분을 찾은 후 이유를 작성하세요.
//(코드를 작성해서 오류가 없도록 변경해 보세요.)

public class Ex17 {
//	public static void main(String[] args) {
//		
//		int x, y          // int x, y : 변수 선언이 끝나지 않았습니다. 변수를 선언할 때는 세미콜론으로 문장을 종료해야 합니다.
//		
//		x = 10
//		y = 20
//		
//		sum = x + y			// sum = x + y : 변수 sum이 선언되어 있지 않습니다. 
//							// 따라서 이 부분은 변수를 선언하지 않은 상태에서 값을 대입하려고 하기 때문에 오류가 발생합니다.
//		
//		System.out.println("합은 ' + sum);   //System.out.println("합은 ' + sum); : 문자열을 출력할 때 따옴표를 닫아주지 않았습니다.
//	}
	
public static void main(String[] args) {
		
		int x = 10;
		int y = 20;
		
		
		int sum = x + y;
		
		System.out.println("합은 " + sum);
	}



}
