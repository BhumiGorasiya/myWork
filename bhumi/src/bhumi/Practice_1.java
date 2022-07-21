package bhumi;

// WAP to find out largest number from given three number;
//nested if statement (condition within condition)

public class Practice_1 {
	
	public static void main(String[] args) {
		
		int num1 = 25;
		int num2 = 46;
		int num3 = 68;
		
		if (num1>num2)
		{
			
				if (num1>num3)
				{
						System.out.println(num1+ " is largest");
				}else {
						System.out.println(num3+ " is largest");
						
				}
		}else {
			
				if (num2>num3)
				{
						System.out.println(num2+ " is largest");
						
				}else {
						System.out.println(num3+ " is largest");
				}
		}
		
			
		
		
	
	}

		 
	}


