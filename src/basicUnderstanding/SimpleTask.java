package basicUnderstanding;

import java.util.Arrays;
import java.util.Scanner;

public class SimpleTask {

	// This program helps us learn about initialization, decalration,
	// assigning values in the array and many more things.

	public static void main(String[] args) {
		int[] num; // Declaration of an array.
		// num here is getting defined in the stack memory
		// Happening at compile time

		num = new int[3]; // Initialization of an array
		// Object is being created here in the heap memory
		// Happening at Run time, also called Dynamic Memory Allocation

		int[] num2 = new int[4];
		// This way array num2 is created and initialized at same time

		num2[0] = 12;
		num2[1] = 38;
		num2[2] = 19;
		num2[3] = 28;

		System.out.println(num2[2]);
		
		//modify values
		num2[2] = 28374;
		System.out.println("Num2 is modified");
		System.out.println(num2[2]);

		// Now see input of array using loops
		int sum[] = new int[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < sum.length; i++) {
			sum[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(sum));

		// For Each Loop
		System.out.println("Using for each loop");
		
		for (int num3 : sum) { //For every element in the array, print the element
			System.out.print(num3 + " "); //Here num3 represents element of the array
		}
		
		
		//Array of string
		
		String str []= new String[4];
		for(int i=0; i<str.length; i++) {
			str[i] = sc.next();
		}
		
		System.out.println(Arrays.toString(str));
		
	}
}
