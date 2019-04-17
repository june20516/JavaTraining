package test;

public class SortTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arry1 = { 11, 2, 3, 6, 5, 1, 20,65,22,18,76,30,29,83,24 };

		sort(arry1);

	}

	public static void sort(int[] x) {
		int temp;
		int count= 0;
		for (int a = 0; a < x.length; a++) {
			for (int i = 0; i < x.length - 1 - a; i++) {
				if (x[i] > x[i + 1]) {
					temp = x[i];
					x[i] = x[i + 1];
					x[i + 1] = temp;
					printArr(x);
				}
				count++;
			}
		}

		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
		System.out.println("count" + count);
	}
	public static void printArr(int[] x) {
		for(int n : x) {
			System.out.print(n + " ,");
		}
		System.out.println();
	}
}
