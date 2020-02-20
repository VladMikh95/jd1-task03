package by.htp.array.main;

import java.util.Random;

public class Task18 {
	
	/*
	 * Задача 18. «Суперзамок». Секретный замок для сейфа состоит из 10 расположенных в 
	 * рад ячеек, в которые надо вставить игральные кубики. Но дверь открывается только 
	 * в том случае, когда в любых трех соседних ячейках сумма точек на передних гранях 
	 * кубиков равна 10. (Игральный кубик имеет на каждой грани от 1 до 6 точек). 
	 * Напишите программу, которая разгадывает код замка при условии, что два кубика 
	 * уже вставлены в ячейки
	 */
	public static void main(String[] args) {
		int[] arr;
		
		arr = createFirstArr();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
		createAnswerArr(arr);
		
	}
	
	/*
	 * Метод возвращает массив начальных значений замка
	 */
	private static int[] createFirstArr() {
		Random  r = new Random();
		int[] a = new int[10];
		int item;
		int i;
		int ii = 0;
		
		for (int j = 0; j < 2; j++) {
			i = r.nextInt(10);
			if (i ==  ii) {
				j--;
			} else {
				item = r.nextInt(6) + 1;
				a[i] = item;
				ii = i;
			}
		}
		return a;
	}
	
	/*
	 * Метод принимает массив начальных занчений ключа, создает массив размерностью 3, 
	 * в который записывает наальные значения != 0 согласно их расположению 
	 */
	private static void createAnswerArr(int[] x) {
		int[] a = new int[3];
		int k = 0;
		
		for (int i = 0; i < x.length; i++) {
			if (x[i] != 0) {
				k = i % 3;
				if ((a[k] != 0) && (a[k] != x[i])) {
					System.out.println("Комбинация неверна, замок открыть невозможно");
					return;
				} else {
					a[k] = x[i];
				}
			}
		}
		varArr(a);
	}
	
	/*
	 * Метод создает комбинации чисел в указанном массиве, и если они подходят 
	 * по условию задачи передают в метод print(int[] x)
	 */
	private static void varArr(int[] x) {
		if ((findSum(x) >= 10) || (findSum(x) < 4)) {
			System.out.println("Комбинация неверна, замок открыть невозможно");
			return; 
		}
		int[] a = x.clone();
 				
		for (int i = 1; i < 7; i++) {
			a[0] = i;
			
			for (int j = 1; j < 7; j++) {
				a[1] = j; 
				
				for (int k = 1; k < 7; k++) {
					a[2] = k;
					
					if ((findSum(a) == 10) && (checkArr(a, x))) {
						print(a);
					}
										
				}
				a[2] = 1;
			}
			a[1] = 1;
			
		}
	}
	
	/*
	 * Метод возвращает сумму элементов в указанном массиве
	 */
	private static int findSum(int[] x) {
		int sum = 0;
		
		for (int i = 0; i < x.length; i++) {
			sum = sum + x[i];
		}
		
		return sum;
	}
	
	/*
	 * Метод возвращает болево значения совпадают ли значения массива х в массиве а
	 */
	private static boolean checkArr(int[] a, int[] x) {
		for (int i = 0; i < x.length; i++) {
			if ((x[i] != 0) && (x[i] != a[i])) {
				return false;
			}
		}
		return true;
	}
	
	/*
	 * Метод выводит на экран 10 значений кубиков в замке
	 */
	private static void print(int[] x) {
		System.out.println("Замок откроется, если кубики "
				+ "будут поставлены следующим образом:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < x.length; j++) {
				System.out.print(x[j] + " ");
			}
		}
		System.out.print(x[0]);
		System.out.println("");
	}

}
