package array.search;

import java.util.Random;
import java.util.Scanner;

public class ArraySearch_Hoc {

	public static int[] Num = new int[100];
	public static Random random = new Random();

	public static void Solve() {
		int count = 0;
		int i = 0;
		for (i = 0; i < Num.length; i++) {
			int range = 50 - 10 + 1;
			Num[i] = 10 + random.nextInt(range);
		}
		for (int so : Num) {
			if (count % 10 == 0) {
				System.out.println();
				System.out.print(so + " ");
			} else {
				System.out.print(so + " ");
			}
			count++;
		}
		System.out.println();
		Scanner in = new Scanner(System.in);
		int n = 0;
		do {
			System.out.print("Nhập vào số n: ");
			n = in.nextInt();
		} while (n < 10 || n > 50);
		int[][] a = convert_1D_To_2D(Num, 10, 10);
		int countTimesn = 0;

		for (int row = 0; row < 10; row++) {
			for (int col = 0; col < 10; col++) {
				if (n == a[row][col]) {
					System.out.println(
							"Số nguyên dương " + n + " xuất hiện tại vị trí dòng " + (row + 1) + " cột " + (col + 1));
					countTimesn++;
				}
			}
		}
		System.out.println("Số lần xuất hiện: " + countTimesn);
	}

	public static int[][] convert_1D_To_2D(int[] array, int rows, int cols) {
		if (array.length != (rows * cols)) {
			throw new IllegalArgumentException("Invalid array length");
		}
		int[][] arr2d = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			System.arraycopy(array, (i * cols), arr2d[i], 0, cols);
		}
		return arr2d;
	}

	public static void main(String[] args) {
		Solve();
	}

}