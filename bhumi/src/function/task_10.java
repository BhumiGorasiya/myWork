package function;

import java.util.Scanner;

//Write a Java method to display the middle character of a string
//Note: 
//a) If the length of the string is even there will be two middle characters.
//b) If the length of the string is odd there will be one middle character.

public class task_10 {
	
	public static void main(String[] args) {
		int str;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter value of str :");
		str = scanner.nextInt();
		
		System.out.println("middle character in the String :"+ middle(str));
		 
	}
	
	static String middle(String str)
	{
		int position;
		int length;
		
		if(str.length()% 2==0)
		{
			position = str.length()/2-1;
			length = 2;
		}else {
			
			position = str.length()/2;
			length = 1;
		}
		return str.substring(position, position + length);
	}

}
