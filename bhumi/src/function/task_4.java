package function;

import java.util.Scanner;
//Write a Java method to check whether a year (integer) entered by the user is a leap year or not. Go to the editor
// without return type and with parameter

public class task_4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter year: ");
		
		int year = scanner.nextInt();
		leepYear(year);
		 
		
	}


  static void leepYear(int year) 
  {
	  if(year % 400 == 0)
	  {
		  System.out.println(year +" is a leep year");
		  
	  }else if(year % 100 == 0)
	  {
		  System.out.println(year +" is a leep year");
	  }else if (year % 4 == 0)
	  {
		  System.out.println(year +" is a leep year");
	  }else 
	  {
		  System.out.println(year +"is not a leep year");
	  }
		 
  }



}
