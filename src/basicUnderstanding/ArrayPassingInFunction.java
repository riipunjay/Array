package basicUnderstanding;

import java.util.Arrays;

public class ArrayPassingInFunction {
	
	public static void main(String[] args) {
		int a[] = new int[] {12,34,34,562,562,1};
		System.out.println(Arrays.toString(a)); 
		changeArray(a);
		System.out.println(Arrays.toString(a));
	}
	
	static void changeArray(int[] b) {
		b[0] = 923;	
	}
/*Array is mutable in nature, unlike String. since a and b are pointing to the same objects,
 * you can change the value of the array
 * */
}
