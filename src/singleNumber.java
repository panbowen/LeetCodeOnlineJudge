/*
 * Questions: Given an array of integers, every element appears twice except for one. Find that single one.
 * 
 * Solutions: Use the Java "^" operations
 * 
 * Details:
 * 
 * 0 ^ n = n; n ^ n = 0;
 * 
 *  0100:4
 *  0110:6  (^)
 *  0010:2
 * 
 * 4 ^ 6 = 2
 * 
 * a^b^c = a^c^b
 * thus two interact with each other, only left the single one
 * 
 */

public class singleNumber {

	public static int singleNumber(int[] A){
		int XOR = 0;
		for(int i = 0; i< A.length; i++)
			XOR ^= A[i];
		return XOR;
	}
	
	public static void main(String[] args){
		int[] A = new int[]{1,2,3,4,5,5,4,3,2,1,100};
		System.out.println("The single value is " + singleNumber(A));
	}
}
