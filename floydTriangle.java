/*
 * 	Floyd's Triangle
 * 	1
 * 	2 3
 * 	4 5 6
 * 	7 8 9 10
 * 	11 12 13 14 15
 */

import java.util.Scanner;

public class floydTriangle {

	public static void main(String ...args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter n: ");
		int n = input.nextInt();
		int count = 1;

		for(int i = 1; i <= n; i++) {

			for(int j = 0; j < i; j++) {

				System.out.print((count++) + " ");
			}
			System.out.println();
		}
	}
}
