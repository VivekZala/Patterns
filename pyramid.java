/*
 * 	Pyramid
 * 	    *
 * 	   * *
 * 	  * * *
 * 	 * * * *
 * 	* * * * *
 */

import java.util.Scanner;

public class pyramid {

	public static void main(String ...args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter n: ");

		int n = input.nextInt();

		for(int i = 1; i <= n; i++) {

			for(int j = 0; j < n - i; j++) {

				System.out.print("  ");
			}
			for(int k = 0; k < i; k++) {
				System.out.print("*   ");
			}
			System.out.println();
		}
	}
}

