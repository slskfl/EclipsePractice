package javapro;

import java.util.Scanner;

public class Ex10{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//예외처리 try~ catch 사용.
		try {
			int result = safeAdd(2000000000, 2000000000);
			System.out.println(result);
		}catch (ArithmeticException e) {
			System.out.println("오버플로우가 발생하여 정확하게 계산할 수 없음.");
		} // 예외처리 코드
	}
	
	public static int safeAdd(int left, int right) {
		if (right > 0) {
			if ( left > (Integer.MAX_VALUE - right)) {
				throw new ArithmeticException("오버플로우 발생.");
			}
		} else { // right<=0일 경우
			if (left < (Integer.MIN_VALUE - right)) {
				throw new ArithmeticException("오버플로우 발생.");
			}
		}
		return left + right;
	}
		
	
}
