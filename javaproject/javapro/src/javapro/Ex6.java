package javapro;

import java.util.Scanner;

public class Ex6 /*클래스이름*/ {

	public static void main/*메소드 이름*/(String[] args) {
		// TODO Auto-generated method stub
		double dnum = 2.45;
		System.out.println(dnum);
		
		
		
		/*int num = 15;
		int hap = 0;
		if ( num>10 ) {
			System.out.println("10보다  큰 수군요.");
			hap = 10;
		}
		System.out.println("끝." + hap);
		
		byte num = 50;
		System.out.println(num);
		
		char ch = '리';
		System.out.println(ch);
		
		char cha = 66;
		System.out.println(cha);
		
		char chaa = 44032;
		System.out.println(chaa);

		long numLong = 20000000000L;
		System.out.println(numLong);
		
		float numFloat = 25.36f;
		System.out.println(numFloat);
		
		Boolean stop = true;
		if (stop) {
			System.out.println("중지합니다");
		}
		else {
			System.out.println("시작합니다");
		}*/
		
		int num = 56000;
		//byte bnum = num; >> 에러, 
		byte bnum = (byte)num;
		System.out.println(bnum);
	}
}
