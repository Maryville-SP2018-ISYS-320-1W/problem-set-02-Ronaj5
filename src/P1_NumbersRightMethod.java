/*
	ISYS 320
	Name(s):
	Date: 
*/

public class P1_NumbersRightMethod {

	public static void main(String[] args) {
		int height = 7;
		drawNumbersRight(height);	
		
}
	public static void drawNumbersRight (int val) {
		
		
		for( int i = 1; i<= val; i++ ) {
		 
			for(int j = 1; j<= (val-i); j++) {
				System.out.print(" ");
			}
			
			for( int j = 1; j<=i; j++ ) {
			 System.out.print(i);
			}
			
		System.out.println();
	}
}

}
