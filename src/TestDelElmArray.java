/*
��� ������ ����� ����� � ��� ���� ����� �����. ������� ��� ��������� ����� ����� �� ������� (��������� ���� �� ������).
*/

import java.util.Arrays;

public class TestDelElmArray {

	public static void main(String[] args) {
		
		SortingArray array1 = new SortingArray ();
		
		
		//���� ���������� �������
		array1.argArray();
		
		//�������� �������
		array1.createArray();
		
		//����� �������
		String cmdArray = Arrays.toString(array1.yourArray);
		System.out.println(cmdArray);
		System.out.println(" ");
		
		//�������� ������ ��� ������������ ��������
		array1.delElemArray();
		cmdArray = Arrays.toString(array1.changeYouArray);
		System.out.println(cmdArray);
	}
}
