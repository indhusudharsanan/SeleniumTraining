package org.string;

public class Task2 {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		float sum = 0;
		for (int i = 0; i < a.length; i++) {

			sum = sum + a[i];
			System.out.println(sum);

		}
		float average = sum/10;
		System.out.println(average);

	}
}
