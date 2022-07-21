package assignments;
// W.A.J.P to Take three numbers from the user and print the greatest number. 

public class Practical_1 {

	public static void main(String[] args) {
		

		
		System.out.println(Largest(25,45,12));
	}
	
	
	static String Largest(int num1, int num2, int num3)
	{
		String  result = "";
		
		if(num1>num2) 
		{
				if(num1>num3) 
				{
					result = num1+" is largest";
				}else {
					result = num3+" is largest";
				}
		}else 
		{
				if(num2>num3)
				{
					result = num2+" is largest";
				}else {
					result = num3+" is largest";
				}
		}
		
			
		return result;
	
	}	
	
}



