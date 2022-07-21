package collaction;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Practical_3 {
	public static void main(String[] args) {
		
		ArrayList<Integer> numList = new ArrayList<Integer>();
		numList.add(12);
		numList.add(178);
		numList.add(14);
		numList.add(1);
		numList.add(36);
		
		Collections.sort(numList);
		Collections.sort(numList, Collections.reverseOrder());
		
		System.out.println(numList);
		
		ArrayList<String> colorList = new ArrayList<String>();
		colorList.add("Yellow");
		colorList.add("Black");		
		colorList.add("Bule");		
		colorList.add("Red");		
		colorList.add("Orange");
		
		Collections.sort(colorList);
		System.out.println(colorList);
	
	}

}
