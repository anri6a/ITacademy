package Lab2;
import java.util.Scanner;
/*
 * 7 ������� �� ����� �������� ��� ������ �� ���������� ������ ���
 */
public class DayOfWeek {
	private static Scanner EnterDay; 
	public static void main(String[] args) {
		EnterDay=new Scanner(System.in);
		int enterDay;
		System.out.println("Enter Number of Day 1-7");
		enterDay=EnterDay.nextInt();
		switch (enterDay) {
		case 1:
			System.out.println("���� ���� - �����������");
			break;
		case 2:
			System.out.println("���� ���� - �������");
			break;
		case 3:
			System.out.println("���� ���� - �����");
			break;
		case 4:
			System.out.println("���� ���� - �������");
			break;
		case 5:
			System.out.println("���� ���� - �������");
			break;
		case 6:
			System.out.println("���� ���� - �������");
			break;
		case 7:
			System.out.println("���� ���� - �����������");
			break;
		default:
			System.out.println("������ ��� ������ �� ����������");
			break;
		}

	}

}
