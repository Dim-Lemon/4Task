/*
Дан массив целых чисел и ещё одно целое число. Удалите все вхождения этого числа из массива (пропусков быть не должно).
*/

import java.util.Arrays;

public class TestDelElmArray {

	public static void main(String[] args) {
		
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
