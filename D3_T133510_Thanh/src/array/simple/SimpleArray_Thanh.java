package array.simple;

import java.util.Scanner;

public class SimpleArray_Thanh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n;
		do {
			System.out.print("Nhập n > 0: ");
			n = input.nextInt();
		} while (n <= 0);

		int arr[] = new int[n];
		int i;
		for (i = 0; i < n; i++) {
			arr[i] = input.nextInt();
		}
		System.out.print("Các số chia hết cho 7 hoặc chia hết cho 2:  ");
		for (i = 0; i < n; i++) {
			if (arr[i] % 7 == 0 || arr[i] % 2 == 0)
				System.out.print(arr[i] + "\t");
		}
		System.out.println();
		System.out.print("Các số chia hết cho 5 nhưng không chia hết cho 3: ");
		for (i = 0; i < n; i++) {
			if (arr[i] % 5 == 0 && arr[i] % 3 > 0)
				System.out.print(arr[i] + "\t");
		}
	}
}