import java.util.Scanner;

/*
	ISYS 320
	Name(s): Rona Davis	
	Date: April 15, 2018
*/

public class P5_StairMaster {

	public static final int Height = 10;
	static int Width = 8;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int height;
		int width;

		System.out.println("How many stairs in your staircase? ");
		height = input.nextInt();

		System.out.println("How wide should each stair be? ");
		width = input.nextInt();

		drawStairs(height, width);
	}

	public static void drawStairs(int height, int width) {

		for (int x = 0; x < (width + 2); x++) {
			System.out.print("*");
		}
		System.out.println();

		for (int x = 0; x < (width + 2); x++) {
			System.out.print("*");
		}
		System.out.println();

		for (int x = 0; x < (height - 1); x++) {

			for (int y = 0; y < 2; y++) {
				System.out.print("**");

				for (int z = 0; z < (width + (x * width)); z++) {
					System.out.print(" ");
				}
				for (int z = 0; z < (width); z++) {
					System.out.print("*");
				}
				System.out.println();

			}
		}
	}
}