/*
 * 	0-1 Triangle
 * 	1
 * 	0 1
 * 	1 0 1
 * 	0 1 0 1
 * 	1 0 1 0 1
 */

import java.util.Scanner;

public class triangle01 {

	public static void main(String ...args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter n: ");

		int n = input.nextInt();

		for(int i = 1; i <= n; i++) {

			for(int j = 1; j <= i; j++) {

				// if((i + j) % 2 == 0)
				if((i % 2 == 0 && j % 2 == 0) || (i % 2 != 0 && j % 2 != 0))
					System.out.print("1 ");
				else
					System.out.print("0 ");
			}
			System.out.println();
		}
	}
}
