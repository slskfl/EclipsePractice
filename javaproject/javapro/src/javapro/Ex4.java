package javapro;

import java.util.Scanner;

public class Ex4 /*Ŭ�����̸�*/ {

	public static void main/*�޼ҵ� �̸�*/(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("���� ������? ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		//System.out.println("���� �ݾ� = " + num*1000);
		int prices = num * 1000;
		String memo;
		/*if (num>9) {
			System.out.println("���� �ݾ� = " + prices * 0.8 + "��");
		}
		else {
			System.out.println("���� �ݾ� = " + prices  + "��");
		}*/
		
		int price;
		if(num>=10) {
			price = 800;
			memo = "(���ε� ����)";
		}  
		else {
			price = 1000;
			memo = "(���� ����)";
		}
		System.out.println("���� �ݾ� = " + num*price + "��" + memo);
	}
	

}
