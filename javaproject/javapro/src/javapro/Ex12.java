package javapro;

import java.util.Scanner;

public class Ex12{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println( 5>=10 );
		System.out.print("구입 수량은?");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.print("구입 가격은?");
		int price = scan.nextInt();
		int total = num * price;
		
		if ( price>= 10000) {
			if ( num>=10 ) {
				int sales = (int)(total * 0.8);
				System.out.println("총 금액은 = " + sales);
			} 
		}else {
			System.out.println("총 금액은 = " + total);
		}
		
		
	}
}
