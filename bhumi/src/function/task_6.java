package function;

import java.util.Scanner;

//Write a Java method to count all vowels in a string. Go to the editor.
// with return type and with parameter

public class task_6 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Write the Sring :");
		String name = scanner.nextLine();
		System.out.println("number of vowels in the string :"+ vowels(name)+"\n");
		
	}

	
	static int vowels(String words)
	{
		int count = 0;
			
			for(int i = 0; i<words.length(); i++)
			{
				if (words.charAt(i) == 'a' || words.charAt(i) == 'e' || words.charAt(i) == 'i' || words.charAt(i) == 'o' || words.charAt(i)=='u')
				{
					count++;
				}
			}
			return count;
	}
}
