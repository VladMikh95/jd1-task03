package by.htp.array.main;

import java.util.Random;

public class One {
	
	public static void main(String[] args) {
		run1();
		run2();
		run3();
		run4();
		run5();
		run6();
		run7();
		run8();
		run9();
		run10();
		run11();
		run12();
		run13();
		run14();
		run15();
		run16();
		run17();
		run18();
		run19();
		run20();
		
	}
	
	/*
	 * Метод выводит на экран указанный массив в виде строки
	 */
	private static void printRow(int[] x) {
		for(int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}
		System.out.println("");
	}
	
	/*
	 * Метод выводит на экран указанный массив в виде столбца
	 */
	private static void printColumn(int[] x) {
		for(int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
	}
	
	/*
	 * Метод выводит на экран указанный двумерный массив
	 */
	private static void printArrArr(int[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] +" ");
			}
			System.out.println("");
		}
	}
	
	/*
	 * Задача 1. Cоздать матрицу 3 x 4, заполнить ее числами 0 и 1 так,
	 * чтобы в одной строке была ровно одна единица, и вывести на экран
	 */
	public static void run1() {
		int[][] arr = createRandomOne();
		System.out.println("Задача 1");
		System.out.println("Массив 3Х4 с одной единицей в каждой строке:");
		printArrArr(arr);
		System.out.println("");
	}
	
	/*
	 * Метод возвращает массив с одной единицей в каждой строке
	 */
	private static int[][] createRandomOne() {
		Random r = new Random();
		int[][] arr = new int[3][4];
		for(int i = 0; i < 3; i++) {
			arr[i][r.nextInt(4)]  = 1;
		}
		return arr;
	}
	
	/*
	 * Задача 2.  Создать и вывести на экран матрицу 2 x 3, заполненную 
	 * случайными числами из [0, 9
	 */
	public static void run2() {
		int[][] arr = createRandomArr();
		
		System.out.println("Задача 2");
		System.out.println("Массив 2Х3 со случайными цифрами:");
		printArrArr(arr);
		System.out.println("");
	}
	
	/*
	 * Метод возвращает массив 2Х3 заполненный случайными цифрами
	 */
	private static int[][] createRandomArr() {
		Random r = new Random();
		int[][] arr = new int[2][3];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = r.nextInt(10);
			}
		}
		return arr;
	}
	
	/*
	 * Задача 3.  Дана матрица. Вывести на экран первый и последний столбцы
	 */
	public static void run3() {
		int[][] a;
		int[] arr;
		
		a = new int[][] {{1, 3, 4, 3}, {3, 5, 7, 7}, {2, 3, 5, 6}};
		
		System.out.println("Задача 3");
		System.out.println("Дана матрица:");
		
		for (int i = 0; i < a.length; i++) {
			if (a[0].length != a[i].length) {
				System.out.println("Должна быть матрица");
				System.out.println("");
				return;
			}
		}
		
		printArrArr(a);
		System.out.println("");
		System.out.println("Первый столбец матрицы:");
		arr = createColumn(a, 0);
		printColumn(arr);
		System.out.println("Последний столбец матрицы:");
		arr = createColumn(a, a[0].length -1);
		printColumn(arr);
		System.out.println("");
	}
	
	/*
	 * Метод возвращает указанный столбец указанного двумерного массива
	 */
	private static int[] createColumn(int[][] x, int i) {
		int[] arr = new int[x.length];
		
		for(int j = 0; j < x.length; j++) {
			arr[j] = x[j][i];
		}
		return arr;
	}
	
	/*
	 * Задача 4.  Дана матрица. Вывести на экран первую и последнюю строки
	 */
	public static void run4() {
		int[][] a;
		int[] arr;
		
		a = new int[][] {{1, 3, 4, 3}, {3, 5, 7, 7}, {2, 3, 5, 6}};
		
		System.out.println("Задача 4");
		System.out.println("Дана матрица:");
		
		for (int i = 0; i < a.length; i++) {
			if (a[0].length != a[i].length) {
				System.out.println("Должна быть матрица");
				System.out.println("");
				return;
			}
		}
		
		printArrArr(a);
		System.out.println("");
		System.out.println("Первая строка матрицы:");
		arr = createRow(a, 0);
		printRow(arr);
		System.out.println("Последняя строка матрицы:");
		arr = createRow(a, a.length -1);
		printRow(arr);
		System.out.println("");
	}
	
	/*
	 * Метод возвращает указанную строку указанного двумерного массива
	 */
	private static int[] createRow(int[][] x, int i) {
		int[] arr = new int[x[0].length];
		for(int j = 0; j < x[0].length; j++) {
			arr[j] = x[i][j];
		}
		return arr; 
	}
	
	/*
	 * Дана матрица. Вывести на экран все четные строки, то есть с четными номерами
	 */
	public static void run5() {
		int[][] a;
		
		int[] arr;
		
		a = new int[][] {{1, 3, 4, 3}, {3, 5, 7, 7}, {2, 3, 5, 6}, {1, 2, 3 ,4}};
		
		System.out.println("Задача 5");
		System.out.println("Дана матрица:");
		
		for (int i = 0; i < a.length; i++) {
			if (a[0].length != a[i].length) {
				System.out.println("Должна быть матрица");
				System.out.println("");
				return;
			}
		}
		
		printArrArr(a);
		System.out.println("Четные строки матрицы:");
		for (int i = 1; i < a.length; i = i + 2) {
			// Метод createRow(int[][] x, int i) написан в задаче 4 (стр. 172);
			arr = createRow(a, i);
			printRow(arr);
			
		}
		System.out.println("");
	}
	
	/*
	 * Задача 6.  Дана матрица. Вывести на экран все нечетные столбцы, 
	 * у которых первый элемент больше последнего
	 */
	public static void run6() {
		int[][] a;
		
		int[] arr;
		
		a = new int[][] {{1, 3, 4, 3, 3}, {3, 5, 7, 7, 9}, {2, 3, 5, 6, 3}, {1, 2, 3 ,4, 1}};
		
		System.out.println("Задача 5");
		System.out.println("Дана матрица:");
		
		for (int i = 0; i < a.length; i++) {
			if (a[0].length != a[i].length) {
				System.out.println("Должна быть матрица");
				System.out.println("");
				return;
			}
		}
		
		printArrArr(a);
		System.out.println("Нечетные столбцы матрицы, у которых первый "
				+ "элемент больше последнего:");
		for (int i = 0; i < a[0].length; i = i + 2) {
			// Метод createColumn(int[][] x, int i) написан в задаче 3 (стр. 139);
			arr = createColumn(a, i);
			if(arr[0] > arr[arr.length - 1]) {
				System.out.println((i + 1) + "-й столбец");
				printColumn(arr);
			}			
		}
		System.out.println("");
	}
	
	/*
	 * Задача 7.  Дан двухмерный массив 5Х5. Найти сумму модулей отрицательных 
	 * нечетных элементов
	 */
	public static void run7() {
		int[][] a;	
		
		a = new int[][] {{1, 2, -4, 2, 1},
							{2, 4, 5, -1, 3},
							{1, -4, -3, 2, 1},
							{3, 4, 5, 7, 8},
							{1, 2, 4, -1, -1}};
							
		System.out.println("Задача 7");
		System.out.println("Дан двухмерный массив:");
		
		for (int i = 0; i < a.length; i++) {
			if (a[0].length != a[i].length) {
				System.out.println("Должна быть матрица");
				System.out.println("");
				return;
			}
		}
		
		if ((a.length != 5) || (a[0].length != 5)) {
			System.out.println("Должна быть матрица размером 5Х5");
			System.out.println("");
			return;
		}
		printArrArr(a);
		System.out.println("Сумма модулей отрицательных нечетных элементов");
		System.out.println(sumMatrAbs(a));
		System.out.println("");
	}
	
	/*
	 * Метод возвращает сумму модулей отрицательных нечетных элементов в указанном массиве
	 */
	private static int sumMatrAbs(int[][] x) {
		int sum = 0;
		
		for (int i  = 0; i < x.length; i++) {
			for (int j = 0; j < x[0].length; j++) {
				if ((x[i][j] < 0) && (x[i][j] % 2 != 0)) {
					sum = sum + Math.abs(x[i][j]);
				}
			}
		}
		return sum;
	}
 	
	/*
	 * Задача 8.  Дан  двухмерный  массив  nXm  элементов.  Определить, 
	 * сколько  раз  встречается  число  7  среди  элементов массива
	 */
	public static void run8() {
		int[][] a;
		
		a = new int[][] {{1, 2, -4, 2, 1},
							{2, 4, 5, -1, 3},
							{1, -4, -3, 2, 1},
							{3, 4, 5, 7, 8},
							{1, 2, 4, -1, -1}};
							
		System.out.println("Задача 8");
		System.out.println("Дан двухмерный массив:");
		
		for (int i = 0; i < a.length; i++) {
			if (a[0].length != a[i].length) {
				System.out.println("Должна быть матрица");
				System.out.println("");
				return;
			}
		}
		
		printArrArr(a);
		System.out.println("Количество 7 среди элементов массива");
		System.out.println(calcCountSeven(a));
		System.out.println("");
	}
	
	/*
	 * Метод возвращает количество 7 в указанном массиве
	 */
	private static int calcCountSeven(int[][] x) {
		int count = 0;
		
		for (int i  = 0; i < x.length; i++) {
			for (int j = 0; j < x[0].length; j++) {
				if (x[i][j] ==7) {
					count++;
				}
			}
		}
		return count;
	}
	/*
	 * Задача 9. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали
	 */
	public static void run9() {
		int[][] a;
		
		a = new int[][] {{1, 2, -4, 2, 1},
							{2, 4, 5, -1, 3},
							{1, -4, -3, 2, 1},
							{3, 4, 5, 7, 8},
							{1, 2, 4, -1, -1}};
							
		System.out.println("Задача 9");
		System.out.println("Дан двухмерный массив:");
		
		for (int i = 0; i < a.length; i++) {
			if (a.length != a[i].length) {
				System.out.println("Должна быть квадратная матрица");
				System.out.println("");
				return;
			}
		}
		
		printArrArr(a);
		System.out.println("Числа стоящие по диагонали массива");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i][i] + " ");
		}
		System.out.println("");
		System.out.println("");
	}
	
	/*
	 * Задача 10. Дана матрица. Вывести k-ю строку и p-й столбец матрицы
	 */
	public static void run10() {
		int[][] a;
		
		int k;
		int p;
		
		a = new int[][] {{1, 2, -4, 2, 1},
							{2, 4, 5, -1, 3},
							{1, -4, -3, 2, 1},
							{3, 4, 5, 7, 8},
							{1, 2, 4, -1, -1}};
		k = 3;
		p = 1;
							
		System.out.println("Задача 9");
		System.out.println("Дан двухмерный массив:");
		
		for (int i = 0; i < a.length; i++) {
			if (a[0].length != a[i].length) {
				System.out.println("Должна быть матрица");
				System.out.println("");
				return;
			}
		}
		
		if ( (k < 1) || (k > a.length)) {
			System.out.println("Такой строки нет ");
			return;
		}
		
		if ( (p < 1) || (p > a[0].length)) {
			System.out.println("Такого столбца нет ");
			return;
		}
		
		printArrArr(a);
		System.out.println(k + "-я строка:");
		for (int i = 0; i < a[0].length; i++) {
			System.out.print(a[k - 1][i] + " ");
		}
		System.out.println("");
		System.out.println(p + "-й столбец:");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i][p - 1] + " ");
		}
		System.out.println("");
	}
	
	/*
	 * Задача 11.  Дана матрица размера m x n. Вывести ее элементы в следующем 
	 * порядке: первая строка справа налево, вторая строка слева направо,
	 * третья строка справа налево и так далее
	 */
	public static void run11() {
		int[][] a;
		
		a = new int[][] {{1, 2, -4, 2, 1},
						 {2, 4, 5, -1, 3},
						 {1, -4, -3, 2, 1},
						 {3, 4, 5, 7, 8},
						 {1, 2, 4, -1, -1}};
							
		System.out.println("Задача 11");
		System.out.println("Дан двухмерный массив:");
		
		for (int i = 0; i < a.length; i++) {
			if (a[0].length != a[i].length) {
				System.out.println("Должна быть матрица");
				System.out.println("");
				return;
			}
		}
		
		printArrArr(a);
		System.out.println("Результат:");
		for (int i = 0; i < a.length; i++) {
			if (i % 2 == 0) {
				for (int j = a[0].length - 1; j >= 0; j--) {
					System.out.print(a[i][j] + " ");
				}
			} else {
				for (int j = 0; j < a[0].length; j++) {
					System.out.print(a[i][j] + " ");
				}
			}
			System.out.println("");
		}
		System.out.println("");
	}
	
	/*
	 * Задача 12. Получить квадратную матрицу порядка n
	 */
	public static void run12() {
		int n;
		
		int[][] a;
		
		n = 5;
		
		a = createArr1(n);
		
		System.out.println("Задача 12");
		System.out.println("Квадратная матрица порядка " + n);
		printArrArr(a);
		System.out.println("");
	}
	
	private static int[][] createArr1(int n) {
		int[][] a = new int[n][n];
		
		for (int i = 0; i < n; i++) {
			a[i][i] = i;
		}
		return a;
 	}
	
	/*
	 * Задача 13. Сформировать квадратную матрицу порядка n по заданному 
	 * образцу(n - четное)
	 */
	public static void run13() {
		int n;
		
		int[][] a;
		
		n = 6;
		
		a = createArr2(n);
		
		System.out.println("Задача 13");
		System.out.println("Квадратная матрица порядка " + n);
		printArrArr(a);
		System.out.println("");
	}
	
	private static int[][] createArr2(int n) {
		int[][] a;
		
		if ((n % 2 != 0)) {
			System.out.println("Число n должно быть положительным и четным");
			return a = new int[][] {{0}};
		} else {
			a = new int[n][n];
			
			for (int i = 0; i < n; i++) {
				if (i % 2 == 0) {
					for (int j = 0; j < n; j++) {
						a[i][j] = j + 1;
					}
				} else {
					for (int j = 0; j < n; j++) {
						a[i][j] = n - j;
					}
				}
			}
			return a;
		}
 	}
	
	/*
	 * Задача 14.  Сформировать квадратную матрицу порядка n по заданному 
	 * образцу(n - четное)
	 */
	public static void run14() {
		int n;
		
		int[][] a;
		
		n = 6;
		
		a = createArr3(n);
		
		System.out.println("Задача 14");
		System.out.println("Квадратная матрица порядка " + n);
		printArrArr(a);
		System.out.println("");
	}
	
	private static int[][] createArr3(int n) {
		int[][] a;
		
		if ((n % 2 != 0)) {
			System.out.println("Число n должно быть положительным и четным");
			return a = new int[][] {{0}};
		} else {
			a = new int[n][n];
			
			for (int i = 0; i < n; i++) {
				a[i][n - 1 - i] = i + 1;
			}
			return a;
		}
	}
	
	/*
	 * Задача 15.  Сформировать квадратную матрицу порядка n по 
	 * заданному образцу(n - четное)
	 */
	public static void run15() {
		int n;
		
		int[][] a;
		
		n = 6;
		
		a = createArr4(n);
		
		System.out.println("Задача 15");
		System.out.println("Квадратная матрица порядка " + n);
		printArrArr(a);
		System.out.println("");
	}
	
	private static int[][] createArr4(int n) {
		int[][] a;
		
		if ((n % 2 != 0)) {
			System.out.println("Число n должно быть положительным и четным");
			return a = new int[][] {{0}};
		} else {
			a = new int[n][n];
			
			for (int i = 0; i < n; i++) {
				a[i][i] = n - i;
			}
			return a;
		}
	}
	
	/*
	 * Задача 16. Сформировать квадратную матрицу порядка n по 
	 * заданному образцу(n - четное):
	 */
	public static void run16() {
		int n;
		
		int[][] a;
		
		n = 6;
		
		a = createArr5(n);
		
		System.out.println("Задача 16");
		System.out.println("Квадратная матрица порядка " + n);
		printArrArr(a);
		System.out.println("");
	}
	
	private static int[][] createArr5(int n) {
		int[][] a;
		
		if ((n % 2 != 0)) {
			System.out.println("Число n должно быть положительным и четным");
			return a = new int[][] {{0}};
		} else {
			a = new int[n][n];
			
			for (int i = 0; i < n; i++) {
				a[i][i] = (i + 1) * (i + 2);
			}
			return a;
		}
	}
	
	/*
	 * Задача 17. Сформировать квадратную матрицу порядка n 
	 * по заданному образцу(n - четное):
	 */
	public static void run17() {
		int n;
		
		int[][] a;
		
		n = 6;
		
		a = createArr6(n);
		
		System.out.println("Задача 17");
		System.out.println("Квадратная матрица порядка " + n);
		printArrArr(a);
		System.out.println("");
	}
	
	private static int[][] createArr6(int n) {
		int[][] a;
		
		if ((n % 2 != 0)) {
			System.out.println("Число n должно быть положительным и четным");
			return a = new int[][] {{0}};
		} else {
			a = new int[n][n];
			
			
			for (int i = 0; i < n; i++) {
				a[0][i] = 1;
				a[n - 1][i] = 1;
				a[i][0] = 1;
				a[i][n - 1] = 1;
			}
			return a;
		}
	}
	
	/*
	 * Задача 18. Сформировать квадратную матрицу порядка n 
	 * по заданному образцу(n - четное):
	 */
	public static void run18() {
		int n;
		
		int[][] a;
		
		n = 6;
		
		a = createArr7(n);
		
		System.out.println("Задача 18");
		System.out.println("Квадратная матрица порядка " + n);
		printArrArr(a);
		System.out.println("");
	}
	
	private static int[][] createArr7(int n) {
		int[][] a;
		
		if ((n % 2 != 0)) {
			System.out.println("Число n должно быть положительным и четным");
			return a = new int[][] {{0}};
		} else {
			a = new int[n][n];
			
			for (int i = 0; i < n; i++) {
				for(int j = 0; j < n - i; j++) {
					a[i][j] = i + 1;
				}
			}
			return a;
		}
	}
	
	/*
	 * Задача 19. Сформировать квадратную матрицу порядка n 
	 * по заданному образцу(n - четное):
	 */
	public static void run19() {
		int n;
		
		int[][] a;
		
		n = 6;
		
		a = createArr8(n);
		
		System.out.println("Задача 19");
		System.out.println("Квадратная матрица порядка " + n);
		if (a == null) {
			System.out.println("Число n должно быть положительным и четным");
		} else {
			printArrArr(a);
		}
		System.out.println("");
	}
	
	private static int[][] createArr8(int n) {
		int[][] a;
		
		if ((n % 2 != 0) || (n < 2)) {
			return a = null;
		} else {
			a = new int[n][n];
			
			for (int i = 0; i < n / 2; i++) {
				for(int j = 0 + i; j < n - i; j++) {
					a[i][j] = 1;
				}
			}
			
			for (int i = n / 2; i < n; i++) {
				for(int j = n - 1 - i; j < i + 1; j++) {
					a[i][j] = 1;
				}
			}
			return a;
		}
	}
	
	/*
	 * Задача 20. Сформировать квадратную матрицу порядка n 
	 * по заданному образцу(n - четное):
	 */
	public static void run20() {
		int n;
		
		int[][] a;
		
		n = 6;
		
		a = createArr9(n);
		
		System.out.println("Задача 20");
		System.out.println("Квадратная матрица порядка " + n);
		if (a == null) {
			System.out.println("Число n должно быть положительным и четным");
		} else {
			printArrArr(a);
		}
		System.out.println("");
	}
	
	private static int[][] createArr9(int n) {
		int[][] a;
		
		if ((n % 2 != 0) || (n < 2)) {
			return a = null;
		} else {
			a = new int[n][n];
			
			for (int i = 0; i < n / 2; i++) {
				for(int j = 0 + i; j < n - i; j++) {
					a[j][i] = 1;
				}
			}
			
			for (int i = n / 2; i < n; i++) {
				for(int j = n - 1 - i; j < i + 1; j++) {
					a[j][i] = 1;
				}
			}
			return a;
		}
	}
}
