package _00_intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList (java.util) class
		ArrayList<String> arr = new ArrayList<String>();
		//2. Add five Strings to your list
		arr.add("Hello");
		arr.add("My name is Joshua.");
		arr.add("I like to code.");
		arr.add("Brawl Stars is fun!");
		arr.add("Life is good.");
		//3. Print all the Strings using a standard for-loop
		for (int i = 0; i < 5; i++) {
			String s = arr.get(i);
			System.out.println(s);
		}
		for (String s : arr) {
			System.out.println(s);
		}
		//4. Print all the Strings using a for-each loop
		
		//5. Print only the even numbered elements in the list.
		for (int i = 0; i < 5; i+=2) {
			String s = arr.get(i);
			System.out.println(s);
		}
		//6. Print all the Strings in reverse order.
		for (int i = 4; i >= 0; i--) {
			String s = arr.get(i);
			System.out.println(s);
		}
		//7. Print only the Strings that have the letter 'e' in them.
		for (int i = 0; i < 5; i++) {
			boolean good = false;
			String s = arr.get(i);
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(j) == 'e') {
					good = true;
					break;
				}
			}
			if (good) {
				System.out.println(s);
			}
		}
	}
}
