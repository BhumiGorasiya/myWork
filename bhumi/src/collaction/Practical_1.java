package collaction;

import java.util.ArrayList;
import java.util.Collections;

public class Practical_1 {
	
	public static void main(String[] args) {
		
		//Array
		int number[] = new int [10];
		String[] colors = {"Red", "Green", "Blue", "Black", "White", "Orange"};
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		
		ArrayList<String> colorList = new ArrayList<String>();
		colorList.add("Red");
		colorList.add("Black");
		colorList.add("Bule");
		colorList.add("Orange");
		colorList.add("Yellow");
		
		//size
		System.out.println("Size of List : "+colorList.size());
		
		//remove based on index
		colorList.remove(3);
		System.out.println("Size of List after Remove : "+colorList.size());
		
		//Read All Elements
		for(String Color : colorList) {
			System.out.println(Color);
		}
		
		System.out.println("*******************************************************");
		
		//update
		colorList.set(1, "Purple");
		

		// Read data using for loop
		for(int i=0; i<colorList.size(); i++)
		{
			String color = colorList.get(i);					// read element
			System.out.println(color);
		}
		
		colorList.add(2, "Green");
		System.out.println(colorList);
		
		//add all
		ArrayList<String> list = new ArrayList<String>();
		list.add("Black");
		list.add("Red");
		
		colorList.addAll(2, list);
		System.out.println(colorList);
		
		//clear
		//colorList.clear();						//remove all data from list
		
		if(colorList.contains("Black"))
		{
			System.out.println("List contains this value");
		}else {
			System.out.println("List does not contains");
		}
		
		//indexOf
		System.out.println(colorList.indexOf("Black"));
		
		//last indexOf
		String str = "c:\\temp\\temp.txt";
		System.out.println(str.substring(str.lastIndexOf('\\')+1));
		
		//replace
		Collections.replaceAll(colorList, "Black", "BLACK");
		System.out.println(colorList);
		
		
	}

}
