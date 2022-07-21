package looping;
// WAP to check whether a number is divisible by 5 and 11 
public class practice_5 {
	
	public static void main(String[] args) {
		
		for(int i = 20; i<=40; i++)
		{
			if(i%5==0 || i%11==0)
			{
				System.out.println(i+"= true");
			}else {
				System.out.println(i+"= false");
			}
		}
		
		
		
		
	}

}
