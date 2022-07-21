package bhumi;

public class FirstProgram {
	
	public static void main(String[] args) {
		
		int num1= 45;
		int num2=25;
		int sum = num1+num2;
	
	
		System.out.println("num1="+45);
		System.out.println("25");
		
		System.out.println("num1="+num2);
		System.out.println(sum);
		
		int diff= num1-num2;
		System.out.println(diff);
		 
		int mul= num1*num2;
		System.out.println(mul);
		
		int div= num1/num2;
	 	System.out.println(div);
	 	
	 	System.out.println("aditional=" +(num1+num2));
	 	System.out.println("division=" +(num1/num2));
	 	System.out.println("multiplication=" +(num1*num2));
	 	System.out.println("subtraction=" +(num1-num2));
	 	System.out.println("modulus=" +(num1%num2));
	 	
	 	// +=, -=, *=, /=, %=
	 	
	 	// num1 = num1+10;
	 	num1%=10;
	 	
	 	// int result = num1*10;
	 	
	 	System.out.println("value of num1 = "+num1);

	 	// ++ and --
	 	
	 	num2++;				// increase value by 1
	 	
	 	System.out.println("value of num2 :"+num2);
	 	
	 	//==, !=, >, <, >=, <=
	 	
	 	num1 = 12;
	 	num2 = 12;
	 	
	 	System.out.println("equals : "+(num1==num2));   //12=12
	 	System.out.println("greater than : "+(num1>num2));    //12>11
	 	System.out.println("greater than : "+(num1>=num2));		//12>=12
	 	System.out.println("not equals : "+(num1!=num2));		//13
	 	
	 	
		
		String name= "tops";
		char ch= '@';
		float f = 34.25f;
		
		System.out.println("tops");
		System.out.println('@');
		System.out.println(34.25);
	}

}
	


