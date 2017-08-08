package array.simple;

import java.util.Scanner;

public class SimpleArray_Hoc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n;
		do {
			System.out.print("Nhập n>0: ");
			n = in.nextInt();
		} while (n < 0);

		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		System.out.print("Các số chia hết cho 7 hoặc chia hết cho 2 là : ");
		for (int i = 0; i < n; i++) {
			if (arr[i] % 7 == 0 | arr[i] % 2 == 0) {
				System.out.print(arr[i] + "\t");

			}
		}
		System.out.println();
		System.out.print("Các số chia hết cho 5 nhưng không chia hết cho 3 là : ");
		for (int i = 0; i < n; i++) {
			if (arr[i] % 5 == 0 && arr[i] % 3 == 0) {
				System.out.print(arr[i] + "\t");
			}
		}
	}

}
