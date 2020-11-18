package javapro;

import java.util.Scanner;

public class Ex9 /*클래스이름*/ {

	public static void main/*메소드 이름*/(String[] args) {
		// TODO Auto-generated method stub
		/*byte num1 = 10;
		//byte num2 = ~num1; >> ~num1은 에러
		int num2 = num1;
		System.out.println(num2);*/
		
		int money = 37960;
		int maonM = money / 10000;
		int restM = money % 10000; // 7960
		int OcheonM = restM / 5000; 
		restM = restM % 5000; // 2960
		int cheonM = restM / 1000;
		restM = restM % 1000; // 960
		int ObackM = restM / 500;
		restM = restM % 500; //450
		int backM = restM / 100;
		restM = restM % 100; //50
		int shipM = restM / 10;
		restM = restM % 10; //0 
		
		System.out.println("만원지폐 = " + maonM + "장");
		System.out.println("오천원지폐 = " + OcheonM + "장");
		System.out.println("천원지폐 = " + cheonM + "장");
		System.out.println("오백원 = " + ObackM + "개");
		System.out.println("백원 = " + backM + "개");
		System.out.println("십원 = " + shipM + "개");
		
		//만원 3장, 오천원 1장, 천원 2장, 오백원 1개, 십원 6개
	}
}
