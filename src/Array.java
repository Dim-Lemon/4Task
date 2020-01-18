import java.util.ArrayList;
import java.util.Scanner;

public class Array {
	
	int sizeArray;
	int ceilArray;
	int[] yourArray; //��������� ������
	int maxArray;
	int minArray;
	double avgArray;
	Integer [] prumeNumberArray; //������ ������� �����
	
	//�������� �� ����������� ������� ������� � ��������� ��� ��������
	public void argArray() {
		Scanner scn = new Scanner(System.in);
		System.out.println("������� ������ ������� ������ 0 � ������ 40");
		sizeArray = scn.nextInt();
			while (sizeArray >= 40 | sizeArray <=0) {
				System.out.println("������ �� ������������ ���������� ���������");
				if (sizeArray >= 40) { System.out.println("������ ������ ��� ����� 40"); }
				if (sizeArray <=0) { System.out.println("������ ������ ��� ����� 0"); }
				System.out.println("������� ������ ������� ������ 0 � ������ 40");
				sizeArray = scn.nextInt();	
			}
		System.out.println("������� ������� ������� ��������� ������� ������ 0 � ������ 1001");
		ceilArray = scn.nextInt();
		while (ceilArray >= 1001 | ceilArray <=0) {
			System.out.println("�������� ������� ��������� ������� �� ������������ ���������� ���������");
			if (ceilArray >= 1001) { System.out.println("������� ������ ��� ����� 1001"); }
			if (ceilArray <= 0) { System.out.println("������� ������ ��� ����� 0"); }
			System.out.println("������� ������� ������� ��������� ������� ������ 0 � ������ 1001");
			ceilArray = scn.nextInt();	
		}
	}
	
	//�������� �������
	public void createArray() {
	    	int[] randomArray = new int[sizeArray];
	    	for(int i=0; i<sizeArray; i++){
	    		randomArray[i] = (int) (Math.random() * ceilArray);
	    	}
	        yourArray = randomArray;  
	 }

	 //����� �������
	 public void printArray() {
		 for(int i=0; i<sizeArray; i++){
				System.out.println(yourArray[i]);
				}
	 }
	
	 //���������� �������� 
	 public void avgArray() {
		 int sumArray = 0;
		 for(int i=0; i<sizeArray; i++){
				sumArray = sumArray + yourArray[i];	
			}
		 avgArray = (double) sumArray / sizeArray;
	 }
	 
	 //���������� �������������
	 public void maxArray() {
		 for(int i=0; i<sizeArray; i++){
			 if (maxArray < yourArray[i]) {
				 maxArray = yourArray[i];
			 }		
		 }
	 }
	 
	 //���������� ������������
	 public void minArray() {
		 minArray = yourArray[0];
		 for(int i=0; i<sizeArray; i++){
			 if (minArray > yourArray[i]) {
				 minArray = yourArray[i];
			 }		
		 }
	 }

	 //����� ������� ����� ��������� �������� � ��������� 2-100
	 public void findPrumeNumber() {
		 ArrayList <Integer> prumeNumbers = new ArrayList <Integer> ();
		 for(int i=0; i<sizeArray; i++) {
			 //������ ��������
			 if (yourArray[i] != 1) {
				 //������ ��������
				 if (yourArray[i] != 2) {
					 //������ ��������
					 if ((yourArray[i] % 2) != 0 && yourArray[i] <= 100) {
						 //����� ��������
						 int b = 1;
						 int a = yourArray[i]-b;
						 int prumeNum;
						 boolean checkPN = true;
						 do {
							 a = yourArray[i]-b;
							 prumeNum = (yourArray[i] % a);
							 if (prumeNum == 0) {checkPN = false;}
							 ++b;
						 } while (a != 2);
						 //��������� ��������
						 if (checkPN == true) {
							 prumeNumbers.add(yourArray[i]);
						 }
					 }
				 } 
				 //������ ��������
				 else { prumeNumbers.add(yourArray[i]); }
			 }
		 }
		 prumeNumberArray = prumeNumbers.toArray(new Integer [prumeNumbers.size()]);
	 }
}

