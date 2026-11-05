package basicUnderstanding;

import java.util.Arrays;
import java.util.Scanner;

public class SimpleTask {

	//This program helps us learn about initialization, decalration, 
	//assigning values in the array and many more things.

	public static void main(String[] args) {
		int [] num; //Declaration of an array. 
		//num here is getting defined in the stack memory
		//Happening at compile time
		
		num = new int[3]; //Initialization of an array
		//Object is being created here in the heap memory
		//Happening at Run time, also called Dynamic Memory Allocation
		
		int [] num2 = new int[4];
		//This way array num2 is created and initialized at same time
		
	num2[0] = 12;
	num2[1] = 38;
	num2[2] = 19;
	num2[3] = 28;
	
	System.out.println(num2[2]);
	
	//Now see input of array using loops
	int sum [] = new int[5];
	Scanner sc = new Scanner(System.in);
	for(int i = 0; i<sum.length; i++) {
		sum[i] = sc.nextInt();
	}
		System.out.println(Arrays.toString(sum));
		
	}
}
