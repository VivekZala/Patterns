/*
 * 	Solid Rectangle
 * 	# # # # # # # #
 * 	# # # # # # # #
 * 	# # # # # # # #
 * 	# # # # # # # #
 */

import java.util.Scanner;

public class solidRectangle {

	public static void main(String ...args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter n: ");
		
		int n = input.nextInt();

		for(int i = 0; i < n; i++) {

			for(int j = 0; j < 2 * n; j++) {

				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
