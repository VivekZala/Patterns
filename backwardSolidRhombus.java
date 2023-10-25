/*
 * 	Backword Solid Rhombus.
 * 	# # # # #
 * 	  # # # # #
 * 	    # # # # #
 * 	      # # # # #
 * 	        # # # # #
 */

import java.util.Scanner;

public class backwardSolidRhombus {

	public static void main(String ...args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter n: ");

		int n = input.nextInt();

		for(int i = 0; i < n; i++) {

			for(int j = 0; j < i; j++) {

				System.out.print("  ");
			}
			for(int k = 0; k < n; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
