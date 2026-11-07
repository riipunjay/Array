package practice;

public class A_BasicProg0007 {

	//Program to find the maximum value of array from index 1 to 4
	public static void main(String[] args) {
		int a[] = {12,344,56,7,89,765,68,435};
		
		System.out.println(findMax(a, 2, 4));
		
	}
	
	static int findMax(int []a, int start, int end) {
		int max = a[start];
		
		for(int i = start; i<= end; i++) {
			if(a[i]>max) {
				max = a[i];
			}
		}
		return max;
	}
}
