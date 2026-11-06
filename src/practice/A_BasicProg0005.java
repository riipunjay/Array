package practice;

import java.util.Arrays;

//Swapping a value in an array
public class A_BasicProg0005 {

	public static void main(String[] args) {
		
		int a[] = {12,23,45,67};
		swap(a, 0, 2);
		System.out.println(Arrays.toString(a));
	}
	
	static void swap(int [] a, int index1, int index2) {
		int temp = a[index1];
		a[index1] = a[index2];
		a[index2] = temp;
	}
}
