

import java.util.Arrays;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		AllTask task = new AllTask ();
	
		//����� ������
		System.out.println("�������� ������");
		Scanner scn = new Scanner(System.in);
		int answer = scn.nextInt();
				
		switch (answer) {
			case 1: System.out.println("������ �1");
					task.firstTask();
					break;
			
			case 2: System.out.println("������ �2");
					task.secondTask();;
					break;
					
			case 3: System.out.println("������ �3");
					task.thirdTask();
					break;
			
			case 4: System.out.println("������ �4");
					task.fourthTask();;
					break;
			}			
	}
}
	
