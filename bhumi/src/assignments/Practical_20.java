package assignments;

import java.util.ArrayList;

// WAP to iterate through all elements in an array list. 


public class Practical_20 {
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		  list.add("Red");
		  list.add("Green");
		  list.add("Orange");
		  list.add("White");
		  list.add("Black");
		  // Print the list
		  for (String element : list) { 
		    System.out.println(element);
		    }

		
	}

}
