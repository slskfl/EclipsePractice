package javapro;

import java.util.Scanner;

public class Ex9{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		/*int num1 = 2000000;
		int num2 = 2000000;
		int result = num1 * num2;
		
		System.out.println(result);*/ 
		
		try {
			int a = 10;
			int b = 0;
			int c = a/b;
			System.out.println(c);
		}catch( ArithmeticException/*���� �� �߻��ϴ� ������ ����*/ e) {
			System.out.println("0���� ���� �� ���� �߻�.");
		}
		
	}
}
