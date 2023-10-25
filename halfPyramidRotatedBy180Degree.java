/*
 * 	Half Pyramid rotated by 180 degree.
 *	          #
 *	        # #
 *	      # # #
 *	    # # # #
 *	  # # # # #
 */

import java.util.Scanner;

public class halfPyramidRotatedBy180Degree {

	public static void main(String ...args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter n: ");

		int n = input.nextInt();

		for(int i = 1; i <= n; i++) {

			for(int j = 0; j < n; j++) {

				if(j < n - i) {

					System.out.print("  ");
				} else {

					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
}
