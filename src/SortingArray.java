import java.util.ArrayList;
import java.util.Scanner;

public class SortingArray extends Array {
	
	Integer [] changeYouArray;
	
	
	//�������� ����������� ����������
	public void bubbleSort() {
		int i = 0;
		//���������� ��� ���������� ���������� ��������
		int countSizeArray = sizeArray;
		
		//�������� �� ����������� ���-�� ����������� ���������
		//���� ������� ���� ������� ��������� ����������
		while (i != (countSizeArray - 1)) {
			//�������� �� ��������� ������� � �������
			for (i = 0; i<countSizeArray; i++) {
				//���������� �������� �������� � ����������� � ������ ��� ������� ��������
				if (i != (countSizeArray - 1)) {
					if (yourArray[i] > yourArray[i+1]) {
						yourArray[i+1] = yourArray[i] + yourArray[i+1];
						yourArray[i] = yourArray[i+1] - yourArray[i];
						yourArray[i+1] = yourArray[i+1] - yourArray[i];	
					}
				}
			}
			//���������� ���������� �������� ������� �� ����������� ����������
			--countSizeArray;
			i = 0;	
		}
	}
	
	//���������� ������������� �������� �������� �� �������
	public void delElemArray () {
		System.out.println("����� �������� ������� �� ������ ��������� �� �������");
		Scanner scn = new Scanner(System.in);
		int delElm = scn.nextInt();
		ArrayList <Integer> newArray = new ArrayList <Integer> ();
		for (int i = 0; i <sizeArray; i++) {
			if (yourArray[i] != delElm) {
				newArray.add(yourArray[i]);
			}
		}
		changeYouArray = newArray.toArray(new Integer [newArray.size()]);
	}
}
