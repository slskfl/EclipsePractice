package javapro;

import java.util.Scanner;

public class Ex13{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 10;
		String str1 ="��ö��"; // str1�� str2�� ���� �ּҸ� ����Ű�� ����.
		String str2 ="��ö��";
		String str3 = new String("��ö��"); //���ο� �ּҸ� ����
		System.out.println( str1==str2 ); //t >> �ּҸ� ���Ͽ� ���
		System.out.println( str1==str3 ); //f
		System.out.println(str1.equals(str3)); //�ڷḦ ���Ͽ� ����� ���
	}
}
