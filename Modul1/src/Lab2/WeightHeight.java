package Lab2;
import java.util.Scanner;
/*
 * 5 ������� �� ���������� ������������ ����-��������� ����������
 */
public class WeightHeight {
		private static Scanner enterParam;
	public static void main(String[] args) {
		enterParam=new Scanner(System.in);
		int weight, height;
		System.out.println("������� ��� ���");
		weight=enterParam.nextInt();
		System.out.println("������� ��� ����");
		height=enterParam.nextInt();
		if (weight>height-100 && weight !=height-100) {
			System.out.println("��� ���������� ��������!");
		} else if (weight<height-100 && weight !=height-100) {
			System.out.println("��� ���������� �����������");
		} else {
			System.out.println("�� � �������� �����!!!");
		}
	}

}
