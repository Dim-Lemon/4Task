//�������� ����� �� � readme

import java.util.Arrays;
import java.util.Scanner;

public class AllTask {
	
	
	//������ 1.1
	public void firstTask() {
		Array array1 = new Array();

		//���� ������� ������� � ��� ��������� 
		array1.argArray();
		//�������� �������
		array1.createArray();
		//������ �������� �������� �������
		array1.avgArray();
		//���������� ������������� �������� �������
		array1.maxArray();
		//���������� ������������ �������� �������
		array1.minArray();
		
		double avgArray = array1.avgArray;
		int maxArray = array1.maxArray;
		int minArray = array1.minArray;
		
		//������ ���. ����. ��. �������� �������
		System.out.println("������������ �������� � ������� " + maxArray);
		System.out.println("����������� �������� � ������� " + minArray);
		System.out.println("������� �������� � ������� " + avgArray);
	}
		
	//������ 1.2 (�������� ����� �������)
	public void secondTask() {
		SortingArray array1 = new SortingArray();
		
		//���� ������� ������� � ��� ��������� 
		array1.argArray();
		//�������� �������
		array1.createArray();
		//����� �� �������������� �������
		String cmdArray = Arrays.toString(array1.yourArray);
		System.out.println(cmdArray);
		System.out.println(" ");
		
		System.out.println(" ");
		
		//����������� ����������
		array1.bubbleSort();
		//����� �������������� �������
		cmdArray = Arrays.toString(array1.yourArray);
		System.out.println(cmdArray);
		System.out.println(" ");
	}
			
	//������ 1.3
	public void thirdTask() {

		SortingArray array1 = new SortingArray();
		//���� ��������� �������� �������
		array1.argArray();
		
		//�������� ���������� �������
		array1.createArray();
		
		//�������������� ���������� ������� � ������ � ��� �����
		String cmdArray = Arrays.toString(array1.yourArray);
		System.out.println(cmdArray);
		System.out.println(" ");
		
		//����������� ���������� ���������� �������
		array1.bubbleSort();
		
		//�������������� �������������� ���������� ������� � ������ � ��� �����
		cmdArray = Arrays.toString(array1.yourArray);
		System.out.println(cmdArray);
		System.out.println(" ");
		
		//�������� ������� ������� ����� �� ����� ���������� �������
		array1.findPrumeNumber();
		
		//�������������� ������� ������� ����� � ������ � ��� �����
		cmdArray = Arrays.toString(array1.prumeNumberArray);
		System.out.println(cmdArray);
		System.out.println(" ");
	}
					
	//������ 1.4
	public void fourthTask() {
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
