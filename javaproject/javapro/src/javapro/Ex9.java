package javapro;

import java.util.Scanner;

public class Ex9 /*Ŭ�����̸�*/ {

	public static void main/*�޼ҵ� �̸�*/(String[] args) {
		// TODO Auto-generated method stub
		/*byte num1 = 10;
		//byte num2 = ~num1; >> ~num1�� ����
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
		
		System.out.println("�������� = " + maonM + "��");
		System.out.println("��õ������ = " + OcheonM + "��");
		System.out.println("õ������ = " + cheonM + "��");
		System.out.println("����� = " + ObackM + "��");
		System.out.println("��� = " + backM + "��");
		System.out.println("�ʿ� = " + shipM + "��");
		
		//���� 3��, ��õ�� 1��, õ�� 2��, ����� 1��, �ʿ� 6��
	}
}
