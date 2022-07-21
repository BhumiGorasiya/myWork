package looping;

public class pattern_4 {

	public static void main(String[] args) {
		
		int n = 1;
		for(int i=1; i<=5;i++)
		{
				for(int j=1; j<=i; j++)
				{
					
					if(n%2==0)
					{
						System.out.print("0");
					}else {
						System.out.print("1");
					}
					
					n++;
				}
			
			System.out.println();
		}
		
		
	}
}
