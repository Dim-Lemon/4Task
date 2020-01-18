import java.util.ArrayList;
import java.util.Scanner;

public class Array {
	
	int sizeArray;
	int ceilArray;
	int[] yourArray; //созданный массив
	int maxArray;
	int minArray;
	double avgArray;
	Integer [] prumeNumberArray; //массив простых чисел
	
	//проверка на соответсвие размера массива и диапазона его значений
	public void argArray() {
		Scanner scn = new Scanner(System.in);
		System.out.println("Введите размер массива больше 0 и меньше 40");
		sizeArray = scn.nextInt();
			while (sizeArray >= 40 | sizeArray <=0) {
				System.out.println("Размер не соответсвует допустимым значениям");
				if (sizeArray >= 40) { System.out.println("Размер больше или равен 40"); }
				if (sizeArray <=0) { System.out.println("Размер меньше или равен 0"); }
				System.out.println("Введите размер массива больше 0 и меньше 40");
				sizeArray = scn.nextInt();	
			}
		System.out.println("Введите верхнюю границу диапазона массива больше 0 и меньше 1001");
		ceilArray = scn.nextInt();
		while (ceilArray >= 1001 | ceilArray <=0) {
			System.out.println("Вверхняя граница диапазона массива не соответсвует допустимым значениям");
			if (ceilArray >= 1001) { System.out.println("Граница больше или равна 1001"); }
			if (ceilArray <= 0) { System.out.println("Граница меньше или равна 0"); }
			System.out.println("Введите верхнюю границу диапазона массива больше 0 и меньше 1001");
			ceilArray = scn.nextInt();	
		}
	}
	
	//создание массива
	public void createArray() {
	    	int[] randomArray = new int[sizeArray];
	    	for(int i=0; i<sizeArray; i++){
	    		randomArray[i] = (int) (Math.random() * ceilArray);
	    	}
	        yourArray = randomArray;  
	 }

	 //вывод массива
	 public void printArray() {
		 for(int i=0; i<sizeArray; i++){
				System.out.println(yourArray[i]);
				}
	 }
	
	 //нахождение среднего 
	 public void avgArray() {
		 int sumArray = 0;
		 for(int i=0; i<sizeArray; i++){
				sumArray = sumArray + yourArray[i];	
			}
		 avgArray = (double) sumArray / sizeArray;
	 }
	 
	 //нахождение максимального
	 public void maxArray() {
		 for(int i=0; i<sizeArray; i++){
			 if (maxArray < yourArray[i]) {
				 maxArray = yourArray[i];
			 }		
		 }
	 }
	 
	 //нахождение минимального
	 public void minArray() {
		 minArray = yourArray[0];
		 for(int i=0; i<sizeArray; i++){
			 if (minArray > yourArray[i]) {
				 minArray = yourArray[i];
			 }		
		 }
	 }

	 //поиск простых чисел перебором делителя в диапазоне 2-100
	 public void findPrumeNumber() {
		 ArrayList <Integer> prumeNumbers = new ArrayList <Integer> ();
		 for(int i=0; i<sizeArray; i++) {
			 //первая проверка
			 if (yourArray[i] != 1) {
				 //вторая проверка
				 if (yourArray[i] != 2) {
					 //третья проверка
					 if ((yourArray[i] % 2) != 0 && yourArray[i] <= 100) {
						 //поиск делителя
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
						 //четвертая проверка
						 if (checkPN == true) {
							 prumeNumbers.add(yourArray[i]);
						 }
					 }
				 } 
				 //вторая проверка
				 else { prumeNumbers.add(yourArray[i]); }
			 }
		 }
		 prumeNumberArray = prumeNumbers.toArray(new Integer [prumeNumbers.size()]);
	 }
}

