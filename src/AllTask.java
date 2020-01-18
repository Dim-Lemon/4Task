//описание задач см в readme

import java.util.Arrays;
import java.util.Scanner;

public class AllTask {
	
	
	//задача 1.1
	public void firstTask() {
		Array array1 = new Array();

		//ввод размера массива и его диапазона 
		array1.argArray();
		//создание массива
		array1.createArray();
		//расчет среднего значения массива
		array1.avgArray();
		//нахождение максимального значения массива
		array1.maxArray();
		//нахождение минимального значения массива
		array1.minArray();
		
		double avgArray = array1.avgArray;
		int maxArray = array1.maxArray;
		int minArray = array1.minArray;
		
		//ввывод мин. макс. ср. значений массива
		System.out.println("Максимальное значение в массива " + maxArray);
		System.out.println("Минимальное значение в массива " + minArray);
		System.out.println("Среднее значение в массива " + avgArray);
	}
		
	//задача 1.2 (изменить вывод массива)
	public void secondTask() {
		SortingArray array1 = new SortingArray();
		
		//ввод размера массива и его диапазона 
		array1.argArray();
		//создание массива
		array1.createArray();
		//вывод не сортированного массива
		String cmdArray = Arrays.toString(array1.yourArray);
		System.out.println(cmdArray);
		System.out.println(" ");
		
		System.out.println(" ");
		
		//пузырьковая сортировка
		array1.bubbleSort();
		//вывод сортированного массива
		cmdArray = Arrays.toString(array1.yourArray);
		System.out.println(cmdArray);
		System.out.println(" ");
	}
			
	//задача 1.3
	public void thirdTask() {

		SortingArray array1 = new SortingArray();
		//ввод диапазона значений массива
		array1.argArray();
		
		//создание рандомного массива
		array1.createArray();
		
		//преобразование рандмоного массива в строку и его вывод
		String cmdArray = Arrays.toString(array1.yourArray);
		System.out.println(cmdArray);
		System.out.println(" ");
		
		//пузырьковая сортировка рандомного массива
		array1.bubbleSort();
		
		//преобразование сортированного рандмоного массива в строку и его вывод
		cmdArray = Arrays.toString(array1.yourArray);
		System.out.println(cmdArray);
		System.out.println(" ");
		
		//создание массива простых числе из ранее созданного массива
		array1.findPrumeNumber();
		
		//преобразование массива простых числе в строгу и его вывод
		cmdArray = Arrays.toString(array1.prumeNumberArray);
		System.out.println(cmdArray);
		System.out.println(" ");
	}
					
	//задача 1.4
	public void fourthTask() {
		SortingArray array1 = new SortingArray ();
		
		//ввод аргументов массива
		array1.argArray();
		
		//создание массива
		array1.createArray();
		
		//вывод массива
		String cmdArray = Arrays.toString(array1.yourArray);
		System.out.println(cmdArray);
		System.out.println(" ");
		
		//создание массив без исключенного элемента
		array1.delElemArray();
		cmdArray = Arrays.toString(array1.changeYouArray);
		System.out.println(cmdArray);
	}
}
