package javapro;

import java.util.Scanner;

public class Ex4 /*클래스이름*/ {

	public static void main/*메소드 이름*/(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("구입 수량은? ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		//System.out.println("구입 금액 = " + num*1000);
		int prices = num * 1000;
		String memo;
		/*if (num>9) {
			System.out.println("구입 금액 = " + prices * 0.8 + "원");
		}
		else {
			System.out.println("구입 금액 = " + prices  + "원");
		}*/
		
		int price;
		if(num>=10) {
			price = 800;
			memo = "(할인된 가격)";
		}  
		else {
			price = 1000;
			memo = "(정상 가격)";
		}
		System.out.println("구입 금액 = " + num*price + "원" + memo);
	}
	

}
