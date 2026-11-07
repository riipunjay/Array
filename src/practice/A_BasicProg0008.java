package practice;

//Find the average of array elements.
public class A_BasicProg0008 {
	public static void main(String[] args) {
		float a[] = {2, 3, 5, 7, 8, 2,19,24,56,32,78 };
		float sum = 0f;
		float len = a.length;

		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		System.out.println("The average for Array is: " +sum/len);
		
	}
}
