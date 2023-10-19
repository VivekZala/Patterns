/*
 * 	Hollow Rectangle
 * 	# # # # # # # #
 * 	#	      #
 * 	#             #
 * 	#             #
 * 	# # # # # # # #
 */

import java.util.Scanner;

public class hollowRectangle {

	public static void main(String ...args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter n: ");

		int n = input.nextInt();

		System.out.print("Enter m: ");
		
		int m = input.nextInt();

		for(int i = 0; i < n; i++) {

			for(int j = 0; j < m; j++) {

				if(i == 0 || j == 0 || i == n - 1 || j == m - 1) {

					System.out.print("* ");
				} else {

					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
