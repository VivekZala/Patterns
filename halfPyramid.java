/*
 * 	Half Pyramid
 * 	#
 * 	# #
 * 	# # #
 * 	# # # #
 * 	# # # # #
 */

import java.util.Scanner;

public class halfPyramid {

	public static void main(String ...args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter n: ");

		int n = input.nextInt();

		for(int i = 1; i <= n; i++) {

			for(int j = 0; j < i; j++) {

				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
