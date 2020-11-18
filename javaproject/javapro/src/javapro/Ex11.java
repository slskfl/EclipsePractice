package javapro;

import java.util.Scanner;

public class Ex11{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		double result = apple - number * pieceUnit;
		
		System.out.println("사과 한개에서");
		System.out.println("0.7 조각을 빼면");
		System.out.println(result + "조각이 남는다.");*/
		
		/*int kor = 85, eng = 79, mat = 93; // 평균을 구해서  소수점 두자리까지 나오도록.
		int total = kor + eng + mat;
		int avgNum = 3;*/
		
		int kor = 85, eng = 79, mat = 93; // 평균을 구해서  소수점 두자리까지 나오도록.
		int total = kor + eng + mat;
		double avg = total / 3.0;
		avg = (int)( avg*100 ); // 100을 곱하여 총 4자리 숫자로 만듦.
		
		
		System.out.println("총점은 = " + total);
		System.out.println("평균은 = " + avg /100); // 100으로 나누어 소수점 기준으로 두자리로 출력.
		
	}
}
