package practice;

public class A_BasicProg0006 {
//Finding the maximum value in an array
	public static void main(String[] args) {
		int a[] = {14,56,89,54};
		System.out.println(findMax(a));
	}
	
	static int findMax(int[] a) {
		int max = a[0];
		for(int i = 1; i<a.length; i++) {
			if(a[i]> max) {
				max = a[i];
			}
		}
		return max;
	}
}
