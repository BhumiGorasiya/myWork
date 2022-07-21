package looping;
//WAP to print 1-10 using while loop

public class whileloop {

	public static void main(String[] args) {
		
		int num = 1, sum = 0;
		
		while(num<=10)    							// 1<=10
		{
			
				System.out.println(num);
				
				sum = sum+num;
				
				num++; 
				
				System.out.println("summation :"+sum);
		}
		
	}
}