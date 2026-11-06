package basicUnderstanding;

import java.util.ArrayList;

public class ArrayLists {

	public static void main(String[] args) {
		ArrayList <Integer> list = new ArrayList<>(3);
		list.add(827);
		list.add(82736);
		list.add(29837);
		list.add(24); //.add is a function by the way
		//Here even tho, you have an array of 3, you can call and add as much as you want
		//since this is called dynamic array
		System.out.println(list);
		System.out.println(list.contains(821));
		//.cotains give you whether the particualr value is available
		
		list.set(0, 172);//This will change the 0th index to 172
		System.out.println(list);
		list.remove(3);//This will remove 3rd index value
		System.out.println(list);
	}
}
