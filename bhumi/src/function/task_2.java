package function;

//Write a Java method to compute the average of three numbers.

public class task_2 {
	
	public static void main(String[] args) {
		
		int num1 = 25;
		int num2 = 45;
		int num3 = 67;
		
		System.out.println("The average value is :"+ average(num1, num2, num3));
		
	}

	
	 
	static int average (int num1, int num2, int num3)
	{
		return  (num1 + num2 + num3)/3;
	
	}
	
	
	
	

}
