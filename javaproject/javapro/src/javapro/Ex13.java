package javapro;

import java.util.Scanner;

public class Ex13{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 10;
		String str1 ="김철수"; // str1과 str2는 같은 주소를 가리키고 있음.
		String str2 ="김철수";
		String str3 = new String("김철수"); //새로운 주소를 설정
		System.out.println( str1==str2 ); //t >> 주소를 비교하여 출력
		System.out.println( str1==str3 ); //f
		System.out.println(str1.equals(str3)); //자료를 비교하여 결과를 출력
	}
}
