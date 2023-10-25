/*
 * 	Inverted Half Pyramid
 * 	# # # # #
 * 	# # # #
 * 	# # #
 * 	# #
 * 	#
 */

import java.util.Scanner;

public class invertedHalfPyramid {

	public static void main(String ...args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter n: ");
		
		int n = input.nextInt();

		for(int i = 0; i < n; i++) {

			for(int j = 0; j < n - i; j++) {

				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
