/*
 * 	Palindromic Numbered Pyramid
 * 		    1
 * 	      2	1 2
 *	    3 2	1 2 3
 * 	  4 3 2	1 2 3 4
 * 	5 4 3 2	1 2 3 4 5
 */

import java.util.Scanner;

public class pyramidPalindromicNumbered {

	public static void main(String ...args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter n: ");

		int n = input.nextInt();

		for(int i = 1; i <= n; i++) {

			for(int j = 0; j < n - i; j++) {

				System.out.print("  ");
			}
			int x = i;
			for(int k = 0; k < (i * 2) - 1; k++) {

				if(x == 1) { 
					for(int z = 0; z < ((i * 2) - 1) / 2; z++)
						System.out.print((x++) + "   ");
					break;
				}
				else
					System.out.print((x--) + "   ");
			}
			System.out.println();
		}
	}
}
