package by.htp.array.main;

import java.util.Random;
import java.util.Scanner;

public class Two {
	
	public static void main(String[] args) {
		run21();
		run22();
		run23();
		run24();
		run25();
		run26();
		run27();
		run28();
		run29();
		run30();
		run31();
		run32();
		run33();
		run34();
		run35();
		run36();
		run37();
		run38();
		run39();
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
	 * Метод выводит на экран указанный массив в виде строки
	 */
	private static void printRow(int[] x) {
		for(int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}
		System.out.println("");
	}
	
	/*
	 * Задача 21. Сформировать квадратную матрицу порядка n 
	 * по заданному образцу(n - четное):
	 */
	public static void run21() {
		int n;
		
		int[][] a;
		
		n = 6;
		
		System.out.println("Задача 21");
		System.out.println("Квадратная матрица порядка " + n);
		
		if ((n % 2 != 0)) {
			System.out.println("Число n должно быть положительным и четным");
			return;
		}
		
		a = createArr1(n);
		printArrArr(a);
		System.out.println("");
	}
	
	private static int[][] createArr1(int n) {
		int[][] a = new int[n][n];
			
		for (int i = 0; i < n; i++) {
			for(int j = 0; j < i + 1; j++) {
				a[i][j] = n - i + j;
			}
		}
		return a;
	}
	
	/*
	 * Задача 22. Сформировать квадратную матрицу порядка n 
	 * по заданному образцу(n - четное):
	 */
	public static void run22() {
		int n;
		
		int[][] a;
		
		n = 6;
		
		System.out.println("Задача 22");
		System.out.println("Квадратная матрица порядка " + n);
		if ((n < 2) ||(n % 2 != 0)) {
			System.out.println("Число n должно быть положительным и четным");
			return;
		}
		
		a = createArr2(n);
		printArrArr(a);
		System.out.println("");
	}
	
	private static int[][] createArr2(int n) {
		int[][] a = new int[n][n];
			
		for (int i = 0; i < n; i++) {
			for(int j = 0; j < n - i; j++) {
				a[i][j] = 1 + j + i;
			}
		}
		return a;
	}
	
	/*
	 * Задача 23. Сформировать квадратную матрицу порядка N 
	 */
	public static void run23() {
		int n;
		
		double[][] a;
		
		n = 6;
		
		System.out.println("Задача 23");
		System.out.println("Квадратная матрица порядка " + n);
		a = createArrSin(n);
		
		if ((n % 2 != 0)) {
			System.out.println("Число n должно быть положительным и четным");
			return;
		}
		
		a = createArrSin(n);
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] +" ");
			}
			System.out.println("");
		}
		System.out.println("");
	}
	
	private static double[][] createArrSin(int n) {
		double[][] a= new double[n][n];
			
		for (int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				double k = Math.round(Math.sin(((i + 1) * (i + 1) 
						- (j + 1) * (j + 1)) / n) * 100);
				a[i][j] = k / 100;
			}
		}
		return a;
	}
	
	/*
	 * Задача 24. Дан линейный массив  x1, x2,, xn−1, xn . Получить 
	 * действительную квадратную матрицу порядка n 
	 */
	public static void run24() {
		int[] a;
		
		int[][] arr;
		
		a = new int[] {1, 2, 3};
		
		arr = createArrSqw(a);
		
		System.out.println("Задача 24");
		System.out.println("Дана линейный маcсив:");
		printRow(a);
		System.out.println("Получившаяся матрица:");
		printArrArr(arr);
		System.out.println("");
	}
	
	/*
	 * Метод возвращает матрицу значений из указанного линейного массива
	 */
	private static int[][] createArrSqw(int[] x)	{
		int[][] arr = new int[x.length][x.length];
		
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x.length; j++) {
				arr[i][j] = (int) Math.pow(x[j], i + 1);
			}
		}
		return arr;
	}
	
	/*
	 * Задача 25. Получить квадратную матрицу порядка n 
	 */
	public static void run25() {
		int n;
		
		int[][] arr;
		
		n = 4;
		
		System.out.println("Задача 25");
		System.out.println("Дано число n: " + n);
		if ((n % 2 != 0)) {
			System.out.println("Число n должно быть положительным и четным");
			return;
		}
		arr = createArr3(n);
		System.out.println("Получившаяся матрица:");
		printArrArr(arr);
		System.out.println("");
	}
	
	/*
	 * Метод возвращает матрицу значений из указанного линейного массива
	 */
	private static int[][] createArr3(int x)	{
		int[][] arr = new int[x][x];
		
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < x; j++) {
				arr[i][j] = 1 + j + x * i;
			}
		}
		return arr;
	}
	
	/*
	 * Задача 26.  С клавиатуры вводится двумерный массив чисел размерностью nxm. 
	 * Выполнить с массивом следующие действия: 
	 * а) вычислить сумму отрицательных элементов в каждой строке;
	 * б) определить максимальный элемент в каждой строке;  
	 * в) переставить местами максимальный и минимальный элементы матрицы
	 */

	public static void run26() {
		int[][] a = new int[3][4];
		
		System.out.println("Задача 26");
		a  = readMatrixFromConsole();
		System.out.println("Дан массив:");
		printArrArr(a);
		System.out.println("Сумма отрицательных элементов в каждой строке:");
		System.out.println(calcSumNegNum(a));
		System.out.println("Максимальный элемент в каждой строке");
		printRow(findMaxNumOfRow(a));
		System.out.println("массив с заменой местами максимального и " + 
				"минимального элементов");
		printArrArr(replaceMaxMin(a));
		System.out.println("");
	}
	
	/*
	 * Меод возвращает матрицу 3Х4 введенную с консоли
	 */
	private static int[][] readMatrixFromConsole() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int[][] a = new int[3][4];
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("Введите " + (i + 1) + "-ю строку (4 числа)");
			for (int j = 0; j < a[0].length; j++) {
				while(scan.hasNextInt() == false) {
					System.out.println("Необходимо ввести число");
					System.out.print("Введите оставшиеся числа строки");
				}    
				a[i][j] = scan.nextInt();
			}
		}
		return a;	
	}
	
	/*
	 * Метод возвращает сумму отрицательных элементов указанного массива
	 */
	private static int calcSumNegNum(int[][] x) {
		int sum = 0;
	
		for (int i = 0; i < x.length; i++) {
			for(int j = 0; j < x[0].length; j++) {
				if (x[i][j] < 0) {
					sum = sum + x[i][j];
				}
			}
		}
		return sum;
	}
	
	/*
	 * Метод возвращает массив максимальных элементов каждой строки казанной матрицы
	 */
	private static int[] findMaxNumOfRow(int[][] x) {
		int[] a;
		int max;
		
		a = new int[x.length];
		
		for (int i = 0; i < x.length; i++) {
			max = x[i][0];
			for(int j = 1; j < x[0].length; j++) {
				if (x[i][j] > max) {
					max = x[i][j];
				}
			}
			a[i] = max;
		}
		return a; 
	}
	
	/*
	 * Метод возвращает двумерный массив с заменой местами максимального и 
	 * минимального элементов указанного массива
	 */
	private static int[][] replaceMaxMin(int[][] x) {
		int max = x[0][0];
		int min = x[0][0];
		int a;
		int maxi = 0;
		int maxj = 0;
		int mini = 0;
		int minj = 0;
		
		for (int i = 0; i < x.length; i++) {
			for(int j = 1; j < x[0].length; j++) {
				if (x[i][j] > max) {
					max = x[i][j];
					maxi = i;
					maxj = j;
				}
				
				if (x[i][j] < min) {
					min = x[i][j];
					mini = i;
					minj = j;
				}
			}
		}
		a = max;
		x[maxi][maxj] = x[mini][minj];
		x[mini][minj] = a;
		return x;
	}
	
	/*
	 * Задача 27.  В числовой матрице поменять местами два столбца любых
	 * столбца, т. е. все элементы одного столбца поставить на соответствующие 
	 * им  позиции  другого,  а  его  элементы  второго  переместить  в  первый.
	 * Номера  столбцов  вводит пользователь с клавиатуры
	 */
	public static void run27() {
		int[][] a;
		
		int[][] arr;
		
		a = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}, {13, 14, 15}};
		
		System.out.println("Задача 27");
		System.out.println("Дана матрица");
		
		for (int i = 0; i < a.length; i++) {
			if (a[0].length != a[i].length) {
				System.out.println("Должна быть матрица");
				System.out.println("");
				return;
			}
		}
		
		printArrArr(a);
		arr = replaceRow(a, readTwoColumnFromConsole(a[0].length));
		System.out.println("Новый массив:");
		printArrArr(arr);
		System.out.println("");
	}
	
	/*
	 * Метод возвращает массив выбранных стобцов массива указанной размерности 
	 */
	private static int[] readTwoColumnFromConsole(int n) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int[] a = new int[2];
		int b = 0;
	
		System.out.println("Матрица состоит из " + n + " столбцов.");
		for (int i = 0; i < a.length; i++) {
			System.out.println("Введите " + (i + 1) + "-й номер столбца для замены");
			while(scan.hasNextInt() == false) {
				System.out.println("Необходимо ввести число");
			}    
			b = scan.nextInt();
				
			if((b < 1) || (b > n)) {
				System.out.println("Введите правильный номер столбца");
				i--;
			} else {
				a[i] = b - 1;
			}	    
		}
		return a;	
	}
	
	/*
	 * Метод возвращает массив после перемены двух столбцов в указанном массиве
	 */
	private  static int[][] replaceRow(int[][]x, int[] y) {
		int[] a = new int[x[0].length];
		for (int i = 0; i < x[0].length; i++) {
			a[i] = x[i][y[0]];
		}
		
		for (int i = 0; i < x[0].length; i++) {
			x[i][y[0]] = x[i][y[1]];
		}
		for (int i = 0; i < x[0].length; i++) {
			x[i][y[1]] = a[i];
		}
		return x;
	}
	
	/*
	 * Задача 28. Задана матрица неотрицательных чисел. Посчитать сумму
	 * элементов в каждом столбце. Определить, какой столбец содержит 
	 * максимальную сумму
	 */
	public static void run28() {
		int[][] a;
		int[] arr;
		
		a = new int[][] {{1, 3, 4, 3}, {3, 5, 7, 7}, {2, 3, 5, 6}};
		
		System.out.println("Задача 28");
		System.out.println("Дана матрица:");
		
		for (int i = 0; i < a.length; i++) {
			if (a[0].length != a[i].length) {
				System.out.println("Должна быть матрица");
				System.out.println("");
				return;
			}
		}
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				if (a[i][j] < 0) {
					System.out.println("В матрице не может быть отрицательных чисел");
					return;
				}
			}
		}
		
		printArrArr(a);
		System.out.println("");
		System.out.println("Массив суммы элементов в каждом столбце матрицы:");
		arr = createArrSum(a);
		printRow(arr);
		System.out.println("Максимальны элемент в этом массиве:");
		System.out.println(findMaxNum(arr));
		System.out.println("");
	}
	
	/*
	 * Метод возвращает массив суммы элементов в каждом столбце матрицы
	 */
	private static int[] createArrSum(int[][] x) {
		int[] a = new int[x[0].length];
		int sum = 0;
		
		for (int i  = 0; i < x[0].length; i++) {
			sum = 0;
			for (int j = 0; j < x.length; j++) {
				sum = sum + x[j][i];
			}
			a[i] = sum;
		}
		return a;
	}
	
	/*
	 * Метод возвращает максимальный элемент указанного массива
	 */
	private static int findMaxNum(int[] x) {
		int max = x[0];
		
		for (int i = 1; i < x.length; i++) {
			if (x[i] > max) {
				max = x[i];
			}
		}
		return max;
	}
	
	/*
	 * Задача 29. Найти положительные элементы главной диагонали квадратной матрицы
	 */
	public static void run29() {
		int[][] a;
		int[] arr;
		
		a = new int[][] {{1, 3, 4, 3}, {3, 5, 7, 7}, {2, 3, 5, 6}, {-3, 3, 1, -1}};
		
		System.out.println("Задача 29");
		System.out.println("Дана квадратная матрица:");
		
		for (int i = 0; i < a.length; i++) {
			if (a.length != a[i].length) {
				System.out.println("Должна быть матрица");
				System.out.println("");
				return;
			}
		}
		
		printArrArr(a);
		System.out.println("");
		arr = createArrPosDiag(a);
		System.out.println("массив положительных элементов в главной диагонали:");
		printRow(arr);
		System.out.println("");
	}
	
	/*
	 * Метод возвращает массив положительных элементов в главной диагонали
	 */
	private static int[] createArrPosDiag(int[][] x) {
		int[] a; 
		
		for (int i = 0; i < x.length; i++) {
			if (x.length != x[i].length) {
				return null;
			}
		}
		
		a = new int[calcCountPosDiag(x)];
		for (int i = 0; i < x.length; i++) {
			if (x[i][i] > 0) {
				a[i] = x[i][i];
			}
		}
		return a;
	}
	
	/*
	 * Метод возвращает количество положительных элементов в главной диагонали
	 */
	private static int calcCountPosDiag(int[][] x) {
		int count = 0;
		
		for (int i = 0; i < x.length; i++) {
			if (x.length != x[i].length) {
				return - 1;
			}
		}
		
		for (int i = 0; i < x.length; i++) {
			if (x[i][i] > 0) {
				count++;
			}
		}
		return count;
	}
	
	/*
	 * Задача 30. Матрицу 10x20 заполнить случайными числами от 0 до 15. 
	 * Вывести на экран саму матрицу и номера строк, в которых число 5 
	 * встречается три и более раз
	 */
	public static void run30() {
		int[][] a;
		System.out.println("Задача 30");
		System.out.println("Дана матрица:");
		a = createMatrix1020();
		printArrArr(a);
		System.out.println("массив номеров строк, в которых число 5 " 
				+ " встречается три и более раз:");
		printRow(findFiveInRow(a));
		System.out.println("");
	}
	
	/*
	 * Метод возвращает массив номеров строк, в которых число 5 
	 * встречается три и более раз
	 */
	private static int[] findFiveInRow(int[][] x) {
		int count = 0;
		int[] arr;
		int k = 0;
		
		if (x == null) {
			return null;
		}
		
		for (int i = 0; i < x.length; i++) {
			if (x[0].length != x[i].length) {
				return null;
			}
		}
		
		arr = new int[calcCountFiveInRow(x)];
		
		if (calcCountFiveInRow(x) == -1) {
			System.out.println("Массив значений не передан в метод"
					+ " calcCountFiveInRow");
			return null;
		}
		for (int i = 0; i < x.length; i++) {
			count = 0;
			for (int j = 0; j < x[0].length; j++) {
				if(x[i][j] == 5) {
					count++;
				}
			}
			if (count >= 3) {
				arr[k] = i + 1;
				k++;
			}
		}
		return arr;
		
	}
	
	/*
	 * Метод возвращает количество строк указанной матрицы у которых количество
	 * 5 не менее 3
	 */
	private static int calcCountFiveInRow(int[][] x) {
		int count = 0;
		int countN = 0;
		
		for (int i = 0; i < x.length; i++) {
			count = 0;
			for (int j = 0; j < x[0].length; j++) {
				if(x[i][j] == 5) {
					count++;
				}
			}
			if (count >= 3) {
				countN++;
			}
		}
		return countN;
		
	}
	
	/*
	 * Метод возвращает матрицу 10Х20 со случайными числами  
	 */
	private static int[][] createMatrix1020() {
		Random r = new Random();
		int[][] a = new int[10][20];
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				a[i][j] = r.nextInt(16);
			}
		}
		return a;
	}
	
	/*
	 * Задача 31. Сформировать матрицу из чисел от 0 до 999, 
	 * вывести ее на экран. Посчитать количество двузначных чисел в ней
	 */
	public static void run31() {
		int[][] a;
		int count = 0;
		
		System.out.println("Задача 31");
		System.out.println("Дана матрица:");
		a = createMatrix1000();
		printArrArr(a);
		count = calcCountTwo(a);
		System.out.println("Количество двузначных чисел в матрице:");
		System.out.println(count);
		System.out.println("");
	}
	
	/*
	 * Метод возвращает количество двузначных чисел в указанной матрице
	 */
	private static int calcCountTwo(int[][] x) {
		int count = 0;
		
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[0].length; j++) {
				if ((x[i][j] > 9) && (x[i][j] < 100)) {
					count++;
				}
			}
		}
		return count;
	}
	
	/*
	 * Метод возвращает матрицу состоящию из чисел от 0 до 999
	 */
	private static int[][] createMatrix1000() {
		int[][] a = new int[25][40];
		int c = 0;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				a[i][j] = c;
				c++;
			}
		}
		return a;
	}
	
	/*
	 * Задача 32.  Отсортировать строки матрицы по возрастанию и убыванию
	 * начений элементов
	 */
	public static void run32() {
		int[][] a;
		int[][] arr;
		
		a = new int[][] {{8, 3, 4, 3}, {3, 5, 7, 7}, {2, 9, 5, 6}};
		
		System.out.println("Задача 32");
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
		System.out.println("Массив строки которого отсортированы по возрастанию:");
		arr = sortRowArray(a);
		printArrArr(arr);
		arr = sortRowArrayMin(a);
		System.out.println("Массив строки которого отсортированы по убыванию:");
		printArrArr(arr);
		System.out.println("");
	}
	
	/*
	 * Метод возвращает отсортированную указанную матрицу по возрастанию
	 */
	private static int[][] sortRowArray(int[][] x) {
		
		for (int i = 0; i < x.length; i++) {
			x[i] = sortRowMax(x[i]);
		}
		
		return x;
	}
	
	/*
	 * Метод возвращает отсортированный указанный массив по возрастанию
	 */
	private static int[] sortRowMax(int[] x) {
		int min;
		int minI;
		int k;
		
		for (int i = 0; i < x.length; i++) {
			min = x[i];
			minI = i;
			
			for (int j = i + 1; j < x.length; j++) {
				if (x[j] < min) {
					min = x[j];
					minI = j;
				}
			}
			
			if (i != minI) {
				k = x[i];
				x[i] = min;
				x[minI] = k;
			}
		}
		return x;
	}
	
	/*
	 * Метод возвращает отсортированную указанную матрицу по убыванию
	 */
	private static int[][] sortRowArrayMin(int[][] x) {
		
		for (int i = 0; i < x.length; i++) {
			x[i] = sortRowMin(x[i]);
		}
		
		return x;
	}
	
	/*
	 * Метод возвращает отсортированный указанный массив по убыванию
	 */
	private static int[] sortRowMin(int[] x) {
		int max;
		int maxI;
		int k;
		
		for (int i = 0; i < x.length; i++) {
			max = x[i];
			maxI = i;
			
			for (int j = i + 1; j < x.length; j++) {
				if (x[j] > max) {
					max = x[j];
					maxI = j;
				}
			}
			
			if (i != maxI) {
				k = x[i];
				x[i] = max;
				x[maxI] = k;
			}
		}
		return x;
	}
	
	/*
	 * Задача 33. Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов
	 */
	public static void run33() {
		int[][] a;
		int[][] arr;
		
		a = new int[][] {{8, 3, 4, 3}, {3, 5, 7, 7}, {2, 9, 5, 6}};
		
		System.out.println("Задача 33");
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
		System.out.println("Массив столбцы которого отсортированы по возрастанию:");
		arr = sortColumnArrayMax(a);
		printArrArr(arr);
		arr = sortColumnArrayMin(a);
		System.out.println("Массив столбцы которого отсортированы по убыванию:");
		printArrArr(arr);
		System.out.println("");
	}
	
	/*
	 * Метод возвращает указанную матрицу cтолбцы которой отсортированы по возрастанию
	 */
	public static int[][] sortColumnArrayMax(int[][] x) {
		int min;
		int minJ;
		int k;

		for (int i = 0; i < x[0].length; i++) {			
			for (int j = 0; j < x.length; j++) {
				min = x[j][i];
				minJ = j;
				
				for (int n = j + 1; n < x.length; n++) {
					if (x[n][i] < min) {
						min = x[n][i];
						minJ = n;
					}
				}
				
				if (j != minJ) {
					k = x[j][i];
					x[j][i] = min;
					x[minJ][i] = k;
				}
			}
		}
		
		return x;
	}
	
	/*
	 * Метод возвращает указанную матрицу cтолбцы которой отсортированы по убыванию
	 */
	private static int[][] sortColumnArrayMin(int[][] x) {
		int max;
		int maxJ;
		int k;
		
		for (int i = 0; i < x.length; i++) {
			if (x[0].length != x[i].length) {
				return null;
			}
		}
		
		for (int i = 0; i < x[0].length; i++) {			
			for (int j = 0; j < x.length; j++) {
				max = x[j][i];
				maxJ = j;
				
				for (int n = j + 1; n < x.length; n++) {
					if (x[n][i] > max) {
						max = x[n][i];
						maxJ = n;
					}
				}
				
				if (j != maxJ) {
					k = x[j][i];
					x[j][i] = max;
					x[maxJ][i] = k;
				}
			}
		}
		
		return x;
	}
	
	
	
	/*
	 * Задача 34. Сформировать случайную матрицу m x n, состоящую из 
	 * нулей и единиц, причем в каждом столбце число единиц равно номеру
	 * столбца
	 */
	public static void run34() {
		int[][] a;
		a = createMatrixOZ();
		System.out.println("Задача 34");
		System.out.println("Матрица состоящая из нулей и единиц");
		printArrArr(a);
		System.out.println("");
	}
	
	/*
	 * Метод возвращает матрицу состоящую из нулей и единиц согласно условию задачи
	 */
	private static int[][] createMatrixOZ() {
		Random r = new Random();		
		int m = r.nextInt(4) + 2;
		int n = r.nextInt(4) + m;
		int[][] a = new int[n][m];
		int x;
		
		for (int i = 0; i < m; i++) {
			for (int k = 0; k < i + 1; k++) {
				x = r.nextInt(n);
				if (a[x][i] == 1)  {
					k--;
				} else {
					a[x][i] = 1;
				}
			}
		}
		return a;
	}
 	
	/*
	 * Задача 35.Найдите наибольший элемент матрицы и заменить все нечетные элементы на него
	 */
	public static void run35() {
		int[][] a;
		int[][] arr;
		int x;
		
		a = new int[][] {{8, 3, 4, 3}, {3, 5, 7, 7}, {2, 9, 5, 6}};
		
		System.out.println("Задача 35");
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
		System.out.println("Массив после обработки");
		x = findMaxNum(a);
		arr = createMaxUneven(a, x);
		printArrArr(arr);
		System.out.println("");
	}
	
	private static int[][] createMaxUneven(int[][] x, int max) {
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[0].length; j++) {
				if (x[i][j] % 2 != 0) {
					x[i][j] = max;
				}
			}
		}
		
		return x;
	}
	
	private static int findMaxNum(int[][] x) {
		int max = x[0][0];
		
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[0].length; j++) {
				if (x[i][j] > max) {
					max = x[i][j];
				}
			}
		}
		return max;
	}
  	
	/*
	 * Задача 36.  Операция сглаживания матрицы дает новую матрицу того же
	 * размера, каждый элемент которой получается как  среднее  арифметическое
	 * соседей соответствующего элемента исходной матрицы. Построить результат 
	 * сглаживания заданной матрицы
	 */
	public static void run36() {
		int[][] a;
		int[][] arr;
		
		a = new int[][] {{8, 3, 4, 3}, {3, 5, 7, 7}, {2, 9, 5, 6}};
		
		System.out.println("Задача 36");
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
		System.out.println("Матрица после обработки");
		arr = createSmoothMatrix(a);
		printArrArr(arr);
		System.out.println("");
	}
	
	/*
	 * Метод возвращает матрицу элементов полученной из указанной матрицы согласно
	 * условию задачи
	 */
	private static int[][] createSmoothMatrix(int[][] x) {		
		int[][] a = new int[x.length][x[0].length];
		
		for (int i = 0; i < x.length; i++) {
			for(int j = 0; j < x[0].length; j++) {
				double sum = 0;
				int count = 0;
				
				if(i != 0) {
					sum  = sum + x[i - 1][j];
					count++;
				}
				if(i != x.length - 1) {
					sum  = sum + x[i + 1][j];
					count++;
				}
				if(j != 0) {
					sum  = sum + x[i][j - 1];
					count++;
				}
				if(j != x[0].length - 1) {
					sum  = sum + x[i][j + 1];
					count++;
				}
				a[i][j] = (int) Math.round(sum / count);
			}
		}
		
		return a;	
	}
	/*
	 * Задача 37.  Переставить строки матрицы случайным образом
	 */
	public static void run37() {
		int[][] a;
		int[][] arr;
		
		a = new int[][] {{8, 3, 4, 3}, {3, 5, 7, 7}, {2, 9, 5, 6},
						 {1, 1, 1 ,1}, {2, 2, 2, 2}};
		
		System.out.println("Задача 37");
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
		System.out.println("Матрица после обработки");
		arr = createRandomRow(a);
		printArrArr(arr);
		System.out.println("");
	}
	
	/*
	 * Метод возвращает указанный массив с переменной строк
	 */
	private static int[][] createRandomRow(int[][] x) {		
		Random r = new Random();
		int[] row;
		int j;
		
		for (int i = 0; i < x.length; i++) {
			j = r.nextInt(x.length - i) +  i;
			row = x[j];
			x[j] = x[i];
			x[i] = row;
		}
		
		return x;
	}
	
	
	/*
	 * Задача 38.  Найдите сумму двух матриц
	 */
	public static void run38() {
		int[][] a;
		int[][] b;
		int[][] arr;
		
		a = new int[][] {{1, 1, 1, 1}, {2, 2, 2, 2}, {3, 3, 3, 3}};
		b = new int[][] {{4, 4, 4, 4}, {5, 5, 5, 5}, {6, 6, 6, 6}};
		
		System.out.println("Задача 38");
		System.out.println("Дана матрица А:");
		
		for (int i = 0; i < a.length; i++) {
			if (a[0].length != a[i].length) {
				System.out.println("Должна быть матрица");
				System.out.println("");
				return;
			}
		}
		
		printArrArr(a);
		System.out.println("Дана матрица B:");
		
		for (int i = 0; i < b.length; i++) {
			if (b[0].length != b[i].length) {
				System.out.println("Должна быть матрица");
				System.out.println("");
				return;
			}
		}
		
		printArrArr(b);
		
		if ((a.length != b.length) || (a[0].length != b[0].length)) {
			System.out.println("Матрицы должны быть одного размера");
		}
		
		System.out.println("");
		System.out.println("Сумма двух матриц");
		arr = createMatrixSum(a, b);
		printArrArr(arr);
		System.out.println("");
	}
	
	/*
	 * Метод возвращает матруцу суммы указанных массивов
	 */
	private static int[][] createMatrixSum(int[][] x, int[][] y) {		
		int[][] a = new int[x.length][x[0].length];
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				a[i][j] = x[i][j] +y[i][j];
			}
		}
		return a;
		
	}
	
	
	/*
	 * Задача 39.  Найдите произведение двух матриц
	 */
	public static void run39() {
		int[][] a;
		int[][] b;
		int[][] arr;
		
		a = new int[][] {{1, 1, 1, 1}, {2, 2, 2, 2}, {3, 3, 3, 3}};
		b = new int[][] {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}, {4, 4, 4}};
		
		System.out.println("Задача 39");
		System.out.println("Дана матрица А:");
		for (int i = 0; i < a.length; i++) {
			if (a[0].length != a[i].length) {
				System.out.println("Должна быть матрица");
				System.out.println("");
				return;
			}
		}
		
		printArrArr(a);
		System.out.println("Дана матрица B:");
		
		for (int i = 0; i < b.length; i++) {
			if (b[0].length != b[i].length) {
				System.out.println("Должна быть матрица");
				System.out.println("");
				return;
			}
		}
		
		printArrArr(b);
	
		System.out.println("Произведение двух матриц");
		if (a[0].length != b.length) {
			System.out.println("Матрицы невозможно перемножить");
		}
		arr = createMatrixMult(a, b);
		if (arr == null) {
			System.out.println("Неверные начальные данные");
		} else {
			printArrArr(arr);
		}
		System.out.println("");
	}
	
	private static int[][] createMatrixMult(int[][] x, int[][] y) {		
		int[][] a = new int[x.length][y[0].length];
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				a[i][j] = 0;
				for(int k = 0; k < x[0].length; k++) {
					a[i][j] = a[i][j] + x[i][k] * y[k][j];
				}
			}
		}
		return a;
		
	}
}
