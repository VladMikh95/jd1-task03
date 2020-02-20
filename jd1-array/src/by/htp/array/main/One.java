package by.htp.array.main;

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
		//run18();
		run19();
		run20();

	}
	
	/*
	 * Задача 1 В массив A [N] занесены натуральные числа. Найти сумму тех элементов,
	 * которые кратны данному К
	 */
	public static void run1() {
		int[] a;
		int k;
		
		a = new int[] {1, 2, 3, 4, 5};
		k = 2;
		
		System.out.println("Задача 1");
		System.out.println("Cумма элементов массива, которые кратны К = " + k);
		
		for (int i = 0; i < a.length; i++) {
			if(a[i] < 1) {
				System.out.println("В массиве должны быть натуральные числа");
				return;
			}
		}
		
		if (k == 0) {
			System.out.println("На 0 делить нельзя");
			return;
		}
		System.out.println(calcSumN(a, k));
		System.out.println("");
	}
	/*
	 * Метод возврашает сумма элементов  указанного массива, которые кратны
	 * указанному числу
	 */
	private static int calcSumN(int[] a, int b) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + calcMultipl(a[i], b);
		}
		return sum;
	}
	
	/*
	 * Метод возвращает указанное число аб если оно кратно числу b, иначе 0
	 */
	private static int calcMultipl(int a, int b) {
		if (a % b == 0) {
			return a;
		} else {
			return 0;
		}
	}
	
	/*
	 * Задача 2.  В целочисленной последовательности есть нулевые элементы. 
	 * Создать массив из номеров этих элементов
	 */
	public static void run2() {
		int[] a;
		int[] result;
		
		a = new int[] {1, 0, 0, 2, 4, 0};
		
		result = makeArray(a);
		System.out.println("Задача 2");
		System.out.println("Массив  из элементов последовательности равных 0:");
		for(int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
		System.out.println("");
		System.out.println("");
	}
	/*
	 * Метод возвращает массив из элементов последовательности равных 0
	 */
	private static int[] makeArray(int[] a) {
		int[] newArray = new int[calcCountZero(a)];
		int j = 0;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0) {
				newArray[j] = i;
				j++;
			}
		}
		return newArray; 
	}
	
	/*
	 * Метод возвращает количество элементов равных 0 в заданном массиве
	 */
	private static int calcCountZero(int[] a) {
		int count = 0;
				
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0) {
				count++;
			}
		}
		return count;
		
	}
	
	/*
	 * Задача 3. Дана последовательность целых чисел а1 а2,..., аn . 
	 * Выяснить, какое число встречается раньше - положительное или отрицательное
	 */
	public static void run3() {
		int[] mas;
		String s;
		
		mas = new int[] {-3, 4, 2, -2};
		
		if (mas[0] >= 0) {
			s = "положительное";
		} else {
			s = "отрицательное";
		}
		System.out.println("Задача 3");
		System.out.print("В заданном массиве: ");
		for(int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
		System.out.println("");
		System.out.print("Первое число ");
		System.out.println(s);
		System.out.println("");
	}
	
	/*
	 * Задача 4. Дана последовательность действительных чисел а1 а2 ,..., аn . 
	 * Выяснить, будет ли она возрастающей
	 */
	public static void run4() {
		int[] a;
		
		a = new int[] {1, 2, 3, 3, 5};
		
		System.out.println("Задача 4");
		System.out.println("Является ли последователность ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println(" возрастающей?");
		System.out.println(detSequence(a));
		System.out.println("");
	}
	/*
	 * Метод возвращает является ли указанная последователность возрастающей
	 */
	private static String detSequence(int[] a) {
		int num = a[0];
		
		for (int i = 1; i < a.length; i++) {
			if (a[i] > num) {
				num = a[i];
			} else {
				return "нет";
			}
		}
		return "да";
	}
	
	/*
	 * Задача 5.  Дана последовательность натуральных чисел а1 , а2 ,..., ап. 
	 * Создать массив из четных чисел этой последовательности. Если таких чисел нет,
	 * то вывести сообщение об этом факте
	 */
	public static void run5() {
		int[] a;
		
		int[] result;
		
		a = new int[] {1, 2, 3, 4, 5};
		
		for (int i = 0; i < a.length; i++) {
			if(a[i] < 1) {
				System.out.println("В массиве должны быть натуральные числа");
				return;
			}
		}
		
		result = createEvenMas(a);				
		System.out.println("Задача 5");
		System.out.println("Новый массив из четных чисел");
		if (calcCountEvenN(a) == 0) {
			System.out.println("В заданном массиве четных чисел нет");
		} else {
			for(int i = 0; i < result.length; i++) {
				System.out.print(result[i] + " ");
			}
			System.out.println("");
		}
		System.out.println("");
	}
	
	/*
	 * Метод возвращает массив из четных чисел указанного массива
	 */
	private static int[] createEvenMas(int[] a) {
		int[] mas = new int[calcCountEvenN(a)];
		int j = 0;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				mas[j] = a[i];
				j++;
			}
		}
		return mas;
	}
	/*
	 * Метод возвращает количество четных чисел в указанном массиве
	 */
	private static int calcCountEvenN(int[] a) {
		int count = 0;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				count++;
			}
		}
		return count;
	}
	
	/*
	 * Задача 6. Дана последовательность чисел а1 ,а2 ,..., ап. 
	 * Указать наименьшую длину числовой оси, содержащую все эти числа
	 */
	public static void run6() {
		int[] a;
		
		a = new int[]{1, 3, 5, 9};
		
		System.out.println("Задача 6");
		System.out.print("Для последовательности чисел");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("");
		System.out.println("Наименьшая длина числовой оси: " + calcMax(a));
		System.out.println("");
	}
	
	/*
	 * Метод возвращает max. элемент в указанной последовательности
	 */
	private static int calcMax(int[] x) {
		int max = 0;
		
		for (int i = 0; i < x.length; i++) {
			if (x[i] > max) {
				max = x[i];
			}
		}
		return max;
	}
	
	/*
	 * Задача 7.  Дана последовательность действительных чисел а1 ,а2 ,..., ап.
	 * Заменить все ее члены, большие данного Z, этим числом. Подсчитать количество
	 * замен
	 */
	public static void run7() {
		int[] a;
		int z;
		
		int[] result;
		
		a = new int[] {1, 2, 3, 4, 5};
		z = 3;
		
		result = createMasZ(a, z);
		System.out.println("Задача 7");
		System.out.print("Последовательность чисел ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("после преобразования стала выглядеть ");
		for(int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
		System.out.println("");
		System.out.println("Количество изменений = " + calcCountZ(a, z));
		System.out.println("");
	}
	
	/*
	 * Метод возвращает новый массив
	 */
	private static int[] createMasZ(int[] x, int y) {
		int[] mas = x.clone();
		for (int i = 0; i < x.length; i++) {
			if (mas[i] > y) {
				mas[i] = y;
			}
		}
		return mas;
	}
	
	/*
	 * Метод возвращает количество изменений в указанном массиве
	 */
	private static int calcCountZ(int[] x, int y) {
		int count = 0; 
		
		for (int i = 0; i < x.length; i++) {
			if (x[i] > y) {
				count++;
			}
		}
		System.out.println(count);
		return count;
	}
	
	/*
	 * Задача 8. Дан  массив  действительных  чисел,  размерность  которого  N.
	 * Подсчитать, сколько в нем отрицательных,положительных и нулевых элементов
	 */
	public static void run8() {
		int[] a;
		int n;
		
		n = 7;
		a = new int[] {1, 2, 0, 3, -2, 1, -2};
		
 		System.out.println("Задача 8");
		System.out.println("Дан массив размерностью " + n);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("");
		System.out.println("Количество отрицательных чисел в массиве = " 
				+ calcCountNeg(a));
		System.out.println("Количество положительных чисел в массиве = " 
				+ calcCountPos(a));
		System.out.println("Количество нулевых чисел в массиве = " 
				+ calcCountZ(a));
	}
	
	/*
	 * Метод возвращает количество положительных элементов в указанном массиве
	 */
	private static int calcCountPos(int[] x) {
		int count = 0;
		
		for (int i = 0; i < x.length; i++) {
			if (x[i] > 0) {
				count++;
			}
		}
		return count;
	}
	
	/*
	 * Метод возвращает количество отрицательных элементов в указанном массиве
	 */
	private static int calcCountNeg(int[] x) {
		int count = 0;
		
		for (int i = 0; i < x.length; i++) {
			if (x[i] < 0) {
				count++;
			}
		}
		return count;
	}
	
	/*
	 * Метод возвращает количество нулевых элементов в указанном массиве
	 */
	private static int calcCountZ(int[] x) {
		int count = 0;
		
		for (int i = 0; i < x.length; i++) {
			if (x[i] == 0) {
				count++;
			}
		}
		return count;
	}
	
	/*
	 * Задача 9. Даны действительные числа а1 ,а2 ,..., аn . 
	 * Поменять местами наибольший и наименьший элементы
	 */
	public static void run9() {
		int[] a;
		
		int[] result;
		
		a = new int[] {1, 2, 3, 4, 5};
		
		result = createMasMM(a);
		
		System.out.println("Задача 9");
		System.out.println("Дан массив: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("");
		System.out.println("Массив после замены местами элементов:");
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
		System.out.println("");
		System.out.println("");
	}
	/*
	 * Метод возвращает указанный массив с переменой наибольшего и наименьшего
	 * элементов местами
	 */
	private static int[] createMasMM(int[] x) {
		int max = x[findMax(x)];
		x[findMax(x)] = x[findMin(x)];
		x[findMin(x)] = max;
		return x;
	}
 	
	/*
	 * Метод возвращает индекс наибольшего элемента в указанном массиве
	 */
	private static int findMax(int[] x) {
		int max = x[0];
		int result = 0;
		for (int i = 1; i < x.length; i++) {
			if (x[i] > max) {
				max = x[i];
				result = i;
			}
		}
		return result;
	}
	
	/*
	 * Метод возвращает индекс наименьшего элемента в указанном массиве
	 */
	private static int findMin(int[] x) {
		int min = x[0];
		int result = 0;
		for (int i = 1; i < x.length; i++) {
			if (x[i] < min) {
				min = x[i];
				result = i;
			}
		}
		return result;
	}
	
	/*
	 * Задача 10. Даны целые числа а1 ,а2 ,..., аn . 
	 * Вывести на печать только те числа, для которых аi > i
	 */
	public static void run10() {
		int[] a;
		
		int[] result; 
		
		a = new int[] {5, 4, 3, 2, 1};
		
		result = createArrayI(a);
		
		System.out.println("Задача 10");
		System.out.println("Дан массив: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("");
		System.out.println("Элементы массива согласно условию ai > i");
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
		System.out.println("");
		System.out.println("");
	}
	
	/*
	 * Метод возвращает массив элементов указанного массива согласно 
	 * условию ai > i
	 */
	private static int[] createArrayI(int[] x) {
		int[] mas = new int[calcCountI(x)];
		int j = 0;
		for (int i = 0; i < x.length; i++) {
			if (x[i] > i) {
				mas[j] = x[i];
				j++;
			}
		}
		return mas;
	}
	
	/*
	 * Метод возвращает количество элементов указанного массива согласно 
	 * условию ai > i
	 */
	private static int calcCountI(int[] x) {
		int count = 0;
		for (int i = 0; i < x.length; i++) {
			if (x[i] > i) {
				count++;
			}
		}
		return count;
	}
	
	/*
	 * Задача 11. Даны натуральные числа а1 ,а2 ,..., аn . 
	 * Указать те из них, у которых остаток от деления на М равен L (0 < L < М-1) 
	 */
	public static void run11() {
		int[] a;
		int l;
		int m;		
		
		int[] result; 
		
		a = new int[] {5, 4, 7, 2, 3};
		l = 1;
		m = 3;
				
		System.out.println("Задача 11");
		System.out.println("Дан массив: ");
		
		for (int i = 0; i < a.length; i++) {
			if(a[i] < 1) {
				System.out.println("В массиве должны быть натуральные числа");
				return;
			}
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
		System.out.println("числа L = " + l + ", M = " + m);
		if (checkCondition(m, l)) {
			result = createDivLM(a, m, l);
			System.out.println("Элементы массива согласно условию задачи");
			for (int i = 0; i < result.length; i++) {
				System.out.print(result[i] + " ");
			}
			System.out.println("");
			System.out.println("");
		}
	}
	
	/*
	 * Метод возвращает массив элементов указанного массива согласно условию
	 * задачи
	 */
	private static int[] createDivLM(int[] x, int m, int l) {
		int[] arr = new int[calcCountDiv(x, m, l)];
		int j = 0;
		
 		for (int i = 0; i < x.length; i++) {
			if (x[i] % m == l) {
				arr[j] = x[i];
				j++;
			}
		}
		return arr;
	} 
	
	/*
	 * Метод возвращает количество элементов указанного массива согласно условию
	 * задачи
	 */
	private static int calcCountDiv(int[] x, int m, int l) {
		int count = 0;
		for (int i = 0; i < x.length; i++) {
			if (x[i] % m == l) {
				count++;
			}
		}
		return count;
	}
	
	/*
	 * Метод проверяет условие задачи
	 */
	private static boolean checkCondition(int m, int l) {
		boolean b = true;
		if ((l <= 0) || (l >= m - 1)) {
			b = false;
			System.out.println("Условие задано неверно!");
		}
		return b;
	}
	
	/*
	 * Задача 12.  Задана последовательность N вещественных чисел. 
	 * Вычислить сумму чисел, порядковые номера которых являются простыми числами
	 */
	public static void run12() {
		int[] a;		 
		
		a = new int[] {1, 2, 3, 4, 5};
				
		System.out.println("Задача 12");
		System.out.println("Дан массив: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("");
		System.out.println("Сумма чисел, порядковые номера которых "
				+ "являются простыми числами:");
		System.out.println(calcSumSimpleNum(a));
		System.out.println("");
	}
	
	/*
	 * Метод возвращает сумму чисел указанного массива, порядковые номера 
	 * которых являются простыми числами
	 */
	private static int calcSumSimpleNum(int[] x) {
		int sum = 0;
		
		for (int i = 1; i <= x.length; i++) {
			sum = sum + calcSimpleN(i, x[i - 1]);
		}
		return sum;
	}
	
	/*
	 * Метод возвращает указанное число, если оно простое, иначе 0
	 */
	private static int calcSimpleN(int a, int b) {
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				return 0;
			}
		}
		return b;
	}
	
	/*
	 * Задача 13.  Определить количество элементов последовательности 
	 * натуральных чисел, кратных числу М и заключенных в промежутке от L до N
	 */
	public static void run13() {
		int[] a;
		int m;
		int l;
		int n;
		
		a = new int[] {5, 4, 7, 2, 3, 2, 2};
		l = 2;
		n = 7;
		m = 2;
				
		System.out.println("Задача 13");
		System.out.println("Дан массив: ");
		
		for (int i = 0; i < a.length; i++) {
			if(a[i] < 1) {
				System.out.println("В массиве должны быть натуральные числа");
				return;
			}
		}
		
		if (l > n) {
			System.out.println("Число l не может быть больше чем n");
			return;
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
		System.out.println("числа m = " + m + ", l = " + l + ", n = " + n);
		System.out.println("Количество элементов последовательности" 
				+ "натуральных чисел, кратных числу М и заключенных в "
				+ "промежутке от L до N");
		System.out.println(findCountDiv(a, m, l - 1, n - 1));
		System.out.println("");
	}
	
	/*
	 * Метод возвращает количество элементов в указанном массиве, кратных 
	 * указанному числу m и заключенных в промежутке от l до n
	 */
	private static int findCountDiv(int[] a, int m, int l, int n) {
		int count = 0;
		
		for (int i = l; i <= n; i++) {
			count = count + detDivis(a[i], m);
		}
		return count;
	}
	
	/*
	 * Метод возвращает 1 если указанное число a делится нацело на b иначе 0
	 */
	private static int detDivis(int a, int b) {
		if (a % b == 0) {
			return 1;
		} else {
			return 0;
		}
	}
	
	/*
	 * Задача 14. Дан одномерный массив A[N]. Найти
	 */
	public static void run14() {
		int[] a;		 
		
		a = new int[] {1, 2, 3, 4, 5, 6};
				
		System.out.println("Задача 14");
		System.out.println("Дан массив: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("");
		System.out.println("Результат выражения равен: ");
		System.out.println(calcMaxMin(a));
		System.out.println("");
	}
	/*
	 * Метод возвращает результат выражения
	 */
	private static int calcMaxMin(int[] x) {
		int[] max = new int[x.length / 2];
		int[] min;
		if (x.length % 2 == 1 ) {
			min = new int[x.length / 2 + 1];
		} else {
			min = new int[x.length / 2];
		}
		int j = 0;
		int k = 0;
		for (int i = 0; i < x.length; i = i + 2) {
			min[j] = x[i];
			j++;
		}
		for (int i = 1; i < x.length; i = i + 2) {
			max[k] = x[i];
			k++;
		}
		return findMaxAr(max) + findMinAr(min);
	}
	
	/*
	 * Метод возвращает максимальный элемент последовательности
	 */
	private static int findMaxAr(int[] x) {
		int max = x[0];
		
		for (int i = 0; i < x.length; i++) {
			if (x[i] > max) {
				max = x[i];
			}
		}
		return max;
	}
	
	/*
	 * Метод используется в задача 14, 17
	 * Метод возвращает минимальный элемент последовательности
	 */
	private static int findMinAr(int[] x) {
		int min = x[0];
		
		for (int i = 0; i < x.length; i++) {
			if (x[i] < min) {
				min = x[i];
			}
		}
		return min;
	}
	
	/*
	 * Задача 15. Дана последовательность действительных чисел a1,a2,,an .
	 * Указать те ее элементы, которые принадлежат отрезку [с, d]
	 */
	public static void run15() {
		int[] a;
		int c = 3;
		int d = 6;
		
		int[] arr;
		
		a = new int[] {1, 2, 3, 4, 5, 6};
		
		arr = findMas(a, c, d);				
		System.out.println("Задача 14");
		System.out.println("Дан массив: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
		System.out.println("Элементы которые принадлежат отрезку [" + c
				+ ", " + d +"]:");
		if (c > d) {
			System.out.println("Число с не может быть больше чем d");
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
		System.out.println("");
	}
	
	/*
	 * Метод возвращает массив, который содержит элементы указанного массива на
	 * указанном отрезке
	 */
	private static int[] findMas(int[] x, int c, int d) {
		int[] arr = new int[d - c + 1];
		int j = 0;
		for (int i = c - 1; i <= d - 1; i++) {
			arr[j] = x[i];
			j++;
		}
		return arr;
	}
	/*
	 * Задача 16. Даны действительные числа  a1,a2,,an . Найти
	 */
	public static void run16() {
		int[] a;
		int[] arr;
		
		a = new int[] {1, 2, 3, 4, 5, 6};
		
		arr = createMas(a);
						
		System.out.println("Задача 16");
		System.out.println("Дан массив: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("");
		System.out.println("Новый массив:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
		System.out.println("");
	}
	
	/*
	 * Метод возвращает новый массив путем преобразования указанного массива
	 * согласно условию
	 */
	private static int[] createMas(int[] x) {
		int[] arr = new int[x.length];
		for (int i = 0; i < x.length; i++) {
			arr[i] = x[i] + x[x.length - i - 1];
		}
		return arr;
	}
 	
	/*
	 * Задача 17. Дана последовательность целых чисел  a1,a2,,an. 
	 * Образовать новую последовательность, выбросив из исходной те члены, 
	 * которые равны  min(a1,a2,,an)
	 */
	public static void run17() {
		int[] a;
		
		int[] arr;
		
		a = new int[] {1, 2, 3, 1, 1, 6};
		
		arr = createMasMin(a);				
		System.out.println("Задача 17");
		System.out.println("Дан массив: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("");
		System.out.println("Новый массив:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
		System.out.println("");
	}
	
	/*
	 * Метод возвращает массив элементов указанного массива без элементов
	 * равных min элементу массива
	 */
	private static int[] createMasMin(int[] x) {
		int[] arr = new int[x.length - calcCountMinNum(x)];
		int j = 0;
		
		for (int i = 0; i < x.length; i++) {
			if (x[i] != findMinAr(x)) { 		// метод findMinAr(int[] x)
												// написан в 14 задаче (стр. 740)
				arr[j] = x[i];
				j++;
			}
		}
		return arr;
	}
	
	/*
	 * Метод возвращает количество элементов указанного массива равных min элементу
	 * массива
	 */
	private static int calcCountMinNum(int[] x) {
		int count = 0;
		for (int i = 0; i < x.length; i++) {
			if (x[i] == findMinAr(x)) { 		// метод findMinAr(int[] x)
												// написан в 14 задаче (стр. 740)
				count++;
			}
		}
		return count;
	}
	
	/*
	 * Задача 19. В массиве целых чисел с количеством элементов n найти 
	 * наиболее часто встречающееся число. Если таких чисел несколько, 
	 * то определить наименьшее из них
	 */
	public static void run19() {
		int[] a;
		
		a = new int[] {1, 6, 6, 4, 5, 6, 5, 5};
						
		System.out.println("Задача 19");
		System.out.println("Дан массив: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("");
		System.out.println("Наиболее часто встречающееся число в массиве:");
		System.out.println(findMaxCount(a));
		System.out.println("");
	}
	
	/*
	 * Метод возвращает наиболее часто встречающееся число в указанном массиве
	 */
	private static int findMaxCount(int[] x) {
		int result = x[0];
		int maxC = 0;
		int count;
		
		for (int i = 0; i < x.length; i++) {
			count = calcCountNum(x, i);
					
			if (count > maxC) {
				result = x[i];
			} else if (count == maxC) {
				result = Math.min(result, x[i]);
			}
		}
		return result;
	}
	
	/*
	 * Метод возвращает количество элементов указанной позиции 
	 * в указанном массиве
	 */
	private static int calcCountNum(int x[], int i) {
		int count = 0;
		
		for (int j = i + 1; j < x.length; j++) {
			if (x[i] == x[j]) {
				count++;
			}
		}
		return count;
	}
	
	
	/*
	 * Задача 20.  Дан целочисленный массив с количеством элементов п. 
	 * Сжать массив, выбросив из него каждый второй элемент (освободившиеся 
	 * элементы заполнить нулями). Примечание. Дополнительный массив не использовать
	 */
	public static void run20() {
		int[] a;
		
		a = new int[] {1, 2, 3, 4, 5, 6};
						
		System.out.println("Задача 20");
		System.out.println("Дан массив: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("");
		a = calcSecondZero(a);
		System.out.println("Новый массив:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("");
		System.out.println("");
	}
	
	/*
	 * Метод возвращает указанный массив с заменой без каждого второго элемента
	 */
	private static int[] calcSecondZero(int[] x) {
		int[] a = new int[x.length];
		int j = 0;
		
 		for (int i = 0; i < x.length; i = i + 2) {
			a[j] = x[i];
			j++;
		}
		return a;
	}
}
