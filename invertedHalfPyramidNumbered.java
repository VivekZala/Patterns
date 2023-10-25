/*
 *	Inverted Half Pyramid with numbers
 *	1 2 3 4 5
 *	1 2 3 4
 *	1 2 3 
 *	1 2 
 *	1
 */

import java.util.Scanner;

public class invertedHalfPyramidNumbered {

	public static void main(String ...args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter n: ");

		int n = input.nextInt();

		for(int i = 0; i < n; i++) {

			for(int j = 1; j <= n - i; j++) {

				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}

