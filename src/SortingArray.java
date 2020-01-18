import java.util.ArrayList;
import java.util.Scanner;

public class SortingArray extends Array {
	
	Integer [] changeYouArray;
	
	
	//алгоритм пузырьковой сортировки
	public void bubbleSort() {
		int i = 0;
		//переменная для исключения последнего элемента
		int countSizeArray = sizeArray;
		
		//проверка на оставшиееся кол-во сортируемых элементов
		//если остался один элемент закончить сортировку
		while (i != (countSizeArray - 1)) {
			//проверка на последний элемент в массиве
			for (i = 0; i<countSizeArray; i++) {
				//сортировка текущего элемента с последующим в случае его большей велечины
				if (i != (countSizeArray - 1)) {
					if (yourArray[i] > yourArray[i+1]) {
						yourArray[i+1] = yourArray[i] + yourArray[i+1];
						yourArray[i] = yourArray[i+1] - yourArray[i];
						yourArray[i+1] = yourArray[i+1] - yourArray[i];	
					}
				}
			}
			//исключение последнего элемента массива от последующей сортировки
			--countSizeArray;
			i = 0;	
		}
	}
	
	//исключение определенного значения элемента из массива
	public void delElemArray () {
		System.out.println("Введи значение которые вы хотите исключить из массива");
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
