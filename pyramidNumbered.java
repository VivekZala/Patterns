/*
 * 	Numbered Pyramid
 * 	    1
 *	   2 2
 *	  3 3 3
 * 	 4 4 4 4 
 *	5 5 5 5 5
 */

import java.util.Scanner;

public class pyramidNumbered {

	public static void main(String ...args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter n: ");

		int n = input.nextInt();

		for(int i = 1; i <= n; i++) {

			for(int j = 0; j < n - i; j++) {
				
				System.out.print("  ");
			}
			for(int k = 0; k < i; k++) {
				
				System.out.print(i + "   ");
			}
			System.out.println();
		}
	}
}
