package practice;

public class A_BasicProg0002 {

	//Print array elements in reverse order.
	public static void main(String[] args) {
		
		int a [] = new int [] {12,32,45,67,86};
		for(int i = a.length-1; i>=0; i--) {
			System.out.print(a[i] + " ");
		}
	}
}
