package Lab2;
import java.util.Scanner;
/*
 * 2 ������� �� ��������� ����, ��������� � ���������� �����
 */
public class CompareNumbers {
	private static Scanner enterNum;

	public static void main(String[] args) {
		enterNum=new Scanner(System.in);
		System.out.println("Enter first and second number");
		int firstNum, secondNum;
		firstNum=enterNum.nextInt();
		secondNum=enterNum.nextInt();
		//System.out.println(firstNum);
		//System.out.println(secondNum);
		
			if (firstNum>secondNum){
			System.out.println("1>2");
	} else if (firstNum<secondNum){
		System.out.println("1<2");
	} else {
		System.out.println("1=2");
	}
	}
}
