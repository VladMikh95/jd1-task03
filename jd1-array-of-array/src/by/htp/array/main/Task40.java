package by.htp.array.main;

public class Task40 {

	public static void main(String[] args) {
		int n;
		int[] a;
		int fact;
		int[][] matrix;
		int countMagic = 0;
		
		n = 3;
		
		n = n * n;
		a = new int[n];
		fact = calcFactorial(n);
		
		for (int i = 0; i < n; i++) {
			a[i] = i + 1;
		}
		print(a); 
		
		for (int i = 0; i < fact - 1; i++) {
			a = createAr(a);
			matrix = createSqwareMatrix(a);
			if (checkArrMagic(matrix)) {
				System.out.println("Магический квадрат:");
				printMatrix(matrix);
				System.out.println(countMagic);
			}
		}
	}
	
	/*
	 * Метод возвращает массив после очередной перестановки указанного массива
	 * Работа метода: если указанный массив представить числом, то возвращаемый 
	 * массив будет числом следующим по возрастанию после указанного массива при 
	 * перестановке местами его цифр
	 */
	private static int[] createAr(int[] a) {
		int n = a.length;
		int j = n - 2;
		int l = n - 1;
		int x;
			
		for (int w = n - 2; w >= 0; w--) {
			if (a[j] < a[j + 1]) {
				break;
			}
			j--;
		}
		
		for (int t = n - 1; t > j; t--) {
			if(a[l] > a[j]) {
				break;
			} else {
				l--;
			}
		}
		
		x = a[j];
		a[j] = a[l];
		a[l] = x;
		n = n -1;
		for (int q = j + 1; q < n; q++) {
			x = a[q];
			a[q] = a[n];
			a[n] = x;
			n--;
		}
		
		return a;
	}
	
	/*
	 * Метод возвращает количество возможных перестановок чисел
	 */
	private static int calcFactorial(int n) {
		int result = n;
		
		for(int i = n - 1; i > 1; i--) {
			result = result * i;
		}
		return result;
	}
	
	/*
	 * Метод возвращает квадратную матрицу, полученную из указанного массива
	 */
	private static int[][] createSqwareMatrix(int[] x) {
		int n = (int) Math.sqrt(x.length);
		int[][] a = new int[n][n];
		int item = 0;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = x[item];
				item++;
			}
		}
		
		return a;
	}
	
	/*
	 * Метод возвращает сумму элементов указанного массива
	 */
	private static int calcSumElAr(int[] x) {
		int sum = 0;
		
		for (int i = 0; i < x.length; i++) {
			sum = sum + x[i];
		}
		
		return sum;
	}
	
	/*
	 * Метод возвращает булево число, является ли указанная матрица магической
	 */
	private static boolean checkArrMagic(int[][] x) {
		int sum = calcSumElAr(x[0]);
		int s;
		for (int i = 1; i < x.length; i++) {
			if (sum != calcSumElAr(x[i])) {
				return false;
			}
		}
		
		for (int i = 0; i < x.length; i++) {
			s = 0;
			
			for (int j = 0; j < x.length; j++) {
				s = s + x[j][i]; 
			}
			
			if (s != sum) {
				return false;
			}
		}
		
		s = 0;
		
		for(int i = 0; i < x.length; i++) {
			s = s + x[i][i];
		}
		
		if (s != sum) {
			return false;
		}
		
		s = 0;
		
		for(int i = 0; i < x.length; i++) {
			s = s + x[x.length - i - 1][i];
		}
		
		if (s != sum) {
			return false;
		}
		return true;
	}
	
	/*
	 * Метод выводит на экран массив
	 */
	private static void print(int[] n) {
		for (int i = 0; i < n.length; i++) {
			System.out.print(n[i] + " ");
		}
		System.out.println("");
	}
	
	/*
	 * Метод выводит на экран матрицу
	 */
	private static void printMatrix(int[][] n) {
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[0].length; j++) {
				System.out.print(n[i][j] + " ");
			}
			System.out.println("");
		}
	}
	
	

}
