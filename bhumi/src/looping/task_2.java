package looping;

public class task_2 {

	public static void main(String[] args) {
		
		
		for(int i=5; i>=1; i--)
		{
			int num=5;
			for(int j= 5; j>=i; j--)
				{
						System.out.print(num+" ");
						num--;
						
				}
			System.out.println();
		}
		
	}
}
