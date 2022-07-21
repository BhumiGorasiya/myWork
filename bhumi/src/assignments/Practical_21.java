package assignments;

import java.util.ArrayList;

// WAP to update and remove specific array element by given element.

public class Practical_21 {
	public static void main(String[] args) {
		 
        ArrayList<String> colors = new ArrayList<>();
 
        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("White");
        colors.add("Black");
 
 
        colors.set(0,"Gray");
        System.out.println(colors.get(0));
        
        colors.remove(2);
        System.out.println(colors);
 
    }

}
