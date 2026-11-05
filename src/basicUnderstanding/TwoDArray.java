package basicUnderstanding;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArray {
	public static void main(String[] args) {

		int a[][] = new int[3][]; //Adding the Rows is mandatory, Coloum we can leave and no compiler problem would occur
		
		int arr2D[][] = {
				{1,2,3},
				{4,5},
				{7,8,6,9}
				//Each array itself is a different object, they can vary
		};
		
		System.out.println(Arrays.toString(arr2D));
		
		//Input for 2D array
		Scanner sc = new Scanner(System.in);
		int arr[][] = new int [3][3];
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		//Output
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
