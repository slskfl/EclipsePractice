package javapro;

import java.util.Scanner;

public class Ex10{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����ó�� try~ catch ���.
		try {
			int result = safeAdd(2000000000, 2000000000);
			System.out.println(result);
		}catch (ArithmeticException e) {
			System.out.println("�����÷ο찡 �߻��Ͽ� ��Ȯ�ϰ� ����� �� ����.");
		} // ����ó�� �ڵ�
	}
	
	public static int safeAdd(int left, int right) {
		if (right > 0) {
			if ( left > (Integer.MAX_VALUE - right)) {
				throw new ArithmeticException("�����÷ο� �߻�.");
			}
		} else { // right<=0�� ���
			if (left < (Integer.MIN_VALUE - right)) {
				throw new ArithmeticException("�����÷ο� �߻�.");
			}
		}
		return left + right;
	}
		
	
}
