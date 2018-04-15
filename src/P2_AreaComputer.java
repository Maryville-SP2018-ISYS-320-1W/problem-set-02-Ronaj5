/*
	ISYS 320
	Name(s):
	Date: 
*/

public class P2_AreaComputer {

	public static void main(String[] args) {
		double side1, side2, side3, result;
		side1 = 9;
		side2 = 6.4;
		side3 = 8.1;
		result = triangleArea (side1, side2, side3);
		
		System.out.println(result);
		
	}
	
	public static double triangleArea (double side1, double side2, double side3) {
		
		double area, s;
		
		s = (side1 + side2 + side3) / 2;
		
		area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		
		return area;
	}
}

