package array.random;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ArrayRandom_Hoc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int i;
		int n;
		int sum = 0;
		float avg = 0.0f;
		int max, min;
		int count = 0;
		do {
			System.out.print("Nhập n > 0: ");
			n = input.nextInt();
		} while (n <= 0);
		int arr[] = new int[n];

		for (i = 0; i < n; i++) {
			int randomNum = ThreadLocalRandom.current().nextInt(0, 1000);
			arr[i] = randomNum;
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		for (i = 0; i < n; i++) {
			sum += arr[i];
		}
		System.out.print("Tổng các số trong danh sách: " + sum);
		System.out.println();
		for (i = 0; i < n; i++) {
			avg = (float) sum / n;
		}
		System.out.print("Trung bình cộng: " + avg);
		System.out.println();
		max = arr[0];
		min = arr[0];
		for (i = 0; i < n; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("MAx: " + max);
		System.out.println("Min: " + min);
		for (i = 0; i < n; i++) {
			if (KTSNT(arr[i]) == true) {
				count++;
				System.out.print(arr[i] + " ");
			}
		}
		System.out.print(": Có " + count + " số nguyên tố ");

		
	}

	public static boolean KTSNT(int n) {
		int dem = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				dem++;
			}
		}
		if (dem == 2) {
			return true;
		} else {
			return false;
		}
	}
}