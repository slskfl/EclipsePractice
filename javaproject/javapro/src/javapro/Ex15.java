package javapro;

import java.util.Scanner;

public class Ex15  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("���� ������?");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.print("���� ������?");
		int price = scan.nextInt();
		int total = num * price;
		
		if ( price>10000 && num>=10) {
				int sales = (int)(total * 0.8);
				System.out.println("�� �ݾ��� = " + sales);
		} else {
			System.out.println("�� �ݾ��� = " + total);
		}
		
	}

}