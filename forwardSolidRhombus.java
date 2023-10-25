/*
 * 	Forward Solid Rhombus
 * 	        # # # # #
 * 	      # # # # #
 * 	    # # # # #
 * 	  # # # # #
 * 	# # # # #
 */

import java.util.Scanner;

public class forwardSolidRhombus {

	public static void main(String ...args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter n: ");

		int n = input.nextInt();

		for(int i = 1; i <= n; i++) {

			for(int j = n; j > i; j--) {

				System.out.print("  ");
			}
			for(int k = 0; k < n; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
