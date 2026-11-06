package practice;

public class A_BasicProg0004 {

	//Find the sum of all elements.
	public static void main(String[] args) {
		int a[] = new int[] {12,24,1,2,3,4,5};
		int sum = 0;
		for(int i = 0; i<a.length;i++) {
			sum = sum + a[i];
			
		}
		System.out.println(sum);
	}
}
