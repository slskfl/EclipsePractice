package javapro;

import java.util.Scanner;

public class Ex11{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		double result = apple - number * pieceUnit;
		
		System.out.println("��� �Ѱ�����");
		System.out.println("0.7 ������ ����");
		System.out.println(result + "������ ���´�.");*/
		
		/*int kor = 85, eng = 79, mat = 93; // ����� ���ؼ�  �Ҽ��� ���ڸ����� ��������.
		int total = kor + eng + mat;
		int avgNum = 3;*/
		
		int kor = 85, eng = 79, mat = 93; // ����� ���ؼ�  �Ҽ��� ���ڸ����� ��������.
		int total = kor + eng + mat;
		double avg = total / 3.0;
		avg = (int)( avg*100 ); // 100�� ���Ͽ� �� 4�ڸ� ���ڷ� ����.
		
		
		System.out.println("������ = " + total);
		System.out.println("����� = " + avg /100); // 100���� ������ �Ҽ��� �������� ���ڸ��� ���.
		
	}
}
