package javapro;

import java.util.Scanner;

public class Ex7 /*클래스이름*/ {

	public static void main/*메소드 이름*/(String[] args) {
		// TODO Auto-generated method stub
		boolean sw = false;
		for(int i=0 ; i<5 ; i++) {
			sw =! sw;
			if(sw) {
				System.out.println("켜기");
			} else {
				System.out.println("끄기");
			}
		}
		
	
		/*int score = 75;
		if( !(score<80)){
			System.out.println("합격하셨습니다");
		}
		System.out.println("수고하셨습니다");*/
		
		/*int a = 2, b = 3, result;
		result = ++a + --b * a--;
		System.out.println("a의 값 = " + a);
		System.out.println("b의 값 = " + b);
		System.out.println("result의 값 = " + result);*/
	}
}
