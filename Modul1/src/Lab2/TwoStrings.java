package Lab2;
import java.util.Scanner;
/*
 * 1 ������� - � ������������ ������ ������� ���������� ��������, ��������� �� �� 2 ���������,
 * ������� ������� �� �����.
 */

public class TwoStrings {

	private static Scanner enterString;

	public static void main(String[] args) {
		enterString = new Scanner(System.in);
			System.out.println("������� ������������ ������ � ������� Enter");		//����� ������ �� � �������
			String str1;
		str1=enterString.nextLine();
		//String str1=new String("jklsdhglsdmnlwfieflsdkki84938ur48urwoeifj848");
			System.out.println(str1);
		int str1Lenght=str1.length();
			System.out.println("� ������ "+str1Lenght+" �������(��)");
		int halfNum=str1Lenght/2;
			System.out.println("�������� �������� "+halfNum);
		String firstSubStr=str1.substring(0, halfNum);
		String secondSubStr=str1.substring(halfNum, str1Lenght-1);
		System.out.println("������ �������� ������ - "+firstSubStr);
		System.out.println("������ �������� ������ - "+secondSubStr);
		
	}

}
