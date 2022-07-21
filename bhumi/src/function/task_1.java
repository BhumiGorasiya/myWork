package function;

// Write a Java method to find the smallest number among three numbers.
//with return type and with parameter

public class task_1 {
	public static void main(String[] args) {
		
	
	
	//String k = smallest(25,37,29);
		System.out.println(smallest(25,37,29));
	
	
	
	}

  
 static String smallest (int num1, int num2, int num3)
 {
	 String result = "";
	  
	 if(num1<num2)
	 {
		 
		 	if(num1<num3) 
		 	{
		 		result = num1+" is smallest";
		 	}else {
		 		result = num3+" is smallest";
		 	}
	 }else {
		 
		 	if(num2<num3)
		 	{
		 		result = num2+" is smallest";
		 	}else {
		 		result = num3+" is smallest";
		 	}
		 	
		 
		 	
	 }
	 return result;
	 
 }
}