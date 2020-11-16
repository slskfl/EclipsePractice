package javapro;

import java.util.Scanner;

public class Ex3 /*클래스이름*/ {

	public static void main/*메소드 이름*/(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("구입 수량은? ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println("총 매출액 = " + num*1000);
		
		
	}

}
